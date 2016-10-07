package com.ge.predix.labs.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Status implements Serializable {

	private static final long serialVersionUID = 1500516986755256732L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int statusId;

	@ManyToOne
	@JoinColumn(name = "invoiceId")
    private Invioce invioce;
    @NotNull
    private String invoiceStatus;
    @NotNull
    private Date statusFromDate;
    @NotNull
    private Date statusToDate;
    
    private String invoiceHold;

	public String getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Date getStatusFromDate() {
		return statusFromDate;
	}

	public void setStatusFromDate(Date statusFromDate) {
		this.statusFromDate = statusFromDate;
	}

	public Date getStatusToDate() {
		return statusToDate;
	}

	public void setStatusToDate(Date statusToDate) {
		this.statusToDate = statusToDate;
	}

	public String getInvoiceHold() {
		return invoiceHold;
	}

	public void setInvoiceHold(String invoiceHold) {
		this.invoiceHold = invoiceHold;
	}
	
	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

}
