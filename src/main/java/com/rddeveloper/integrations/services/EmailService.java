package com.rddeveloper.integrations.services;

import com.rddeveloper.integrations.dto.EmailDTO;

public interface EmailService {
    void sendEmail(EmailDTO dto);
}
