package org.validador_de_correlativas;

import java.util.List;

public class Inscripcion {
  List<Materia> asignaturas;

  public Inscripcion(List<Materia> asignaturas) {
    this.asignaturas = asignaturas;
  }

  boolean aprobada(){
    return asignaturas.stream().allMatch(Materia::correlativas_aprobadas);
  }
}