package org.intvw.searchpartner.model;

public enum SourceFileType {
	JSON("application/json"), 
	XML("application/xml");
	
	private String code; 
	private String value;

	private SourceFileType(String value) {
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}
}
