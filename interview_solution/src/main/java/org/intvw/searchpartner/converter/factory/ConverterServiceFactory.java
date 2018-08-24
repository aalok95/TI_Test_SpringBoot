package org.intvw.searchpartner.converter.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.intvw.searchpartner.converter.service.ConverterService;
import org.intvw.searchpartner.converter.service.impl.JSONConverterServiceImpl;
import org.intvw.searchpartner.converter.service.impl.XMLConverterServiceImpl;
import org.intvw.searchpartner.exception.UnknownFileTypeException;
import org.intvw.searchpartner.model.SourceFileType;

public class ConverterServiceFactory {
	private static Logger logger = LogManager.getLogger(ConverterServiceFactory.class);
	private ConverterServiceFactory() {
	}
	
	public static ConverterService getServiceInstance(String type) {
		ConverterService service = null;
		
		if (type == null || type.equals("")) {
			logger.error("Input file type cannot be blank. ");
			throw new UnknownFileTypeException("Invalid file type: " + type);
		}
		
		if (type.equals(SourceFileType.JSON.getValue())) {
			service = new JSONConverterServiceImpl();
		} else if (type.equals(SourceFileType.XML.getValue())) {
			service = new XMLConverterServiceImpl();
		} 
		
		return service;
	}
}