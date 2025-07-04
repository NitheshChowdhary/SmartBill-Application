package com.smartbill.smartbill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SmartbillApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartbillApplication.class, args);
	}
}
