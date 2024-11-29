package com.jonah.vttp5_ssf_day07carpark.service;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jonah.vttp5_ssf_day07carpark.constant.Url;
import com.jonah.vttp5_ssf_day07carpark.model.Carpark;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.JsonValue;

@Service
public class CarparkRestService {
    RestTemplate restTemplate = new RestTemplate();


    public List<Carpark> getCarparks(){
        String carparkData = restTemplate.getForObject(Url.carparkUrl, String.class);
        
        JsonReader jReader = Json.createReader(new StringReader(carparkData));
        JsonObject jObject = jReader.readObject();
        //JsonObject jDataObject = jObject.getJsonObject("items").getJsonObject("carpark_data").getJsonObject("carpark_info");
        //USE JSONARRAY Instead
        JsonArray jsonArray = jObject.getJsonArray("items");
        //System.out.println("jsonArray: " + jsonArray);
        //convert to object
        JsonArray carparkDataArray = jsonArray.getJsonArray(1);
        System.out.println("carparkDataArray: " + carparkDataArray);
        List<Carpark> carparks = new ArrayList<>();

        
        for(int i = 0; i<jsonArray.size(); i++){
            Carpark c = new Carpark();
            JsonArray carparkinfoArray = carparkDataArray.get(i).asJsonObject().getJsonArray("carpark_info");
            System.out.println(carparkinfoArray);
            //c.setCarpark_number(carparkinfoArray.getString(""));
            //c.setTotal_lots(entry.getValue().asJsonObject().getString("total_lots"));
            //c.setLots_available(entry.getValue().asJsonObject().getString("lots_available"));
            //jO
            //c.setLots_available(entry.getValue().asJsonObject().getString("lots_available"));
            //jO

            //c.setCarpark_number(carparkinfoArray.getString(""));
            c.setTotal_lots(carparkinfoArray.get(0).toString());
            c.setLots_available(carparkinfoArray.get(2).toString());
        }
        return carparks;
    }
}
