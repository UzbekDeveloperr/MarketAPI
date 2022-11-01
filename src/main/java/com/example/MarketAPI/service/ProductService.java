package com.example.MarketAPI.service;

import com.example.MarketAPI.model.Result;
import com.example.MarketAPI.payload.ProductPayload;

public interface ProductService {

    Result add(ProductPayload productPayload);
    Result delete(Long id);
    Result edit(ProductPayload productPayload,Long id);
    Result findById(Long id);
    Result findAll();

}
