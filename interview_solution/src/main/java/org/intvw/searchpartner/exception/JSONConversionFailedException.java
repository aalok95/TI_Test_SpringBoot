package org.intvw.searchpartner.exception;

public class JSONConversionFailedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public JSONConversionFailedException(String message) {
		super(message);
	}
}