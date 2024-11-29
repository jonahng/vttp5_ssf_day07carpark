package com.jonah.vttp5_ssf_day07carpark.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonah.vttp5_ssf_day07carpark.model.Carpark;
import com.jonah.vttp5_ssf_day07carpark.service.CarparkRestService;

@RestController
@RequestMapping("/api/carparks")
public class CarparkRestController {
    @Autowired
    CarparkRestService carparkRestService;

    @GetMapping()
    public ResponseEntity<List<Carpark>> getCarparks(){
        List<Carpark> carparks = new ArrayList<>();
        carparks = carparkRestService.getCarparks();

        return ResponseEntity.ok().body(carparks);
    }
}
