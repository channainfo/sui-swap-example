module sui_swap_example::liquidity_token_mint_logic {
    use sui::tx_context::TxContext;
    use sui_swap_example::liquidity_token;
    use sui_swap_example::liquidity_token_minted;

    friend sui_swap_example::liquidity_token_aggregate;

    public(friend) fun verify(
        amount: u64,
        ctx: &mut TxContext,
    ): liquidity_token::LiquidityTokenMinted {
        let _ = ctx;
        liquidity_token::new_liquidity_token_minted(
            amount,
        )
    }

    public(friend) fun mutate(
        liquidity_token_minted: &liquidity_token::LiquidityTokenMinted,
        ctx: &mut TxContext,
    ): liquidity_token::LiquidityToken {
        let amount = liquidity_token_minted::amount(liquidity_token_minted);
        liquidity_token::new_liquidity_token(
            amount,
            ctx,
        )
    }

}
