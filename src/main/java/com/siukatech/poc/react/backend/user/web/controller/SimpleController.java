package com.siukatech.poc.react.backend.user.web.controller;

import com.siukatech.poc.react.backend.core.web.annotation.base.RestApiController;
import com.siukatech.poc.react.backend.user.business.dto.SimpleDto;
import com.siukatech.poc.react.backend.user.business.form.SimpleForm;
import com.siukatech.poc.react.backend.user.business.mapper.SimpleMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestApiController
public class SimpleController {

    @GetMapping("/v1/public/simple-list")
    public ResponseEntity<List<String>> listSimple() {
        return ResponseEntity.ok(List.of("1", "2", "3"));
    }

    @PostMapping("/v1/public/simple-post")
    public ResponseEntity<?> postSimple(@RequestBody SimpleForm simpleForm) {
        SimpleMapper simpleMapper = Mappers.getMapper(SimpleMapper.class);
        SimpleDto simpleDto = simpleMapper.convertToSimpleDto(simpleForm);
        return ResponseEntity.ok(simpleDto);
    }

}
