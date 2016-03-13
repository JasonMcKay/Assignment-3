package com.mckay.config;


import com.mckay.service.FuelService;
import com.mckay.service.impl.DieselServiceImpl;
import com.mckay.service.impl.LeadedServiceImpl;
import com.mckay.service.impl.UnleadedServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Jason McKay on 2016/03/13.
 */

@Configuration
public class AppConfig
{
    @Bean (name="diesel")
    public FuelService getDiesel()
    {
        return new DieselServiceImpl();
    }

    @Bean (name="unleaded")
    public FuelService getUnleaded()
    {
        return new UnleadedServiceImpl();
    }

    @Bean (name="leaded")
    public FuelService getLeaded()
    {
        return new LeadedServiceImpl();
    }
}
