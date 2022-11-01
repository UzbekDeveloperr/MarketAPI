package com.example.MarketAPI.repository;

import com.example.MarketAPI.entity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttechmentRepository extends JpaRepository<Catalog,Long> {
    
}
