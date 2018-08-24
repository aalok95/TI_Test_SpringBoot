package org.intvw.searchpartner.converter.service;

import org.intvw.searchpartner.model.Convertable;

public interface ConverterService {
	String getSupportedSourceFileType();
	Convertable deSerialize(String input);
	String serialize (Convertable input);
}
