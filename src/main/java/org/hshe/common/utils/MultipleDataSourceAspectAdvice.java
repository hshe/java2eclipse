package org.hshe.common.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MultipleDataSourceAspectAdvice {
	
	//@Around("execution(* org.hshe.service.*.*(..))")
	@Around("execution(* org.hshe.core.mapper.*.*(..))")
	public Object exchangeDataSource(ProceedingJoinPoint jp) throws Throwable {
		if(jp.getTarget() instanceof MysqlDataSource) {
			MultipleDataSource.setDatasourcekey("dataSource1");
		} else if(jp.getTarget() instanceof MysqlDataSource){
			MultipleDataSource.setDatasourcekey("dataSource2");//TODO
		}
		MultipleDataSource.setDatasourcekey("dataSource1");//TODO
		
		return jp.proceed();
	}
}
