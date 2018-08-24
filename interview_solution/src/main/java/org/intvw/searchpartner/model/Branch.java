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

/**
 * 
 * @author saurabh_agrawal
 *
 */
public class Branch implements Convertable {
	@JacksonXmlProperty()
	private String location;
	
	@JacksonXmlProperty(localName = "totalcollection")
	private Double totalCollection;
	
	@JacksonXmlProperty(localName = "locationid")
	private String locationId;
	
	private Double sumOfOrder;
	
	public Branch() {
	}
	
	public Branch(String location, Double totalCollection, String locationId, Double sumOfOrder) {
		this.location = location;
		this.totalCollection = totalCollection;
		this.locationId = locationId;
		this.sumOfOrder = sumOfOrder;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getTotalCollection() {
		return totalCollection;
	}

	public void setTotalCollection(Double totalCollection) {
		this.totalCollection = totalCollection;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public Double getSumOfOrder() {
		return sumOfOrder;
	}

	public void setSumOfOrder(Double sumOfOrder) {
		this.sumOfOrder = sumOfOrder;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Branch [location=");
		builder.append(location);
		builder.append(", totalCollection=");
		builder.append(totalCollection);
		builder.append(", locationId=");
		builder.append(locationId);
		builder.append(", sumOfOrder=");
		builder.append(sumOfOrder);
		builder.append("]");
		return builder.toString();
	}
}
