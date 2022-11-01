package com.example.MarketAPI.service;

import com.example.MarketAPI.model.Result;
import com.example.MarketAPI.payload.CategoryPayload;

public interface CategoryService {

    Result add(CategoryPayload categoryPayload);
    Result delete(String hashId);
    Result edit(CategoryPayload categoryPayload);
    Result findByHashId(String hashId);
    Result findAll();

}
