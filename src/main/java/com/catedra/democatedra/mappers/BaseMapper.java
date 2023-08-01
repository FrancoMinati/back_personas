package com.catedra.democatedra.mappers;

import com.catedra.democatedra.dtos.BaseDto;
import com.catedra.democatedra.entities.Base;

import java.util.List;

public interface BaseMapper<E extends Base, D extends BaseDto> {
    D toDTO(E source);
    E toEntity(D source);
    List<D> toDTOsList(List<E> source);
    List<E> toEntitiesList(List<D> source);
}
