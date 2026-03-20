package com.QUICKBITE.QUICKBITE;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    public RestaurantService(RestaurantRepository restaurantRepository)
    {
        this.restaurantRepository=restaurantRepository;
    }
    public String getrestro()
    {
        return restaurantRepository.getrestro();
    }
    
}
