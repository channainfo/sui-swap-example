// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.tokenpair;

import java.util.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.specialization.Event;

public interface TokenPairEvent extends Event, SuiEventEnvelope, SuiMoveEvent, HasStatus {

    interface SqlTokenPairEvent extends TokenPairEvent {
        TokenPairEventId getTokenPairEventId();

        boolean getEventReadOnly();

        void setEventReadOnly(boolean readOnly);
    }

    interface LiquidityInitialized extends TokenPairEvent {
        String getExchangeId();

        void setExchangeId(String value);

        String getProvider();

        void setProvider(String value);

        String getXTokenType();

        void setXTokenType(String value);

        String getYTokenType();

        void setYTokenType(String value);

        BigInteger getXAmount();

        void setXAmount(BigInteger value);

        BigInteger getYAmount();

        void setYAmount(BigInteger value);

        BigInteger getLiquidityAmount();

        void setLiquidityAmount(BigInteger value);

        String getLiquidityTokenId();

        void setLiquidityTokenId(String value);

    }

    interface LiquidityAdded extends TokenPairEvent {
        String getProvider();

        void setProvider(String value);

        String getXTokenType();

        void setXTokenType(String value);

        String getYTokenType();

        void setYTokenType(String value);

        BigInteger getXAmount();

        void setXAmount(BigInteger value);

        BigInteger getYAmount();

        void setYAmount(BigInteger value);

        BigInteger getLiquidityAmount();

        void setLiquidityAmount(BigInteger value);

        String getLiquidityTokenId();

        void setLiquidityTokenId(String value);

    }

    interface LiquidityRemoved extends TokenPairEvent {
        String getLiquidityToken();

        void setLiquidityToken(String value);

        BigInteger getLiquidityAmount();

        void setLiquidityAmount(BigInteger value);

        String getLiquidityTokenId();

        void setLiquidityTokenId(String value);

        String getProvider();

        void setProvider(String value);

        String getXTokenType();

        void setXTokenType(String value);

        String getYTokenType();

        void setYTokenType(String value);

        BigInteger getXAmount();

        void setXAmount(BigInteger value);

        BigInteger getYAmount();

        void setYAmount(BigInteger value);

    }

    interface XSwappedForY extends TokenPairEvent {
        BigInteger getExpectedYAmountOut();

        void setExpectedYAmountOut(BigInteger value);

        String getSender();

        void setSender(String value);

        String getXTokenType();

        void setXTokenType(String value);

        String getYTokenType();

        void setYTokenType(String value);

        BigInteger getXAmount();

        void setXAmount(BigInteger value);

        BigInteger getYAmount();

        void setYAmount(BigInteger value);

    }

    interface YSwappedForX extends TokenPairEvent {
        BigInteger getExpectedXAmountOut();

        void setExpectedXAmountOut(BigInteger value);

        String getSender();

        void setSender(String value);

        String getXTokenType();

        void setXTokenType(String value);

        String getYTokenType();

        void setYTokenType(String value);

        BigInteger getXAmount();

        void setXAmount(BigInteger value);

        BigInteger getYAmount();

        void setYAmount(BigInteger value);

    }

    String getId();

    //void setId(String id);

    BigInteger getVersion();
    
    //void setVersion(BigInteger version);

    String getCreatedBy();

    void setCreatedBy(String createdBy);

    Date getCreatedAt();

    void setCreatedAt(Date createdAt);

    String getCommandId();

    void setCommandId(String commandId);


}
