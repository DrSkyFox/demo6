package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BodyController {

    @PostMapping("/post")
    public ResponseEntity<BodyResp> post(@RequestBody BodyOne bodyOne) {

        return ResponseEntity.ok(new BodyResp("test"));
    }


}
