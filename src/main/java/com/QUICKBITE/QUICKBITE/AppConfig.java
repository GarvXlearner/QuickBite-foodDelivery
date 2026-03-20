package com.QUICKBITE.QUICKBITE;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // tells Spring: read this class for bean definitions
public class AppConfig {

    @Bean  // Spring calls this method and stores the return value as a bean
    public String appDescription() {
        return "QuickBite - Food Delivery App";
    }

    @Bean
    public Integer maxOrderLimit() {
        return 10; // max items per order
    }

    @Bean
public List<String> supportedCuisines() {
    return List.of("Indian", "Chinese", "Italian", "Mexican");
}
}