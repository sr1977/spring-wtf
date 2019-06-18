package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<String> pong(@RequestBody String body) {
        return new ResponseEntity<>("FINISHED: " + body.length(), HttpStatus.OK);
    }
}
