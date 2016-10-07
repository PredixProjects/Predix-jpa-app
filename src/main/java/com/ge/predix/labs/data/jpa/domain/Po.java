package com.ge.predix.labs.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Po implements Serializable {

	private static final long serialVersionUID = 1500516986755256732L;

	@Id
    private String poNumber;
    @NotNull
    private Date poIssueDate;
    
	@OneToOne
	@JoinColumn(name = "orderId")
    private OrderData orderData;



	public Date getPoIssueDate() {
		return poIssueDate;
	}

	public void setPoIssueDate(Date poIssueDate) {
		this.poIssueDate = poIssueDate;
	}

	public OrderData getOrderData() {
		return orderData;
	}

	public void setOrderData(OrderData orderData) {
		this.orderData = orderData;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
}
