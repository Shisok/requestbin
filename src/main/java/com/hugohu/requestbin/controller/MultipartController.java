package com.hugohu.requestbin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("multipart")
public class MultipartController {

    @PostMapping(value = "test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> testMultipartFile(@RequestBody final MultipartFile dataObject) {
        File file = new File("src/main/resources/targetFile.tmp");

        try (OutputStream os = new FileOutputStream(file)) {
            os.write(dataObject.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
