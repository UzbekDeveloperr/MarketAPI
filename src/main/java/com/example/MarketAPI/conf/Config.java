package com.example.MarketAPI.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.global.marketbackend.model.Result;
@Configuration
public class Config {
    @Bean
    public Result result(){
        return new Result();
    }
}
