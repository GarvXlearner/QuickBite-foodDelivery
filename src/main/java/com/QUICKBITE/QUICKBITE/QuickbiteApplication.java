package com.QUICKBITE.QUICKBITE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuickbiteApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QuickbiteApplication.class, args);
		RestaurantService service = context.getBean(RestaurantService.class);
		EmailValidator ev=context.getBean(EmailValidator.class);
		System.out.println(ev.EmailValid("garv@123"));
		System.out.println(ev.EmailValid("garv123"));

	}

}
