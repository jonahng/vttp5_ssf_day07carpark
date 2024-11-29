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

        JsonArray jsonArray = jObject.getJsonArray("items");

        


        JsonArray carparkDataObject = jsonArray.getJsonObject(0).getJsonArray("carpark_data");
        //System.out.println("carparkDataArray: " + carparkDataObject);
        List<Carpark> carparks = new ArrayList<>();

        
        for(int i = 0; i< carparkDataObject.size() ; i++){
            Carpark c = new Carpark();

            //FIX HERE
            JsonObject carparkinfoObject = carparkDataObject.getJsonObject(i);
            System.out.println("carparkinfoObject = : " +carparkinfoObject);//THis prints


            JsonArray carparkinfoArray = carparkinfoObject.getJsonArray("carpark_info");
            System.out.println("carparkinfoArray = : " +carparkinfoArray);

            c.setCarpark_number(carparkinfoObject.getString("carpark_number"));
            JsonObject infoArray = carparkinfoArray.getJsonObject(0);
            System.out.println("info array" + infoArray);
            
            c.setTotal_lots(infoArray.getString("total_lots"));
            c.setLots_available(infoArray.getString("lots_available"));
            carparks.add(c);
        }
        return carparks;
    }
}
