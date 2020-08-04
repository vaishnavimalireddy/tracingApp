package com.tracing.entity;

public class TracingEntity {
	
	  private long tokenId;
	  private String bodyTemperature;
	  private boolean Cough;
	  private boolean breathShortness;
	  private boolean bodyAches;
	  private String submissionDate;
	  private String color;
 
	  public TracingEntity()
	  {}
	  
	
	public TracingEntity(long tokenId, String bodyTemperature, boolean cough, boolean breathShortness, boolean bodyAches,
			String submissionDate, String color) {
		super();
		this.tokenId = tokenId;
		this.bodyTemperature = bodyTemperature;
		Cough = cough;
		this.breathShortness = breathShortness;
		this.bodyAches = bodyAches;
		this.submissionDate = submissionDate;
		this.color = color;
	}
	public String getSubmissionDate() {
		return submissionDate;
	}               
	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	public String isColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public long getTokenId() {
		return tokenId;
	}
	public void setTokenId(long tokenId) {
		this.tokenId = tokenId;
	}

	  
	public String getBodyTemperature() {
		return bodyTemperature;
	}
	public void setBodyTemperature(String bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}
	public boolean isCough() {
		return Cough;
	}
	public void setCough(boolean cough) {
		Cough = cough;
	}
	public boolean isBreathShortness() {
		return breathShortness;
	}
	public void setBreathShortness(boolean breathShortness) {
		this.breathShortness = breathShortness;
	}
	public boolean isBodyAches() {
		return bodyAches;
	}
	public void setBodyAches(boolean bodyAches) {
		this.bodyAches = bodyAches;
	}
	  
	  
	  
	  
}
