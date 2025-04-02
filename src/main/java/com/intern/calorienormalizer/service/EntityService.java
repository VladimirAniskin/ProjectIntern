package com.intern.calorienormalizer.service;

import com.intern.calorienormalizer.dto.EntityCreateDto;
import com.intern.calorienormalizer.dto.EntityDto;
import com.intern.calorienormalizer.mapper.EntityMapper;
import com.intern.calorienormalizer.repository.EntityRepository;
import org.springframework.transaction.annotation.Transactional;

public class EntityService {
    private EntityRepository repository;
    private EntityMapper mapper;

    @Transactional
    public EntityDto create(EntityCreateDto dto) {
        var entity = mapper.toEntity(dto);
        entity = repository.save(entity);
        return mapper.toDto(entity);
    }

}
