package com.intern.calorienormalizer.controller;

import com.intern.calorienormalizer.dto.EntityCreateDto;
import com.intern.calorienormalizer.dto.EntityDto;
import com.intern.calorienormalizer.service.EntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entity")
@RequiredArgsConstructor
public class EntityController {
    private EntityService service;

    @PostMapping
    public ResponseEntity<EntityDto> create (@RequestBody EntityCreateDto entityCreateDto){
        return ResponseEntity.ok(service.create(entityCreateDto));
    }


}
