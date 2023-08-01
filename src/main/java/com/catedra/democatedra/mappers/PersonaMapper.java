package com.catedra.democatedra.mappers;

import com.catedra.democatedra.dtos.PersonaDto;
import com.catedra.democatedra.entities.Persona;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonaMapper extends BaseMapper<Persona, PersonaDto> {
    PersonaDto toDTO(Persona source);
    Persona toEntity(PersonaDto source);

    List<PersonaDto> toDTOsList(List<Persona> source);
    List<Persona> toEntitiesList(List<PersonaDto> source);
}
