package org.intvw.searchpartner.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.intvw.searchpartner.service.ScheduledBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan(basePackages = { "org.intvw.searchpartner" })
public class SpringBootApp implements CommandLineRunner {
	public static final Logger logger = LogManager.getLogger(SpringBootApp.class);

	@Autowired
	ScheduledBillService service;

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public XmlMapper xmlMapper() {
		return new XmlMapper();
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootApp.class);
		app.run(args);
	}

	public void run(String... args) {
		service.scheduleTaskWithCronExpression();
	}
}
