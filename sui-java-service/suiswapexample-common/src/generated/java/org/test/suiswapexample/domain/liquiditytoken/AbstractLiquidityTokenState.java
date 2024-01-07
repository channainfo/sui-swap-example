// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.liquiditytoken;

import java.util.*;
import java.math.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.specialization.*;
import org.test.suiswapexample.domain.liquiditytoken.LiquidityTokenEvent.*;

public abstract class AbstractLiquidityTokenState implements LiquidityTokenState.SqlLiquidityTokenState {

    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private BigInteger amount;

    public BigInteger getAmount() {
        return this.amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
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

    private String x_TokenType;

    public String getX_TokenType() {
        return this.x_TokenType;
    }

    public void setX_TokenType(String x_TokenType) {
        this.x_TokenType = x_TokenType;
    }

    private String y_TokenType;

    public String getY_TokenType() {
        return this.y_TokenType;
    }

    public void setY_TokenType(String y_TokenType) {
        this.y_TokenType = y_TokenType;
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

    public AbstractLiquidityTokenState(List<Event> events) {
        initializeForReapplying();
        if (events != null && events.size() > 0) {
            this.setId(((LiquidityTokenEvent.SqlLiquidityTokenEvent) events.get(0)).getLiquidityTokenEventId().getId());
            for (Event e : events) {
                mutate(e);
                this.setOffChainVersion((this.getOffChainVersion() == null ? LiquidityTokenState.VERSION_NULL : this.getOffChainVersion()) + 1);
            }
        }
    }


    public AbstractLiquidityTokenState() {
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
        if (obj instanceof LiquidityTokenState) {
            return Objects.equals(this.getId(), ((LiquidityTokenState)obj).getId());
        }
        return false;
    }


    public void mutate(Event e) {
        setStateReadOnly(false);
        if (false) { 
            ;
        } else if (e instanceof AbstractLiquidityTokenEvent.LiquidityTokenMinted) {
            when((AbstractLiquidityTokenEvent.LiquidityTokenMinted)e);
        } else if (e instanceof AbstractLiquidityTokenEvent.LiquidityTokenDestroyed) {
            when((AbstractLiquidityTokenEvent.LiquidityTokenDestroyed)e);
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported event type: %1$s", e.getClass().getName()));
        }
    }

    protected void merge(LiquidityTokenState s) {
        if (s == this) {
            return;
        }
        this.setAmount(s.getAmount());
        this.setVersion(s.getVersion());
        this.setActive(s.getActive());
        this.setX_TokenType(s.getX_TokenType());
        this.setY_TokenType(s.getY_TokenType());
    }

    public void when(AbstractLiquidityTokenEvent.LiquidityTokenMinted e) {
        throwOnWrongEvent(e);

        BigInteger amount = e.getAmount();
        BigInteger Amount = amount;
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

        LiquidityTokenState updatedLiquidityTokenState = (LiquidityTokenState) ReflectUtils.invokeStaticMethod(
                    "org.test.suiswapexample.domain.liquiditytoken.MintLogic",
                    "mutate",
                    new Class[]{LiquidityTokenState.class, BigInteger.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new Object[]{this, amount, suiTimestamp, suiTxDigest, suiEventSeq, suiPackageId, suiTransactionModule, suiSender, suiType, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.suiswapexample.domain.liquiditytoken;
//
//public class MintLogic {
//    public static LiquidityTokenState mutate(LiquidityTokenState liquidityTokenState, BigInteger amount, Long suiTimestamp, String suiTxDigest, BigInteger suiEventSeq, String suiPackageId, String suiTransactionModule, String suiSender, String suiType, String status, MutationContext<LiquidityTokenState, LiquidityTokenState.MutableLiquidityTokenState> mutationContext) {
//    }
//}

        if (this != updatedLiquidityTokenState) { merge(updatedLiquidityTokenState); } //else do nothing

    }

    public void when(AbstractLiquidityTokenEvent.LiquidityTokenDestroyed e) {
        throwOnWrongEvent(e);

        BigInteger amount = e.getAmount();
        BigInteger Amount = amount;
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

        LiquidityTokenState updatedLiquidityTokenState = (LiquidityTokenState) ReflectUtils.invokeStaticMethod(
                    "org.test.suiswapexample.domain.liquiditytoken.DestroyLogic",
                    "mutate",
                    new Class[]{LiquidityTokenState.class, BigInteger.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new Object[]{this, amount, suiTimestamp, suiTxDigest, suiEventSeq, suiPackageId, suiTransactionModule, suiSender, suiType, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.suiswapexample.domain.liquiditytoken;
//
//public class DestroyLogic {
//    public static LiquidityTokenState mutate(LiquidityTokenState liquidityTokenState, BigInteger amount, Long suiTimestamp, String suiTxDigest, BigInteger suiEventSeq, String suiPackageId, String suiTransactionModule, String suiSender, String suiType, String status, MutationContext<LiquidityTokenState, LiquidityTokenState.MutableLiquidityTokenState> mutationContext) {
//    }
//}

        if (this != updatedLiquidityTokenState) { merge(updatedLiquidityTokenState); } //else do nothing

    }

    public void save() {
    }

    protected void throwOnWrongEvent(LiquidityTokenEvent event) {
        String stateEntityId = this.getId(); // Aggregate Id
        String eventEntityId = ((LiquidityTokenEvent.SqlLiquidityTokenEvent)event).getLiquidityTokenEventId().getId(); // EntityBase.Aggregate.GetEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId)) {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }


        Long stateVersion = this.getOffChainVersion();

    }


    public static class SimpleLiquidityTokenState extends AbstractLiquidityTokenState {

        public SimpleLiquidityTokenState() {
        }

        public SimpleLiquidityTokenState(List<Event> events) {
            super(events);
        }

        public static SimpleLiquidityTokenState newForReapplying() {
            SimpleLiquidityTokenState s = new SimpleLiquidityTokenState();
            s.initializeForReapplying();
            return s;
        }

    }



}

