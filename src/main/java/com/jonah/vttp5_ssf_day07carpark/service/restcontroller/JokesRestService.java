package com.jonah.vttp5_ssf_day07carpark.service.restcontroller;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jonah.vttp5_ssf_day07carpark.constant.Url;
import com.jonah.vttp5_ssf_day07carpark.model.Joke;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonReader;

@Service
public class JokesRestService {
    RestTemplate restTemplate = new RestTemplate();

    public List<Joke> getRandomTenJokes(){
    String jokesRawData = restTemplate.getForObject(Url.jokesUrl, String.class);
    JsonReader JsonReader = Json.createReader(new StringReader(jokesRawData));
    JsonArray jsonArray = JsonReader.readArray();

    List<Joke> jokes = new ArrayList<>();

    for(int i = 0; i<jsonArray.size(); i++){
        jokes.add(new Joke());
    }
    return jokes;
}
}
