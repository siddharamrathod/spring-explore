package com.helloftp.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:ftpcopycontext.xml")
public class FTPSampleApp {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(FTPSampleApp.class);
		application.setWebEnvironment(false);
		application.run(args);
	}

}
