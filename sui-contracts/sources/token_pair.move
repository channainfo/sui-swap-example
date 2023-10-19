// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module sui_swap_example::token_pair {
    use std::option;
    use std::string::String;
    use sui::balance::Balance;
    use sui::event;
    use sui::object::{Self, ID, UID};
    use sui::table;
    use sui::transfer;
    use sui::tx_context::TxContext;
    use sui_swap_example::liquidity::{Self, Liquidity};
    friend sui_swap_example::token_pair_initialize_liquidity_logic;
    friend sui_swap_example::token_pair_add_liquidity_logic;
    friend sui_swap_example::token_pair_remove_liquidity_logic;
    friend sui_swap_example::token_pair_swap_x_logic;
    friend sui_swap_example::token_pair_swap_y_logic;
    friend sui_swap_example::token_pair_aggregate;

    const EIdAlreadyExists: u64 = 101;
    const EDataTooLong: u64 = 102;
    const EInappropriateVersion: u64 = 103;
    const EIdNotFound: u64 = 106;

    struct TokenPair<phantom X, phantom Y> has key {
        id: UID,
        version: u64,
        x_reserve: Balance<X>,
        y_reserve: Balance<Y>,
        total_liquidity: u64,
        liquidities: table::Table<address, Liquidity>,
    }

    public fun id<X, Y>(token_pair: &TokenPair<X, Y>): object::ID {
        object::uid_to_inner(&token_pair.id)
    }

    public fun version<X, Y>(token_pair: &TokenPair<X, Y>): u64 {
        token_pair.version
    }

    public(friend) fun borrow_x_reserve<X, Y>(token_pair: &TokenPair<X, Y>): &Balance<X> {
        &token_pair.x_reserve
    }

    public(friend) fun borrow_mut_x_reserve<X, Y>(token_pair: &mut TokenPair<X, Y>): &mut Balance<X> {
        &mut token_pair.x_reserve
    }

    public(friend) fun borrow_y_reserve<X, Y>(token_pair: &TokenPair<X, Y>): &Balance<Y> {
        &token_pair.y_reserve
    }

    public(friend) fun borrow_mut_y_reserve<X, Y>(token_pair: &mut TokenPair<X, Y>): &mut Balance<Y> {
        &mut token_pair.y_reserve
    }

    public fun total_liquidity<X, Y>(token_pair: &TokenPair<X, Y>): u64 {
        token_pair.total_liquidity
    }

    public(friend) fun set_total_liquidity<X, Y>(token_pair: &mut TokenPair<X, Y>, total_liquidity: u64) {
        token_pair.total_liquidity = total_liquidity;
    }

    public(friend) fun add_liquidity<X, Y>(token_pair: &mut TokenPair<X, Y>, liquidity: Liquidity) {
        let key = liquidity::provider(&liquidity);
        assert!(!table::contains(&token_pair.liquidities, key), EIdAlreadyExists);
        table::add(&mut token_pair.liquidities, key, liquidity);
    }

    public(friend) fun remove_liquidity<X, Y>(token_pair: &mut TokenPair<X, Y>, provider: address) {
        assert!(table::contains(&token_pair.liquidities, provider), EIdNotFound);
        let liquidity = table::remove(&mut token_pair.liquidities, provider);
        liquidity::drop_liquidity(liquidity);
    }

    public(friend) fun borrow_mut_liquidity<X, Y>(token_pair: &mut TokenPair<X, Y>, provider: address): &mut Liquidity {
        table::borrow_mut(&mut token_pair.liquidities, provider)
    }

    public fun borrow_liquidity<X, Y>(token_pair: &TokenPair<X, Y>, provider: address): &Liquidity {
        table::borrow(&token_pair.liquidities, provider)
    }

    public fun liquidities_contains<X, Y>(token_pair: &TokenPair<X, Y>, provider: address): bool {
        table::contains(&token_pair.liquidities, provider)
    }

    public fun liquidities_length<X, Y>(token_pair: &TokenPair<X, Y>): u64 {
        table::length(&token_pair.liquidities)
    }

    public(friend) fun new_token_pair<X, Y>(
        total_liquidity: u64,
        ctx: &mut TxContext,
    ): TokenPair<X, Y> {
        TokenPair {
            id: object::new(ctx),
            version: 0,
            x_reserve: sui::balance::zero(),
            y_reserve: sui::balance::zero(),
            total_liquidity,
            liquidities: table::new<address, Liquidity>(ctx),
        }
    }

    struct LiquidityInitialized has copy, drop {
        id: option::Option<object::ID>,
        exchange_id: ID,
        provider: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
        liquidity_amount: u64,
    }

    public fun liquidity_initialized_id(liquidity_initialized: &LiquidityInitialized): option::Option<object::ID> {
        liquidity_initialized.id
    }

    public(friend) fun set_liquidity_initialized_id(liquidity_initialized: &mut LiquidityInitialized, id: object::ID) {
        liquidity_initialized.id = option::some(id);
    }

    public fun liquidity_initialized_exchange_id(liquidity_initialized: &LiquidityInitialized): ID {
        liquidity_initialized.exchange_id
    }

    public fun liquidity_initialized_provider(liquidity_initialized: &LiquidityInitialized): address {
        liquidity_initialized.provider
    }

    public fun liquidity_initialized_x_token_type(liquidity_initialized: &LiquidityInitialized): String {
        liquidity_initialized.x_token_type
    }

    public fun liquidity_initialized_y_token_type(liquidity_initialized: &LiquidityInitialized): String {
        liquidity_initialized.y_token_type
    }

    public fun liquidity_initialized_x_amount(liquidity_initialized: &LiquidityInitialized): u64 {
        liquidity_initialized.x_amount
    }

    public fun liquidity_initialized_y_amount(liquidity_initialized: &LiquidityInitialized): u64 {
        liquidity_initialized.y_amount
    }

    public fun liquidity_initialized_liquidity_amount(liquidity_initialized: &LiquidityInitialized): u64 {
        liquidity_initialized.liquidity_amount
    }

    public(friend) fun new_liquidity_initialized<X, Y>(
        exchange_id: ID,
        provider: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
        liquidity_amount: u64,
    ): LiquidityInitialized {
        LiquidityInitialized {
            id: option::none(),
            exchange_id,
            provider,
            x_token_type,
            y_token_type,
            x_amount,
            y_amount,
            liquidity_amount,
        }
    }

    struct LiquidityAdded has copy, drop {
        id: object::ID,
        version: u64,
        provider: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
        liquidity_amount: u64,
    }

    public fun liquidity_added_id(liquidity_added: &LiquidityAdded): object::ID {
        liquidity_added.id
    }

    public fun liquidity_added_provider(liquidity_added: &LiquidityAdded): address {
        liquidity_added.provider
    }

    public fun liquidity_added_x_token_type(liquidity_added: &LiquidityAdded): String {
        liquidity_added.x_token_type
    }

    public fun liquidity_added_y_token_type(liquidity_added: &LiquidityAdded): String {
        liquidity_added.y_token_type
    }

    public fun liquidity_added_x_amount(liquidity_added: &LiquidityAdded): u64 {
        liquidity_added.x_amount
    }

    public fun liquidity_added_y_amount(liquidity_added: &LiquidityAdded): u64 {
        liquidity_added.y_amount
    }

    public fun liquidity_added_liquidity_amount(liquidity_added: &LiquidityAdded): u64 {
        liquidity_added.liquidity_amount
    }

    public(friend) fun new_liquidity_added<X, Y>(
        token_pair: &TokenPair<X, Y>,
        provider: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
        liquidity_amount: u64,
    ): LiquidityAdded {
        LiquidityAdded {
            id: id(token_pair),
            version: version(token_pair),
            provider,
            x_token_type,
            y_token_type,
            x_amount,
            y_amount,
            liquidity_amount,
        }
    }

    struct LiquidityRemoved has copy, drop {
        id: object::ID,
        version: u64,
        liquidity_amount: u64,
        provider: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
    }

    public fun liquidity_removed_id(liquidity_removed: &LiquidityRemoved): object::ID {
        liquidity_removed.id
    }

    public fun liquidity_removed_liquidity_amount(liquidity_removed: &LiquidityRemoved): u64 {
        liquidity_removed.liquidity_amount
    }

    public fun liquidity_removed_provider(liquidity_removed: &LiquidityRemoved): address {
        liquidity_removed.provider
    }

    public fun liquidity_removed_x_token_type(liquidity_removed: &LiquidityRemoved): String {
        liquidity_removed.x_token_type
    }

    public fun liquidity_removed_y_token_type(liquidity_removed: &LiquidityRemoved): String {
        liquidity_removed.y_token_type
    }

    public fun liquidity_removed_x_amount(liquidity_removed: &LiquidityRemoved): u64 {
        liquidity_removed.x_amount
    }

    public fun liquidity_removed_y_amount(liquidity_removed: &LiquidityRemoved): u64 {
        liquidity_removed.y_amount
    }

    public(friend) fun new_liquidity_removed<X, Y>(
        token_pair: &TokenPair<X, Y>,
        liquidity_amount: u64,
        provider: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
    ): LiquidityRemoved {
        LiquidityRemoved {
            id: id(token_pair),
            version: version(token_pair),
            liquidity_amount,
            provider,
            x_token_type,
            y_token_type,
            x_amount,
            y_amount,
        }
    }

    struct XSwappedForY has copy, drop {
        id: object::ID,
        version: u64,
        sender: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
    }

    public fun x_swapped_for_y_id(x_swapped_for_y: &XSwappedForY): object::ID {
        x_swapped_for_y.id
    }

    public fun x_swapped_for_y_sender(x_swapped_for_y: &XSwappedForY): address {
        x_swapped_for_y.sender
    }

    public fun x_swapped_for_y_x_token_type(x_swapped_for_y: &XSwappedForY): String {
        x_swapped_for_y.x_token_type
    }

    public fun x_swapped_for_y_y_token_type(x_swapped_for_y: &XSwappedForY): String {
        x_swapped_for_y.y_token_type
    }

    public fun x_swapped_for_y_x_amount(x_swapped_for_y: &XSwappedForY): u64 {
        x_swapped_for_y.x_amount
    }

    public fun x_swapped_for_y_y_amount(x_swapped_for_y: &XSwappedForY): u64 {
        x_swapped_for_y.y_amount
    }

    public(friend) fun new_x_swapped_for_y<X, Y>(
        token_pair: &TokenPair<X, Y>,
        sender: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
    ): XSwappedForY {
        XSwappedForY {
            id: id(token_pair),
            version: version(token_pair),
            sender,
            x_token_type,
            y_token_type,
            x_amount,
            y_amount,
        }
    }

    struct YSwappedForX has copy, drop {
        id: object::ID,
        version: u64,
        sender: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
    }

    public fun y_swapped_for_x_id(y_swapped_for_x: &YSwappedForX): object::ID {
        y_swapped_for_x.id
    }

    public fun y_swapped_for_x_sender(y_swapped_for_x: &YSwappedForX): address {
        y_swapped_for_x.sender
    }

    public fun y_swapped_for_x_x_token_type(y_swapped_for_x: &YSwappedForX): String {
        y_swapped_for_x.x_token_type
    }

    public fun y_swapped_for_x_y_token_type(y_swapped_for_x: &YSwappedForX): String {
        y_swapped_for_x.y_token_type
    }

    public fun y_swapped_for_x_x_amount(y_swapped_for_x: &YSwappedForX): u64 {
        y_swapped_for_x.x_amount
    }

    public fun y_swapped_for_x_y_amount(y_swapped_for_x: &YSwappedForX): u64 {
        y_swapped_for_x.y_amount
    }

    public(friend) fun new_y_swapped_for_x<X, Y>(
        token_pair: &TokenPair<X, Y>,
        sender: address,
        x_token_type: String,
        y_token_type: String,
        x_amount: u64,
        y_amount: u64,
    ): YSwappedForX {
        YSwappedForX {
            id: id(token_pair),
            version: version(token_pair),
            sender,
            x_token_type,
            y_token_type,
            x_amount,
            y_amount,
        }
    }


    public(friend) fun transfer_object<X, Y>(token_pair: TokenPair<X, Y>, recipient: address) {
        assert!(token_pair.version == 0, EInappropriateVersion);
        transfer::transfer(token_pair, recipient);
    }

    public(friend) fun update_version_and_transfer_object<X, Y>(token_pair: TokenPair<X, Y>, recipient: address) {
        update_object_version(&mut token_pair);
        transfer::transfer(token_pair, recipient);
    }

    public(friend) fun share_object<X, Y>(token_pair: TokenPair<X, Y>) {
        assert!(token_pair.version == 0, EInappropriateVersion);
        transfer::share_object(token_pair);
    }

    public(friend) fun update_version_and_share_object<X, Y>(token_pair: TokenPair<X, Y>) {
        update_object_version(&mut token_pair);
        transfer::share_object(token_pair);
    }

    public(friend) fun freeze_object<X, Y>(token_pair: TokenPair<X, Y>) {
        assert!(token_pair.version == 0, EInappropriateVersion);
        transfer::freeze_object(token_pair);
    }

    public(friend) fun update_version_and_freeze_object<X, Y>(token_pair: TokenPair<X, Y>) {
        update_object_version(&mut token_pair);
        transfer::freeze_object(token_pair);
    }

    public(friend) fun update_object_version<X, Y>(token_pair: &mut TokenPair<X, Y>) {
        token_pair.version = token_pair.version + 1;
        //assert!(token_pair.version != 0, EInappropriateVersion);
    }

    public(friend) fun drop_token_pair<X, Y>(token_pair: TokenPair<X, Y>) {
        let TokenPair {
            id,
            version: _version,
            x_reserve,
            y_reserve,
            total_liquidity: _total_liquidity,
            liquidities,
        } = token_pair;
        object::delete(id);
        sui::balance::destroy_zero(x_reserve);
        sui::balance::destroy_zero(y_reserve);
        table::destroy_empty(liquidities);
    }

    public(friend) fun emit_liquidity_initialized(liquidity_initialized: LiquidityInitialized) {
        event::emit(liquidity_initialized);
    }

    public(friend) fun emit_liquidity_added(liquidity_added: LiquidityAdded) {
        event::emit(liquidity_added);
    }

    public(friend) fun emit_liquidity_removed(liquidity_removed: LiquidityRemoved) {
        event::emit(liquidity_removed);
    }

    public(friend) fun emit_x_swapped_for_y(x_swapped_for_y: XSwappedForY) {
        event::emit(x_swapped_for_y);
    }

    public(friend) fun emit_y_swapped_for_x(y_swapped_for_x: YSwappedForX) {
        event::emit(y_swapped_for_x);
    }

}
