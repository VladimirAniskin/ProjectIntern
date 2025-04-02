package com.intern.calorienormalizer.mapper;
import com.intern.calorienormalizer.dto.EntityCreateDto;
import com.intern.calorienormalizer.entity.Entity;
import com.intern.calorienormalizer.dto.EntityDto;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntityMapper {

    Entity toEntity (EntityCreateDto dto);
    EntityDto toDto (Entity entity);
}
