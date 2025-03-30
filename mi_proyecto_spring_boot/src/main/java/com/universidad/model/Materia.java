package com.universidad.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Materia{
    private Long id;
    private String nombreMateria;
    private String codigoUnico;
    private Integer creditos;
}
