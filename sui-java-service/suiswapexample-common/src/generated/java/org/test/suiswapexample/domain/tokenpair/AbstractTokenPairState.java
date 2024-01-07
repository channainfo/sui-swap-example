// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.tokenpair;

import java.util.*;
import java.math.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.specialization.*;
import org.test.suiswapexample.domain.tokenpair.TokenPairEvent.*;

public abstract class AbstractTokenPairState implements TokenPairState.SqlTokenPairState {

    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private java.math.BigInteger xReserve;

    public java.math.BigInteger getXReserve() {
        return this.xReserve;
    }

    public void setXReserve(java.math.BigInteger xReserve) {
        this.xReserve = xReserve;
    }

    private java.math.BigInteger yReserve;

    public java.math.BigInteger getYReserve() {
        return this.yReserve;
    }

    public void setYReserve(java.math.BigInteger yReserve) {
        this.yReserve = yReserve;
    }

    private BigInteger totalLiquidity;

    public BigInteger getTotalLiquidity() {
        return this.totalLiquidity;
    }

    public void setTotalLiquidity(BigInteger totalLiquidity) {
        this.totalLiquidity = totalLiquidity;
    }

    private BigInteger version;

    public BigInteger getVersion() {
        return this.version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    private Long offChainVersion;

    public Long getOffChainVersion() {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion) {
        this.offChainVersion = offChainVersion;
    }

    private String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    private Boolean active;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private Boolean deleted;

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isStateUnsaved() {
        return this.getOffChainVersion() == null;
    }

    private Boolean stateReadOnly;

    public Boolean getStateReadOnly() { return this.stateReadOnly; }

    public void setStateReadOnly(Boolean readOnly) { this.stateReadOnly = readOnly; }

    private boolean forReapplying;

    public boolean getForReapplying() {
        return forReapplying;
    }

    public void setForReapplying(boolean forReapplying) {
        this.forReapplying = forReapplying;
    }

    public AbstractTokenPairState(List<Event> events) {
        initializeForReapplying();
        if (events != null && events.size() > 0) {
            this.setId(((TokenPairEvent.SqlTokenPairEvent) events.get(0)).getTokenPairEventId().getId());
            for (Event e : events) {
                mutate(e);
                this.setOffChainVersion((this.getOffChainVersion() == null ? TokenPairState.VERSION_NULL : this.getOffChainVersion()) + 1);
            }
        }
    }


    public AbstractTokenPairState() {
        initializeProperties();
    }

    protected void initializeForReapplying() {
        this.forReapplying = true;

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj instanceof TokenPairState) {
            return Objects.equals(this.getId(), ((TokenPairState)obj).getId());
        }
        return false;
    }


    public void mutate(Event e) {
        setStateReadOnly(false);
        if (false) { 
            ;
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported event type: %1$s", e.getClass().getName()));
        }
    }

    protected void merge(TokenPairState s) {
        if (s == this) {
            return;
        }
        this.setXReserve(s.getXReserve());
        this.setYReserve(s.getYReserve());
        this.setTotalLiquidity(s.getTotalLiquidity());
        this.setVersion(s.getVersion());
        this.setActive(s.getActive());
    }

    public void when(AbstractTokenPairEvent.LiquidityInitialized e) {
        throwOnWrongEvent(e);

        String exchangeId = e.getExchangeId();
        String ExchangeId = exchangeId;
        String provider = e.getProvider();
        String Provider = provider;
        String xTokenType = e.getXTokenType();
        String XTokenType = xTokenType;
        String yTokenType = e.getYTokenType();
        String YTokenType = yTokenType;
        BigInteger xAmount = e.getXAmount();
        BigInteger XAmount = xAmount;
        BigInteger yAmount = e.getYAmount();
        BigInteger YAmount = yAmount;
        BigInteger liquidityAmount = e.getLiquidityAmount();
        BigInteger LiquidityAmount = liquidityAmount;
        String liquidityTokenId = e.getLiquidityTokenId();
        String LiquidityTokenId = liquidityTokenId;
        Long suiTimestamp = e.getSuiTimestamp();
        Long SuiTimestamp = suiTimestamp;
        String suiTxDigest = e.getSuiTxDigest();
        String SuiTxDigest = suiTxDigest;
        BigInteger suiEventSeq = e.getSuiEventSeq();
        BigInteger SuiEventSeq = suiEventSeq;
        String suiPackageId = e.getSuiPackageId();
        String SuiPackageId = suiPackageId;
        String suiTransactionModule = e.getSuiTransactionModule();
        String SuiTransactionModule = suiTransactionModule;
        String suiSender = e.getSuiSender();
        String SuiSender = suiSender;
        String suiType = e.getSuiType();
        String SuiType = suiType;
        String status = e.getStatus();
        String Status = status;

        if (this.getCreatedBy() == null){
            this.setCreatedBy(e.getCreatedBy());
        }
        if (this.getCreatedAt() == null){
            this.setCreatedAt(e.getCreatedAt());
        }
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        TokenPairState updatedTokenPairState = (TokenPairState) ReflectUtils.invokeStaticMethod(
                    "org.test.suiswapexample.domain.tokenpair.InitializeLiquidityLogic",
                    "mutate",
                    new Class[]{TokenPairState.class, String.class, String.class, String.class, String.class, BigInteger.class, BigInteger.class, BigInteger.class, String.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new Object[]{this, exchangeId, provider, xTokenType, yTokenType, xAmount, yAmount, liquidityAmount, liquidityTokenId, suiTimestamp, suiTxDigest, suiEventSeq, suiPackageId, suiTransactionModule, suiSender, suiType, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.suiswapexample.domain.tokenpair;
//
//public class InitializeLiquidityLogic {
//    public static TokenPairState mutate(TokenPairState tokenPairState, String exchangeId, String provider, String xTokenType, String yTokenType, BigInteger xAmount, BigInteger yAmount, BigInteger liquidityAmount, String liquidityTokenId, Long suiTimestamp, String suiTxDigest, BigInteger suiEventSeq, String suiPackageId, String suiTransactionModule, String suiSender, String suiType, String status, MutationContext<TokenPairState, TokenPairState.MutableTokenPairState> mutationContext) {
//    }
//}

        if (this != updatedTokenPairState) { merge(updatedTokenPairState); } //else do nothing

    }

    public void when(AbstractTokenPairEvent.LiquidityAdded e) {
        throwOnWrongEvent(e);

        String provider = e.getProvider();
        String Provider = provider;
        String xTokenType = e.getXTokenType();
        String XTokenType = xTokenType;
        String yTokenType = e.getYTokenType();
        String YTokenType = yTokenType;
        BigInteger xAmount = e.getXAmount();
        BigInteger XAmount = xAmount;
        BigInteger yAmount = e.getYAmount();
        BigInteger YAmount = yAmount;
        BigInteger liquidityAmount = e.getLiquidityAmount();
        BigInteger LiquidityAmount = liquidityAmount;
        String liquidityTokenId = e.getLiquidityTokenId();
        String LiquidityTokenId = liquidityTokenId;
        Long suiTimestamp = e.getSuiTimestamp();
        Long SuiTimestamp = suiTimestamp;
        String suiTxDigest = e.getSuiTxDigest();
        String SuiTxDigest = suiTxDigest;
        BigInteger suiEventSeq = e.getSuiEventSeq();
        BigInteger SuiEventSeq = suiEventSeq;
        String suiPackageId = e.getSuiPackageId();
        String SuiPackageId = suiPackageId;
        String suiTransactionModule = e.getSuiTransactionModule();
        String SuiTransactionModule = suiTransactionModule;
        String suiSender = e.getSuiSender();
        String SuiSender = suiSender;
        String suiType = e.getSuiType();
        String SuiType = suiType;
        String status = e.getStatus();
        String Status = status;

        if (this.getCreatedBy() == null){
            this.setCreatedBy(e.getCreatedBy());
        }
        if (this.getCreatedAt() == null){
            this.setCreatedAt(e.getCreatedAt());
        }
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        TokenPairState updatedTokenPairState = (TokenPairState) ReflectUtils.invokeStaticMethod(
                    "org.test.suiswapexample.domain.tokenpair.AddLiquidityLogic",
                    "mutate",
                    new Class[]{TokenPairState.class, String.class, String.class, String.class, BigInteger.class, BigInteger.class, BigInteger.class, String.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new Object[]{this, provider, xTokenType, yTokenType, xAmount, yAmount, liquidityAmount, liquidityTokenId, suiTimestamp, suiTxDigest, suiEventSeq, suiPackageId, suiTransactionModule, suiSender, suiType, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.suiswapexample.domain.tokenpair;
//
//public class AddLiquidityLogic {
//    public static TokenPairState mutate(TokenPairState tokenPairState, String provider, String xTokenType, String yTokenType, BigInteger xAmount, BigInteger yAmount, BigInteger liquidityAmount, String liquidityTokenId, Long suiTimestamp, String suiTxDigest, BigInteger suiEventSeq, String suiPackageId, String suiTransactionModule, String suiSender, String suiType, String status, MutationContext<TokenPairState, TokenPairState.MutableTokenPairState> mutationContext) {
//    }
//}

        if (this != updatedTokenPairState) { merge(updatedTokenPairState); } //else do nothing

    }

    public void save() {
    }

    protected void throwOnWrongEvent(TokenPairEvent event) {
        String stateEntityId = this.getId(); // Aggregate Id
        String eventEntityId = ((TokenPairEvent.SqlTokenPairEvent)event).getTokenPairEventId().getId(); // EntityBase.Aggregate.GetEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId)) {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }


        Long stateVersion = this.getOffChainVersion();

    }


    public static class SimpleTokenPairState extends AbstractTokenPairState {

        public SimpleTokenPairState() {
        }

        public SimpleTokenPairState(List<Event> events) {
            super(events);
        }

        public static SimpleTokenPairState newForReapplying() {
            SimpleTokenPairState s = new SimpleTokenPairState();
            s.initializeForReapplying();
            return s;
        }

    }



}
