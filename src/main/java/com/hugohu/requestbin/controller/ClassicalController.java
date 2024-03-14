package com.hugohu.requestbin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("classic")
public class ClassicalController {

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getParam(@RequestParam final String test) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "get/{getId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getPathAttribute(@PathVariable final String getId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "post", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postTest(@RequestBody final String dataObject) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
