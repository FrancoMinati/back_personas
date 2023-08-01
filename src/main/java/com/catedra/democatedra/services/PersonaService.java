package com.catedra.democatedra.services;

import com.catedra.democatedra.dtos.PersonaDto;
import com.catedra.democatedra.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, PersonaDto, Long> {
    List<PersonaDto> search(String filtro) throws Exception;

    Page<PersonaDto> search(String filtro, Pageable pageable) throws Exception;
}
