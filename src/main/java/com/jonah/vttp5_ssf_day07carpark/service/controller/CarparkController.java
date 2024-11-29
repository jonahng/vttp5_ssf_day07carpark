package com.jonah.vttp5_ssf_day07carpark.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jonah.vttp5_ssf_day07carpark.model.Carpark;
import com.jonah.vttp5_ssf_day07carpark.service.CarparkRestService;

@Controller
@RequestMapping("/carparkform")
public class CarparkController {
    @Autowired
    CarparkRestService carparkRestService;

    
    @GetMapping("")
    public String getCarparksHtml(Model model){
        List<Carpark> carparks = new ArrayList<>();
        carparks = carparkRestService.getCarparks();
        model.addAttribute("carparks", carparks);
        return "carparklist";
    }
}
