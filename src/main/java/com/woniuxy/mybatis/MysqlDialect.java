package com.woniuxy.mybatis;

public class MysqlDialect implements Dialect {

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		String pageSql = sql + " limit " + offset + "," +limit;
		return pageSql;
	}

}
