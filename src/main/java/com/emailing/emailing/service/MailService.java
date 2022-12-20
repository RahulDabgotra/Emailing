package com.emailing.emailing.service;

import com.emailing.emailing.model.MailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void SendingEmail(MailModel mailModel) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(mailModel.getEmail());
        msg.setSubject(mailModel.getSubject());
        msg.setText(mailModel.getBody());
        javaMailSender.send(msg);
    }
}
