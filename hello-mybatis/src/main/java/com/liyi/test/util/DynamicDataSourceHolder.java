package com.liyi.test.util;
/**
 * 修改上下文数据源
 * @author Administrator
 *
 */
public class DynamicDataSourceHolder {
    public static final ThreadLocal<String> holder = new ThreadLocal<String>();  
    
    public static void putDataSource(String name) {  
        holder.set(name);  
    }  
  
    public static String getDataSouce() {  
        return holder.get();  
    }  
}
