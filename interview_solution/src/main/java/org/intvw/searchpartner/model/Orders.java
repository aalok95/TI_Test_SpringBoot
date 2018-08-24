/* *************************************************************
 *
 * COPYRIGHT (c) 2018-19 Saurabh Agrawal
 * All Rights Reserved. Saurabh Agrawal - Confidential.
 *
 * Date : Aug 04, 2018
 *
 * *************************************************************/
package org.intvw.searchpartner.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * 
 * @author saurabh_agrawal
 *
 */
public class Orders implements Convertable {
	@JacksonXmlElementWrapper(localName = "orderdetail", useWrapping = false)
	List<OrderDetail> orderDetail;

	public Orders() {
	}

	public Orders(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderDetail=");
		builder.append(orderDetail);
		builder.append("]");
		return builder.toString();
	}
}
