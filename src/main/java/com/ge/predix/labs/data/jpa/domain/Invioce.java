package com.ge.predix.labs.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Invioce implements Serializable {

	private static final long serialVersionUID = 1500516986755256732L;

	@Id
    private String invoiceId ;
	
	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	@ManyToOne
	@JoinColumn(name = "poNumber")
    private Po po;


	public Po getPo() {
		return po;
	}

	public void setPo(Po po) {
		this.po = po;
	}
}
