/* *************************************************************
 *
 * COPYRIGHT (c) 2018-19 Saurabh Agrawal
 * All Rights Reserved. Saurabh Agrawal - Confidential.
 *
 * Date : Aug 04, 2018
 *
 * *************************************************************/
package org.intvw.searchpartner.model.output;

import java.util.List;

import org.intvw.searchpartner.model.Branch;
import org.intvw.searchpartner.model.Convertable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 
 * @author saurabh_agrawal
 *
 */
@JacksonXmlRootElement(localName = "cmfoodchain")
public class CmFoodChain implements Convertable {
	List<Branch> branch;
	
	public CmFoodChain() {
	}

	public CmFoodChain(List<Branch> branch) {
		this.branch = branch;
	}

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CmFoodChain [branch=");
		builder.append(branch);
		builder.append("]");
		return builder.toString();
	}
}
