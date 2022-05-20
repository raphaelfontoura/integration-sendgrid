package com.rddeveloper.integrations.resources;

import com.rddeveloper.integrations.dto.EmailDTO;
import com.rddeveloper.integrations.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailResource {

    @Autowired
    private EmailService service;

    @PostMapping
    public ResponseEntity<Void> send(@RequestBody EmailDTO dto) {
        service.sendEmail(dto);
        return ResponseEntity.noContent().build();
    }
}
