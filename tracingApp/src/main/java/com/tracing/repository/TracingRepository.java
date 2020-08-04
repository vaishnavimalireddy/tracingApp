package com.tracing.repository;

import java.io.Serializable;




import org.springframework.stereotype.Repository;

import com.tracing.entity.TracingEntity;



@Repository
public interface TracingRepository{
	
	public default TracingEntity findByTokenId(long tokenid)
	{
		
		return new TracingEntity(5432134,"45",true,true,true,"09/23/2020".toString(),"green");
		
	}

	public void saveTracing(TracingEntity tracingEntity);
	

}