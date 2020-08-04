package com.tracing.service;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.tracing.entity.TracingEntity;
import com.tracing.repository.TracingRepository;

@RunWith(SpringRunner.class)
public class TracingServiceTest {


    @Autowired
    private TracingService tracingService;

    @MockBean
    private TracingRepository tracingRepository;

    @Before
    public void setUp() {
    	TracingEntity tracing = new TracingEntity(5432134,"45",true,true,true,"09/23/2020","green");
    	
        Mockito.when(tracingRepository.findByTokenId(12345432)).thenReturn(tracing);
    }

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        long tokenId = 12345432;
        TracingEntity found = tracingService.findByTokenId(tokenId);

        Assert.assertEquals(found.getTokenId(),tokenId);
    }

}
