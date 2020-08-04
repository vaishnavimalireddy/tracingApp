package com.tracing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracing.entity.TracingEntity;
import com.tracing.repository.TracingRepository;

@Service("tracingServiceImpl")
public class TracingService{
	
@Autowired
private TracingRepository tracingRepository;



public TracingEntity findByTokenId(long tokenId) {
	TracingEntity tracing = tracingRepository.findByTokenId(tokenId);
	return tracing;
}



public void saveSubmission(TracingEntity tracingEntity) {
	 tracingRepository.saveTracing(tracingEntity);
	
}

}