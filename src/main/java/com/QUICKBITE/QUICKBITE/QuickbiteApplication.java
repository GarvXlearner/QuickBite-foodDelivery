package com.QUICKBITE.QUICKBITE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuickbiteApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QuickbiteApplication.class, args);
		RestaurantService service = context.getBean(RestaurantService.class);
		RestaurantService servicen=context.getBean(RestaurantService.class);
		System.out.println(service.welcomemsg());
		System.out.println(servicen.welcomemsg());
		System.out.println(service==servicen);

	}

}
