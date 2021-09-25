/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Wanderson
 */
public class Consulta {
    @Getter
    @Setter
   private Medico medico;
   private Paciente paciente;
   private LocalDate data;
   private LocalTime hora;
   
}
