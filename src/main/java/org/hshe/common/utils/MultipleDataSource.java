package org.hshe.common.utils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleDataSource extends AbstractRoutingDataSource {
	private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();
	
	public static void setDatasourcekey(String dataSource) {
		dataSourceKey.set(dataSource);
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return dataSourceKey.get();
	}

}
