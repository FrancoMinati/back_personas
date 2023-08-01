package com.catedra.democatedra.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DomicilioDto extends BaseDto {
    private String calle;
    private int numero;
    private String localidad;
}
