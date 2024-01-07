// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.taskservice;

import org.test.suiswapexample.sui.contract.service.TokenPairEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PullTokenPairEventsTaskService {

    @Autowired
    private TokenPairEventService tokenPairEventService;

    @Scheduled(fixedDelayString = "${sui.contract.pull-token-pair-events.liquidity-initialized.fixed-delay:5000}")
    public void pullLiquidityInitializedEvents() {
        tokenPairEventService.pullLiquidityInitializedEvents();
    }

    @Scheduled(fixedDelayString = "${sui.contract.pull-token-pair-events.liquidity-added.fixed-delay:5000}")
    public void pullLiquidityAddedEvents() {
        tokenPairEventService.pullLiquidityAddedEvents();
    }

    @Scheduled(fixedDelayString = "${sui.contract.pull-token-pair-events.liquidity-removed.fixed-delay:5000}")
    public void pullLiquidityRemovedEvents() {
        tokenPairEventService.pullLiquidityRemovedEvents();
    }

    @Scheduled(fixedDelayString = "${sui.contract.pull-token-pair-events.x-swapped-for-y.fixed-delay:5000}")
    public void pullXSwappedForYEvents() {
        tokenPairEventService.pullXSwappedForYEvents();
    }

    @Scheduled(fixedDelayString = "${sui.contract.pull-token-pair-events.y-swapped-for-x.fixed-delay:5000}")
    public void pullYSwappedForXEvents() {
        tokenPairEventService.pullYSwappedForXEvents();
    }

}