package com.QUICKBITE.QUICKBITE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuickbiteApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QuickbiteApplication.class, args);
		RestaurantController controller = context.getBean(RestaurantController.class);
		System.out.println(controller.getrestro());

	}

}
