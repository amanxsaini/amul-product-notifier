package com.aman.amulnotifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Backend entry point.
 *
 * <p>{@code @SpringBootApplication} = configuration + auto-configuration (e.g. starts Tomcat
 * because the web starter is present) + component scan of this package and subpackages.
 */
@SpringBootApplication
public class AmulNotifierApplication {

	/**
	 * Starts the Spring context and embedded web server.
	 *
	 * @param args command-line args; can override properties (e.g. {@code --server.port=9090})
	 */
	public static void main(String[] args) {
		SpringApplication.run(AmulNotifierApplication.class, args);
	}
}
