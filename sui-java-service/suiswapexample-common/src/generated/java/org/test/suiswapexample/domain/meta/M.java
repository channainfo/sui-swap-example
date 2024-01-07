// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.meta;

import java.util.*;

import org.test.suiswapexample.specialization.*;


public class M {

  // /////////////////////////////////////////
  public static class BoundedContextMetadata {

    public static final String NAME_REQUESTER_ID                = "requesterId";
    public static final String DISCRIMINATOR_COMMAND_TYPE       = "commandType";
    public static final String DISCRIMINATOR_EVENT_TYPE         = "eventType";
    public static final String DISCRIMINATOR_COMMAND_ID         = "commandId";

    public static final String HTTP_SERVICE_ORDERS_QUERY_NAME           = "sort";
    public static final String HTTP_SERVICE_FIRST_RESULT_QUERY_NAME     = "firstResult";
    public static final String HTTP_SERVICE_MAX_RESULTS_QUERY_NAME      = "maxResults";
    public static final String HTTP_SERVICE_RETURNED_FIELDS_QUERY_NAME  = "fields";
    public static final String HTTP_SERVICE_FILTER_QUERY_NAME           = "filter";

    public static final Map<String, String> TYPE_NAME_TO_AGGREGATE_NAME_MAP;

    public static final Map<String, Class<?>> CLASS_MAP;

    static {
        Map<String, String> typeToAggMap = new HashMap<>();

        typeToAggMap.put("TokenPair", "TokenPair");
        typeToAggMap.put("LiquidityToken", "LiquidityToken");
        typeToAggMap.put("Exchange", "Exchange");
        TYPE_NAME_TO_AGGREGATE_NAME_MAP = typeToAggMap;

        Map<String, Class<?>> clsMap = new HashMap<>();
        clsMap.put("bool", Boolean.class);
        clsMap.put("Boolean", Boolean.class);
        clsMap.put("bool?", Boolean.class);
        clsMap.put("DateTime", java.util.Date.class);
        clsMap.put("Date", java.util.Date.class);
        clsMap.put("java.util.Date", java.util.Date.class);
        clsMap.put("DateTime?", java.util.Date.class);
        clsMap.put("decimal", java.math.BigDecimal.class);
        clsMap.put("BigDecimal", java.math.BigDecimal.class);
        clsMap.put("java.math.BigDecimal", java.math.BigDecimal.class);
        clsMap.put("decimal?", java.math.BigDecimal.class);
        clsMap.put("int", Integer.class);
        clsMap.put("Integer", Integer.class);
        clsMap.put("int?", Integer.class);
        clsMap.put("long", Long.class);
        clsMap.put("Long", Long.class);
        clsMap.put("long?", Long.class);
        clsMap.put("string", String.class);
        clsMap.put("String", String.class);
        clsMap.put("U8", Integer.class);
        clsMap.put("U16", Integer.class);
        clsMap.put("U32", Long.class);
        clsMap.put("U64", java.math.BigInteger.class);
        clsMap.put("BigInteger", java.math.BigInteger.class);
        clsMap.put("java.math.BigInteger", java.math.BigInteger.class);
        clsMap.put("U128", java.math.BigInteger.class);
        clsMap.put("U256", java.math.BigInteger.class);
        clsMap.put("u8", Integer.class);
        clsMap.put("u16", Integer.class);
        clsMap.put("u32", Long.class);
        clsMap.put("u64", java.math.BigInteger.class);
        clsMap.put("u128", java.math.BigInteger.class);
        clsMap.put("u256", java.math.BigInteger.class);
        clsMap.put("vector<u8>", int[].class);
        clsMap.put("int[]", int[].class);
        clsMap.put("blob", java.sql.Blob.class);
        clsMap.put("java.sql.Blob", java.sql.Blob.class);
        clsMap.put("byte-array", byte[].class);
        clsMap.put("byte[]", byte[].class);
        clsMap.put("object", Object.class);
        clsMap.put("Object", Object.class);
        clsMap.put("date-time", java.sql.Timestamp.class);
        clsMap.put("java.sql.Timestamp", java.sql.Timestamp.class);
        clsMap.put("date", java.sql.Date.class);
        clsMap.put("java.sql.Date", java.sql.Date.class);
        clsMap.put("time", java.sql.Time.class);
        clsMap.put("java.sql.Time", java.sql.Time.class);
        clsMap.put("currency-amount", java.math.BigDecimal.class);
        clsMap.put("currency-precise", java.math.BigDecimal.class);
        clsMap.put("fixed-point", java.math.BigDecimal.class);
        clsMap.put("floating-point", Double.class);
        clsMap.put("Double", Double.class);
        clsMap.put("numeric", Long.class);
        clsMap.put("id-long", String.class);
        clsMap.put("id-vlong", String.class);
        clsMap.put("indicator", String.class);
        clsMap.put("very-short", String.class);
        clsMap.put("short-varchar", String.class);
        clsMap.put("long-varchar", String.class);
        clsMap.put("very-long", String.class);
        clsMap.put("comment", String.class);
        clsMap.put("description", String.class);
        clsMap.put("name", String.class);
        clsMap.put("value", String.class);
        clsMap.put("credit-card-number", String.class);
        clsMap.put("credit-card-date", String.class);
        clsMap.put("email", String.class);
        clsMap.put("url", String.class);
        clsMap.put("id-long-ne", String.class);
        clsMap.put("id-vlong-ne", String.class);
        clsMap.put("tel-number", String.class);
        clsMap.put("UID", String.class);
        clsMap.put("ID", String.class);
        clsMap.put("address", String.class);
        clsMap.put("Balance", java.math.BigInteger.class);
        CLASS_MAP = clsMap;
    }

    private BoundedContextMetadata() {
    }
  }


  // /////////////////////////////////////////////////////////  
  public static class TokenPairMetadata {

    private TokenPairMetadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final Class ID_CLASS = String.class;

    public static final String[] propertyNames = new String[] {
            "id",
            "x_Reserve",
            "y_Reserve",
            "totalLiquidity",
            "version",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "x_TokenType",
            "y_TokenType",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "java.math.BigInteger",
            "java.math.BigInteger",
            "BigInteger",
            "BigInteger",
            "Long",
            "String",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
            "String",
            "String",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("id", "id");
        aliasMap.put("Id", "id");
        aliasMap.put("x_Reserve", "x_Reserve");
        aliasMap.put("X_Reserve", "x_Reserve");
        aliasMap.put("y_Reserve", "y_Reserve");
        aliasMap.put("Y_Reserve", "y_Reserve");
        aliasMap.put("totalLiquidity", "totalLiquidity");
        aliasMap.put("TotalLiquidity", "totalLiquidity");
        aliasMap.put("version", "version");
        aliasMap.put("Version", "version");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
        aliasMap.put("x_TokenType", "x_TokenType");
        aliasMap.put("X_TokenType", "x_TokenType");
        aliasMap.put("y_TokenType", "y_TokenType");
        aliasMap.put("Y_TokenType", "y_TokenType");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }


  // /////////////////////////////////////////////////////////  
  public static class LiquidityTokenMetadata {

    private LiquidityTokenMetadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final Class ID_CLASS = String.class;

    public static final String[] propertyNames = new String[] {
            "id",
            "amount",
            "version",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "x_TokenType",
            "y_TokenType",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "BigInteger",
            "BigInteger",
            "Long",
            "String",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
            "String",
            "String",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("id", "id");
        aliasMap.put("Id", "id");
        aliasMap.put("amount", "amount");
        aliasMap.put("Amount", "amount");
        aliasMap.put("version", "version");
        aliasMap.put("Version", "version");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
        aliasMap.put("x_TokenType", "x_TokenType");
        aliasMap.put("X_TokenType", "x_TokenType");
        aliasMap.put("y_TokenType", "y_TokenType");
        aliasMap.put("Y_TokenType", "y_TokenType");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }


  // /////////////////////////////////////////////////////////  
  public static class ExchangeMetadata {

    private ExchangeMetadata() {
    }

    public static final String PROPERTY_NAME_VERSION      = "offChainVersion";
    public static final String PROPERTY_NAME_ACTIVE       = "active";
    public static final String PROPERTY_NAME_DELETED      = "deleted";
    public static final String PROPERTY_NAME_CREATED_BY   = "createdBy";
    public static final String PROPERTY_NAME_CREATED_AT   = "createdAt";
    public static final String PROPERTY_NAME_UPDATED_BY   = "updatedBy";
    public static final String PROPERTY_NAME_UPDATED_AT   = "updatedAt";

    public static final Class ID_CLASS = String.class;

    public static final String[] propertyNames = new String[] {
            "id",
            "name",
            "offChainVersion",
            "createdBy",
            "createdAt",
            "updatedBy",
            "updatedAt",
            "active",
            "deleted",
            "version",
    };

    public static final String[] propertyTypes = new String[] {
            "String",
            "String",
            "Long",
            "String",
            "Date",
            "String",
            "Date",
            "Boolean",
            "Boolean",
            "BigInteger",
    };

    public static final Map<String, String> propertyTypeMap;

    public static final Map<String, String> aliasMap;

    static {
        propertyTypeMap = new HashMap<String, String>();
        initPropertyTypeMap();
        aliasMap = new HashMap<String, String>();
        initAliasMap();
    }

    private static  void initAliasMap() {
        aliasMap.put("id", "id");
        aliasMap.put("Id", "id");
        aliasMap.put("name", "name");
        aliasMap.put("Name", "name");
        aliasMap.put("offChainVersion", "offChainVersion");
        aliasMap.put("OffChainVersion", "offChainVersion");
        aliasMap.put("createdBy", "createdBy");
        aliasMap.put("CreatedBy", "createdBy");
        aliasMap.put("createdAt", "createdAt");
        aliasMap.put("CreatedAt", "createdAt");
        aliasMap.put("updatedBy", "updatedBy");
        aliasMap.put("UpdatedBy", "updatedBy");
        aliasMap.put("updatedAt", "updatedAt");
        aliasMap.put("UpdatedAt", "updatedAt");
        aliasMap.put("active", "active");
        aliasMap.put("Active", "active");
        aliasMap.put("deleted", "deleted");
        aliasMap.put("Deleted", "deleted");
        aliasMap.put("version", "version");
        aliasMap.put("Version", "version");
    }

    private static void initPropertyTypeMap() {
        for (int i = 0; i < propertyNames.length; i++ ) {
            propertyTypeMap.put(propertyNames[i], propertyTypes[i]);
        }
    }

  }

}


