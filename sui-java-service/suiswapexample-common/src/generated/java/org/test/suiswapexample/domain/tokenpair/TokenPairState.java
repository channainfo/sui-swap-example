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
import org.test.suiswapexample.specialization.Event;

public interface TokenPairState extends VersionedSuiMoveObject
{
    Long VERSION_ZERO = 0L;

    Long VERSION_NULL = VERSION_ZERO - 1;

    String getId();

    java.math.BigInteger getX_Reserve();

    java.math.BigInteger getY_Reserve();

    BigInteger getTotalLiquidity();

    Long getOffChainVersion();

    String getCreatedBy();

    Date getCreatedAt();

    String getUpdatedBy();

    Date getUpdatedAt();

    Boolean getActive();

    Boolean getDeleted();

    interface MutableTokenPairState extends TokenPairState, VersionedSuiMoveObject.MutableVersionedSuiMoveObject {
        void setId(String id);

        void setX_Reserve(java.math.BigInteger x_Reserve);

        void setY_Reserve(java.math.BigInteger y_Reserve);

        void setTotalLiquidity(BigInteger totalLiquidity);

        void setOffChainVersion(Long offChainVersion);

        void setCreatedBy(String createdBy);

        void setCreatedAt(Date createdAt);

        void setUpdatedBy(String updatedBy);

        void setUpdatedAt(Date updatedAt);

        void setActive(Boolean active);

        void setDeleted(Boolean deleted);


        void mutate(Event e);

        //void when(TokenPairEvent.TokenPairStateCreated e);

        //void when(TokenPairEvent.TokenPairStateMergePatched e);

        //void when(TokenPairEvent.TokenPairStateDeleted e);
    }

    interface SqlTokenPairState extends MutableTokenPairState {

        boolean isStateUnsaved();

        boolean getForReapplying();
    }
}

