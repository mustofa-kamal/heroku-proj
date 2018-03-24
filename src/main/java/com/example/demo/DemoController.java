package com.example.demo;


import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController

@RequestMapping(value =
        {
                "/policy"
        })


public class DemoController {

    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value="/q")

    public ResponseEntity<String> getPolicyByMap(
            @RequestParam Map<String,String> params){

        String jsonString = new JSONObject()
                .put("JSON1", "Hello World!")
                .put("JSON2", "Hello my World!")
                .put("JSON3", new JSONObject()
                        .put("key1", "value1")).toString();


        try {

            return new ResponseEntity(jsonString, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
