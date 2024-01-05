// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module sui_swap_example::liquidity_added {

    use std::string::String;
    use sui::object::{Self, ID};
    use sui_swap_example::token_pair::{Self, LiquidityAdded};

    public fun id(liquidity_added: &LiquidityAdded): object::ID {
        token_pair::liquidity_added_id(liquidity_added)
    }

    public fun provider(liquidity_added: &LiquidityAdded): address {
        token_pair::liquidity_added_provider(liquidity_added)
    }

    public fun x_token_type(liquidity_added: &LiquidityAdded): String {
        token_pair::liquidity_added_x_token_type(liquidity_added)
    }

    public fun y_token_type(liquidity_added: &LiquidityAdded): String {
        token_pair::liquidity_added_y_token_type(liquidity_added)
    }

    public fun x_amount(liquidity_added: &LiquidityAdded): u64 {
        token_pair::liquidity_added_x_amount(liquidity_added)
    }

    public fun y_amount(liquidity_added: &LiquidityAdded): u64 {
        token_pair::liquidity_added_y_amount(liquidity_added)
    }

    public fun liquidity_amount(liquidity_added: &LiquidityAdded): u64 {
        token_pair::liquidity_added_liquidity_amount(liquidity_added)
    }

    public fun liquidity_token_id(liquidity_added: &LiquidityAdded): ID {
        token_pair::liquidity_added_liquidity_token_id(liquidity_added)
    }

}
