package com.jonah.vttp5_ssf_day07carpark.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/demo")
public class DemoController {

    
    @GetMapping("")
    public String displayDateTime(Model model) throws ParseException{
    String strDate = "2005-06-06 15:30:21";
    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    
    Date testDate = sdf.parse(strDate);
    long epochMilliSecondsDate = testDate.getTime();
    model.addAttribute("date", testDate);

    Date testDate2 = new Date(epochMilliSecondsDate);
    return "demo";
    }
}
