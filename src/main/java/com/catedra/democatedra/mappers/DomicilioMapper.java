package com.catedra.democatedra.mappers;

import com.catedra.democatedra.dtos.DomicilioDto;
import com.catedra.democatedra.entities.Domicilio;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DomicilioMapper extends BaseMapper<Domicilio, DomicilioDto> {
    DomicilioDto toDTO(Domicilio source);
    Domicilio toEntity(DomicilioDto source);

    List<DomicilioDto> toDTOsList(List<Domicilio> source);
    List<Domicilio> toEntitiesList(List<DomicilioDto> source);
}
