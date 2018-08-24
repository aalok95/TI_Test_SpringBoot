/* *************************************************************
 *
 * COPYRIGHT (c) 2018-19 Saurabh Agrawal
 * All Rights Reserved. Saurabh Agrawal - Confidential.
 *
 * Date : Aug 04, 2018
 *
 * *************************************************************/
package org.intvw.searchpartner.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 
 * @author saurabh_agrawal
 *
 */
@JacksonXmlRootElement(localName = "cmfoodchain")
public class CmFoodChain implements Convertable {
	@JacksonXmlElementWrapper(useWrapping = false)
	Branch branch;
	
	@JacksonXmlElementWrapper()
	List<OrderDetail> orders;
	
	List<Branch> branches = new ArrayList<>();

	public CmFoodChain() {
	}

	public CmFoodChain(Branch branch, List<OrderDetail> orders) {
		super();
		this.branch = branch;
		this.orders = orders;
	}

	public CmFoodChain(List<Branch> branches) {
		super();
		this.branches = branches;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public List<OrderDetail> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDetail> orders) {
		this.orders = orders;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CmFoodChain [branch=");
		builder.append(branch);
		builder.append(", orders=");
		builder.append(orders);
		builder.append(", branches=");
		builder.append(branches);
		builder.append("]");
		return builder.toString();
	}
}
