// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module sui_swap_example::liquidity_token_destroyed {

    use sui::object;
    use sui_swap_example::liquidity_token::{Self, LiquidityTokenDestroyed};

    public fun id(liquidity_token_destroyed: &LiquidityTokenDestroyed): object::ID {
        liquidity_token::liquidity_token_destroyed_id(liquidity_token_destroyed)
    }

    public fun amount(liquidity_token_destroyed: &LiquidityTokenDestroyed): u64 {
        liquidity_token::liquidity_token_destroyed_amount(liquidity_token_destroyed)
    }

}