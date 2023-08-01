package com.catedra.democatedra.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PersonaDto extends BaseDto {
    private String nombre;
    private String apellido;
    private int dni;
    private DomicilioDto domicilio;
}
