package org.validador_de_correlativas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class InscripcionTest {
  List<Materia> asignaturas = new ArrayList<>();
  List<Materia> amIICorrelativas = new ArrayList<>();
  List<Materia> sintaxisCorrelativas = new ArrayList<>();

  Materia aga = new Materia(true, null);
  Materia amI = new Materia(true, null);
  Materia ayed = new Materia(false, null);


  @Test
  void unaInscripcionConUnaSolaMateriaSinCorrelativasEsValida(){
    asignaturas.add(aga);

    Inscripcion inscripcionValida = new Inscripcion(asignaturas);
    assertTrue(inscripcionValida.aprobada());
  }

  @Test
  void unaInscripcionConUnaMateriaConCorrelativasAprobadasEsValida(){
    amIICorrelativas.add(amI);
    amIICorrelativas.add(aga);
    Materia amII = new Materia(false, amIICorrelativas);
    asignaturas.add(amII);

    Inscripcion inscripcionValida = new Inscripcion(asignaturas);
    assertTrue(inscripcionValida.aprobada());
  }

  @Test
  void unaInscripcionConUnaMateriaSinCorrelativasAprobadasEsInvalida(){
    sintaxisCorrelativas.add(ayed);
    Materia sintaxis = new Materia(false, sintaxisCorrelativas);
    asignaturas.add(sintaxis);

    Inscripcion inscripcionInvalida = new Inscripcion(asignaturas);
    assertFalse(inscripcionInvalida.aprobada());
  }

}