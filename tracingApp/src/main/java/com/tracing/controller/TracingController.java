package com.tracing.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.tracing.*;
import com.tracing.entity.TracingEntity;
import com.tracing.service.TracingService;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

@Controller
public class TracingController {
 
	  
	  @Autowired
	  private TracingService tracingService;


	  @GetMapping("/submissions")
	  @ResponseBody
	  public TracingEntity getSubmissions() {
		//tokendid should be retrived from requestbody
		  TracingEntity tracingResponse = tracingService.findByTokenId(123);
			System.out.print(tracingResponse);
			return tracingResponse;
	  }
	  
	
	  @PutMapping("/submitSubmission")
	  public void submitSubmission(@RequestBody TracingEntity tracing) {
		//save details in backend
		  
		  tracingService.saveSubmission(tracing);
		  
		
	
	  }
	  
	  
}
