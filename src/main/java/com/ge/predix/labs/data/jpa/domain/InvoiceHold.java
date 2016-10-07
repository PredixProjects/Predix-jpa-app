package com.ge.predix.labs.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvoiceHold implements Serializable {

	private static final long serialVersionUID = 1500516986755256732L;

	@Id
    private String holdId;
    private String holdReason ;
    private String holdResolution ;
    private String holdFaq;
    
	public String getHoldId() {
		return holdId;
	}
	public void setHoldId(String holdId) {
		this.holdId = holdId;
	}
	public String getHoldReason() {
		return holdReason;
	}
	public void setHoldReason(String holdReason) {
		this.holdReason = holdReason;
	}
	public String getHoldResolution() {
		return holdResolution;
	}
	public void setHoldResolution(String holdResolution) {
		this.holdResolution = holdResolution;
	}
	public String getHoldFaq() {
		return holdFaq;
	}
	public void setHoldFaq(String holdFaq) {
		this.holdFaq = holdFaq;
	}
   
}
