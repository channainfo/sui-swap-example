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
import org.test.suiswapexample.specialization.*;


public class ExchangeStateDto {

    private String id;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private Boolean active;

    public Boolean getActive()
    {
        return this.active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    private BigInteger version;

    public BigInteger getVersion()
    {
        return this.version;
    }

    public void setVersion(BigInteger version)
    {
        this.version = version;
    }

    private Long offChainVersion;

    public Long getOffChainVersion()
    {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion)
    {
        this.offChainVersion = offChainVersion;
    }

    private String createdBy;

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt()
    {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy()
    {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt()
    {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    private String[] tokenPairs;

    public String[] getTokenPairs() {
        return this.tokenPairs;
    }

    public void setTokenPairs(String[] tokenPairs) {
        this.tokenPairs = tokenPairs;
    }

    private String[] xTokenTypes;

    public String[] getXTokenTypes() {
        return this.xTokenTypes;
    }

    public void setXTokenTypes(String[] xTokenTypes) {
        this.xTokenTypes = xTokenTypes;
    }

    private String[] yTokenTypes;

    public String[] getYTokenTypes() {
        return this.yTokenTypes;
    }

    public void setYTokenTypes(String[] yTokenTypes) {
        this.yTokenTypes = yTokenTypes;
    }


    public static class DtoConverter extends AbstractStateDtoConverter
    {
        public static Collection<String> collectionFieldNames = Arrays.asList(new String[]{});

        @Override
        protected boolean isCollectionField(String fieldName) {
            return CollectionUtils.collectionContainsIgnoringCase(collectionFieldNames, fieldName);
        }

        public ExchangeStateDto[] toExchangeStateDtoArray(Iterable<ExchangeState> states) {
            return toExchangeStateDtoList(states).toArray(new ExchangeStateDto[0]);
        }

        public List<ExchangeStateDto> toExchangeStateDtoList(Iterable<ExchangeState> states) {
            ArrayList<ExchangeStateDto> stateDtos = new ArrayList();
            for (ExchangeState s : states) {
                ExchangeStateDto dto = toExchangeStateDto(s);
                stateDtos.add(dto);
            }
            return stateDtos;
        }

        public ExchangeStateDto toExchangeStateDto(ExchangeState state)
        {
            if(state == null) {
                return null;
            }
            ExchangeStateDto dto = new ExchangeStateDto();
            if (returnedFieldsContains("Id")) {
                dto.setId(state.getId());
            }
            if (returnedFieldsContains("Name")) {
                dto.setName(state.getName());
            }
            if (returnedFieldsContains("Active")) {
                dto.setActive(state.getActive());
            }
            if (returnedFieldsContains("Version")) {
                dto.setVersion(state.getVersion());
            }
            if (returnedFieldsContains("OffChainVersion")) {
                dto.setOffChainVersion(state.getOffChainVersion());
            }
            if (returnedFieldsContains("CreatedBy")) {
                dto.setCreatedBy(state.getCreatedBy());
            }
            if (returnedFieldsContains("CreatedAt")) {
                dto.setCreatedAt(state.getCreatedAt());
            }
            if (returnedFieldsContains("UpdatedBy")) {
                dto.setUpdatedBy(state.getUpdatedBy());
            }
            if (returnedFieldsContains("UpdatedAt")) {
                dto.setUpdatedAt(state.getUpdatedAt());
            }
            if (returnedFieldsContains("TokenPairs")) {
                ArrayList<String> arrayList = new ArrayList();
                if (state.getTokenPairs() != null) {
                    for (String s : state.getTokenPairs()) {
                        arrayList.add(s);
                    }
                }
                dto.setTokenPairs(arrayList.toArray(new String[0]));
            }
            if (returnedFieldsContains("XTokenTypes")) {
                ArrayList<String> arrayList = new ArrayList();
                if (state.getXTokenTypes() != null) {
                    for (String s : state.getXTokenTypes()) {
                        arrayList.add(s);
                    }
                }
                dto.setXTokenTypes(arrayList.toArray(new String[0]));
            }
            if (returnedFieldsContains("YTokenTypes")) {
                ArrayList<String> arrayList = new ArrayList();
                if (state.getYTokenTypes() != null) {
                    for (String s : state.getYTokenTypes()) {
                        arrayList.add(s);
                    }
                }
                dto.setYTokenTypes(arrayList.toArray(new String[0]));
            }
            return dto;
        }

    }
}
