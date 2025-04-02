package com.intern.calorienormalizer.controller;

import com.intern.calorienormalizer.service.EntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entity")
@RequiredArgsConstructor
public class EntityController {

    private final EntityService service;


}
