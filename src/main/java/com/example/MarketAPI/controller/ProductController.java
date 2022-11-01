package com.example.MarketAPI.controller;

import com.example.MarketAPI.model.Result;
import com.example.MarketAPI.payload.ProductPayload;
import com.example.MarketAPI.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;

    @PostMapping("/save")
    public Result save(@RequestBody ProductPayload productPayload){
        Result result = productService.add(productPayload);
        return result;
    }
    @PostMapping("/delete/{id}")
    public Result deleteProduct(@PathVariable Long id){
        Result delete = productService.delete(id);
        return delete;
    }

    @PutMapping("/edit/{id}")
    public Result edit(@RequestBody ProductPayload productPayload,@PathVariable Long id){
        return productService.edit(productPayload,id);
    }
}
