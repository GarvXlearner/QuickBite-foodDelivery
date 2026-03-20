package com.QUICKBITE.QUICKBITE;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
     private final String appDescription;
    private final Integer maxOrderLimit;
    private final List<String> supportedCuisines;

    public RestaurantService(RestaurantRepository restaurantRepository, String appDescription, int maxOrderLimit, List<String> supportedCuisines)
    {
        this.restaurantRepository=restaurantRepository;
         this.appDescription = appDescription;
        this.maxOrderLimit = maxOrderLimit;
        this.supportedCuisines = supportedCuisines;
        
    }
    public String getrestro()
    {
        return restaurantRepository.getrestro();
    }
    public void printAppInfo() {
        System.out.println(appDescription);
        System.out.println("Max order limit: " + maxOrderLimit);
        System.out.println(supportedCuisines);
    }
    
}
