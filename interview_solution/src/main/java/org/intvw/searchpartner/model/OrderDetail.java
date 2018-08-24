/* *************************************************************
 *
 * COPYRIGHT (c) 2018-19 Saurabh Agrawal
 * All Rights Reserved. Saurabh Agrawal - Confidential.
 *
 * Date : Aug 04, 2018
 *
 * *************************************************************/
package org.intvw.searchpartner.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 
 * @author saurabh_agrawal
 *
 */
@JacksonXmlRootElement(localName = "orderdetail")
public class OrderDetail implements Convertable {
	@JacksonXmlProperty(localName = "orderid")
	private Long orderId;
	@JacksonXmlProperty(localName = "billamount")
	private Double billAmount;
	
	public OrderDetail() {
		
	}
	
	public OrderDetail(Long orderId, Double billAmount) {
		this.orderId = orderId;
		this.billAmount = billAmount;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderDetail [orderId=");
		builder.append(orderId);
		builder.append(", billAmount=");
		builder.append(billAmount);
		builder.append("]");
		return builder.toString();
	}
}
