package com.springframe.coding.controller;

import com.springframe.coding.entity.Qrcode;
import com.springframe.coding.service.ServiceGoogleApisQrcode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlMvc {
    private ServiceGoogleApisQrcode serviceGoogleApisQrcode;
    @GetMapping(value = "/home")
    private String toHome(Model model) {
        String message = "not found qrcode";
        model.addAttribute("message", message);
        model.addAttribute("qrcode", null);
        return "home";
    }
    @PostMapping(value = "/home")
    private String takeQrcodeToHome(@ModelAttribute Qrcode qrcode , Model model) {
        serviceGoogleApisQrcode = new ServiceGoogleApisQrcode(qrcode.getLength(),qrcode.getInfo());
        // plot check
        // System.out.println(serviceGoogleApisQrcode.getApis());
        model.addAttribute("qrcode",serviceGoogleApisQrcode.getApis());
        return "home";
    }

}
