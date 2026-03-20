package com.QUICKBITE.QUICKBITE;

import org.springframework.stereotype.Controller;

@Controller
public class RestaurantController {
    private final RestaurantService restaurantService;
    public RestaurantController(RestaurantService restaurantService)
    {
        this.restaurantService=restaurantService;
    }
    public String getrestro()
    {
        return restaurantService.getrestro();

    }

    
}
