package com.emailing.emailing.controller;

import com.emailing.emailing.model.MailModel;
import com.emailing.emailing.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.security.PrivateKey;

@RestController
public class MailController{

    @Autowired
    private MailService mailService;

    @Autowired
    private MailModel mailModel;
    @RequestMapping(value = "/")
    public String getMailing(){
        return "Post details for Mailing. (email, subject, body)";
    }

    @RequestMapping(value = "/mail", method = RequestMethod.POST, consumes="application/json")
    public String postMailing(@RequestBody MailModel mailModel){
        System.out.println(mailModel.getEmail()+mailModel.getSubject()+mailModel.getBody());
        mailService.SendingEmail(mailModel);
        return "Email sent successfully";
    }
}
