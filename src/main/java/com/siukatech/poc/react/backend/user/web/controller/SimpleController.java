package com.siukatech.poc.react.backend.user.web.controller;

import com.siukatech.poc.react.backend.core.web.annotation.base.RestApiController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestApiController
public class SimpleController {

    @GetMapping("/v1/public/simple-list")
    public ResponseEntity<List<String>> listSimple() {
        return ResponseEntity.ok(List.of("1", "2", "3"));
    }

}
