package com.example.MarketAPI.controller;

import com.example.MarketAPI.entity.Attachment;
import com.example.MarketAPI.model.Result;
import com.example.MarketAPI.service.AttachmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileUrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.MalformedURLException;
import java.net.URLEncoder;

@RestController
@RequestMapping("/api/auth/file")
@RequiredArgsConstructor
public class AttachmentController {
    private final AttachmentService attachmentService;

    @PostMapping("/save")
    public ResponseEntity<Result> saveFile(@RequestParam("file")MultipartFile multipartFile){
        Result result=attachmentService.saveAttachment(multipartFile);
        return ResponseEntity.status(result.isStatus()?200:403).body(result);
    }



    @GetMapping("/preview/{hashId}")
    public ResponseEntity<?> preview(@PathVariable String hashId) throws MalformedURLException {
        Attachment attachment = attachmentService.findAttachmentByHashId(hashId);
        return ResponseEntity.ok()
                .header(HttpHeaders.EXPIRES, "inline; fileName=" + URLEncoder.encode(attachment.getFileName()))
                .contentType(MediaType.parseMediaType(attachment.getContentType()))
                .body(new FileUrlResource(String.format("%s/%s.%s",
                        attachment.getUploadPath(),
                        attachment.getHashId(),
                        attachment.getExtension())));
    }

    @GetMapping("/download/{hashId}")
    public ResponseEntity<?> download(@PathVariable String hashId) throws MalformedURLException {
        Attachment attachment = attachmentService.findAttachmentByHashId(hashId);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "file; fileName=" + URLEncoder.encode(attachment.getFileName()))
                .contentType(MediaType.parseMediaType(attachment.getContentType()))
                .body(new FileUrlResource(String.format("%s/%s.%s",
                        attachment.getUploadPath(),
                        attachment.getHashId(),
                        attachment.getExtension())));
    }


//    removw

}
