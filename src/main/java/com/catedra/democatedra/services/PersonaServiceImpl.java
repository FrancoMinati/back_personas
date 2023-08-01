package com.catedra.democatedra.services;

import com.catedra.democatedra.dtos.AltaPersonaDto;
import com.catedra.democatedra.dtos.PersonaDto;
import com.catedra.democatedra.entities.Persona;
import com.catedra.democatedra.exceptions.ServicioException;
import com.catedra.democatedra.mappers.BaseMapper;
import com.catedra.democatedra.mappers.PersonaMapper;
import com.catedra.democatedra.repositories.BaseRepository;
import com.catedra.democatedra.repositories.PersonaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, PersonaDto, Long> implements PersonaService {

    private PersonaRepository personaRepository;

    private PersonaMapper personaMapper;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, BaseMapper<Persona, PersonaDto> baseMapper, PersonaRepository personaRepository, PersonaMapper personaMapper) {
        super(baseRepository, baseMapper);
        this.personaMapper = personaMapper;
        this.personaRepository = personaRepository;
    }

    @Override
    public List<PersonaDto> search(String filtro) throws ServicioException {
        try {
            List<Persona> personas = personaRepository.search(filtro);

            return baseMapper.toDTOsList(personas);
        } catch (Exception e) {
            throw new ServicioException(e.getMessage());
        }
    }

    @Override
    public Page<PersonaDto> search(String filtro, Pageable pageable) throws ServicioException {
        try {
            Page<Persona> personas = personaRepository.search(filtro, pageable);
            return personas.map(baseMapper::toDTO);
        } catch (Exception e) {
            throw new ServicioException(e.getMessage());
        }
    }

    public AltaPersonaDto altaCompleta(AltaPersonaDto altaPersonaDto) {
        return null;
    }
}
