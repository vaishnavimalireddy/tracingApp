package com.tracing.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.tracing.entity.TracingEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TracingRepositoryTest {

	
	    @Autowired
	    private TestEntityManager entityManager;

	    @Autowired
	    private TracingRepository tracingRepository;

	    @Test
	    public void whenFindByName_thenReturnEmployee() {
	        // given
	    	int tokenId =12345432;
	    	TracingEntity tracing = new TracingEntity(5432134,"45",true,true,true,"09/23/2020","green");
	        
	        entityManager.persist(tracing);
	        entityManager.flush();

	        // when
	        TracingEntity found = tracingRepository.findByTokenId(tracing.getTokenId());

	        // then
	        Assert.assertNotNull(found);
	        Assert.assertEquals(found.getTokenId(),tokenId);

	    }
}