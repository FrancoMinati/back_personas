package com.catedra.democatedra.services;

import com.catedra.democatedra.dtos.DomicilioDto;
import com.catedra.democatedra.entities.Domicilio;
import com.catedra.democatedra.mappers.BaseMapper;
import com.catedra.democatedra.mappers.DomicilioMapper;
import com.catedra.democatedra.repositories.BaseRepository;
import com.catedra.democatedra.repositories.DomicilioRepository;

public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, DomicilioDto, Long> implements DomicilioService {

    private DomicilioRepository domicilioRepository;

    private DomicilioMapper domicilioMapper;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, BaseMapper<Domicilio, DomicilioDto> baseMapper, DomicilioRepository domicilioRepository, DomicilioMapper domicilioMapper) {
        super(baseRepository, baseMapper);
        this.domicilioRepository = domicilioRepository;
        this.domicilioMapper = domicilioMapper;
    }
}
