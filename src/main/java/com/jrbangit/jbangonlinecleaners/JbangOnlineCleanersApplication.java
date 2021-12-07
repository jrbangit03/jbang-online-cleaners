package com.jrbangit.jbangonlinecleaners;

import com.jrbangit.jbangonlinecleaners.Models.Cleaner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JbangOnlineCleanersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JbangOnlineCleanersApplication.class, args);
		System.out.println("TEST");
	}

}
