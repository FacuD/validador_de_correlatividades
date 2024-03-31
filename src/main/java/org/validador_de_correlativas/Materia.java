package org.validador_de_correlativas;

import java.util.List;

public class Materia {
  boolean aprobada;
  List<Materia> correlativas;

  Materia(boolean aprobada, List<Materia> correlativas){
    this.aprobada = aprobada;
    this.correlativas = correlativas;
  }

  public boolean aprobada() {
    return this.aprobada;
  }

  boolean correlativas_aprobadas() {
    if (this.correlativas == null)
      return true;
    return correlativas.stream().allMatch(Materia::aprobada);
  }
}
