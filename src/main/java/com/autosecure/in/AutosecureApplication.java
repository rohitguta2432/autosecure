package com.autosecure.in;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class AutosecureApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutosecureApplication.class, args);
	}
}
