package com.liyi.test.util;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 建立动态数据源
 * 
 * @author Administrator
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    public Logger getParentLogger() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Object determineCurrentLookupKey() {
        // TODO Auto-generated method stub
        return DynamicDataSourceHolder.getDataSouce();
    }

}
