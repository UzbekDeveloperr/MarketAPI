package com.example.MarketAPI.repository;

import com.example.MarketAPI.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Long> {
    Attachment findAttachmentByHashId(String hashId);
}
