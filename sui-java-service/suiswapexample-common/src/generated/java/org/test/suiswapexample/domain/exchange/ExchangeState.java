// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.exchange;

import java.util.*;
import java.math.*;
import java.util.Date;
import java.math.BigInteger;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.specialization.Event;

public interface ExchangeState extends VersionedSuiMoveObject
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    String getId();

    String getName();

    Long getOffChainVersion();

    String getCreatedBy();

    Date getCreatedAt();

    String getUpdatedBy();

    Date getUpdatedAt();

    Boolean getActive();

    Boolean getDeleted();

    List<String> getTokenPairs();

    List<String> getX_TokenTypes();

    List<String> getY_TokenTypes();

    interface MutableExchangeState extends ExchangeState, VersionedSuiMoveObject.MutableVersionedSuiMoveObject {
        void setId(String id);

        void setName(String name);

        void setOffChainVersion(Long offChainVersion);

        void setCreatedBy(String createdBy);

        void setCreatedAt(Date createdAt);

        void setUpdatedBy(String updatedBy);

        void setUpdatedAt(Date updatedAt);

        void setActive(Boolean active);

        void setDeleted(Boolean deleted);

        void setTokenPairs(List<String> tokenPairs);

        void setX_TokenTypes(List<String> x_TokenTypes);

        void setY_TokenTypes(List<String> y_TokenTypes);


        void mutate(Event e);

        //void when(ExchangeEvent.ExchangeStateCreated e);

        //void when(ExchangeEvent.ExchangeStateMergePatched e);

        //void when(ExchangeEvent.ExchangeStateDeleted e);
    }

    interface SqlExchangeState extends MutableExchangeState {

        boolean isStateUnsaved();

        boolean getForReapplying();
    }
}

