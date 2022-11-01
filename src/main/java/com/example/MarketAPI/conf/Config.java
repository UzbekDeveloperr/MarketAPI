package com.example.MarketAPI.conf;

import com.example.MarketAPI.model.Result;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
    @Bean
    public Result result(){
        return new Result();
    }
}
