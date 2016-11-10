package com.liyi.test.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.liyi.test.util.DataSource;
import com.liyi.test.util.DynamicDataSourceHolder;

@Aspect
@Component
public class DataSourceAspect {
	@Before("execution(* com.liyi.test.dao.*.*(..))")
	public void before(JoinPoint point)	
    {  
        Object target = point.getTarget();  
        String method = point.getSignature().getName();  
  
        Class<?>[] classz = target.getClass().getInterfaces();  
  
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();  
        try {  
            Method m = classz[0].getMethod(method, parameterTypes);  
            if (m != null && m.isAnnotationPresent(DataSource.class)) {  
                DataSource data = m  
                        .getAnnotation(DataSource.class);  
                DynamicDataSourceHolder.putDataSource(data.value());  
                System.out.println(data.value());  
            }  
              
        } catch (Exception e) {  
            // TODO: handle exception  
        	System.out.println(e);
        }  
    }
}
