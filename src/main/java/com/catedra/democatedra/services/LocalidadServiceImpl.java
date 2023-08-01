package com.catedra.democatedra.services;

import com.catedra.democatedra.entities.Localidad;
import com.catedra.democatedra.repositories.BaseRepository;
import com.catedra.democatedra.repositories.LocalidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);


    }
}
