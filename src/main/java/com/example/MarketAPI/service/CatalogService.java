package com.example.MarketAPI.service;

import com.example.MarketAPI.model.Result;
import com.example.MarketAPI.payload.CatalogPayload;

public interface CatalogService {

    Result add(CatalogPayload catalogPayload);
    Result delete(String hashId);
    Result edit(CatalogPayload catalogPayload);
    Result findByHashId(String hashId);
    Result findAll();

}
