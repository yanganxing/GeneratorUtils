package com.alix.generator.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Types;


/**
 * jdbc类型
 *
 * @author Alix(杨安星)
 * @date 2020-05-30 15:29:31
 */
@SuppressWarnings("ALL")
@Getter
@AllArgsConstructor
public enum JdbcType {

    BIT(Types.BIT),
    TINYINT(Types.TINYINT),
    SMALLINT(Types.SMALLINT),
    INTEGER(Types.INTEGER),
    BIGINT(Types.BIGINT),
    FLOAT(Types.FLOAT),
    REAL(Types.REAL),
    DOUBLE(Types.DOUBLE),
    NUMERIC(Types.NUMERIC),
    DECIMAL(Types.DECIMAL),
    CHAR(Types.CHAR),
    VARCHAR(Types.VARCHAR),
    LONGVARCHAR(Types.LONGVARCHAR),
    DATE(Types.DATE),
    DATETIME(Types.DATE),
    TIME(Types.TIME),
    TIMESTAMP(Types.TIMESTAMP),
    BINARY(Types.BINARY),
    VARBINARY(Types.VARBINARY),
    LONGVARBINARY(Types.LONGVARBINARY),
    NULL(Types.NULL),
    OTHER(Types.OTHER),
    BLOB(Types.BLOB),
    CLOB(Types.CLOB),
    BOOLEAN(Types.BOOLEAN),
    // Oracle
    CURSOR(-10),
    UNDEFINED(Integer.MIN_VALUE + 1000),
    NVARCHAR(-9),
    NCHAR(-15),
    NCLOB(2011);

    public final int code;

    public static String getJdbcSqlTypeName(int code) {
        for (JdbcType type : values()) {
            if (type.getCode() == code) {
                return type.name();
            }
        }
        return null;
    }

    public static JdbcType getJdbcTypeBySqlType(String sqlType) {
        for (JdbcType type : values()) {
            if (sqlType.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        return VARCHAR;
    }

}
