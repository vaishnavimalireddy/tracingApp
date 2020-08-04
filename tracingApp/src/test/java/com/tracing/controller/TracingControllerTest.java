package com.tracing.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import com.tracing.entity.TracingEntity;
import com.tracing.service.TracingService;

@RunWith(SpringRunner.class)
@WebMvcTest(TracingController.class)
public class TracingControllerTest {
	   @Autowired
	    private MockMvc mvc;

	    @MockBean
	    private TracingService service;

	    @Test
	    public void givenSubmissions_whenGetSubmissions_thenReturnJsonArray()
	            throws Exception {

	        TracingEntity tracing = new TracingEntity(5432134,"45",true,true,true,"09/23/2020","green");

	        given(service.findByTokenId(12345432)).willReturn(tracing);
	        mvc.perform(get("/api/submissions")
	                .contentType(MediaType.APPLICATION_JSON))
	                .andExpect(status().isOk())
	                .andExpect(jsonPath("$.tokenId").value(12345432));
	    }
	
	
	
}
