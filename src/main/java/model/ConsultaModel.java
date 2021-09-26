/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Wanderson
 */
@NoArgsConstructor
@AllArgsConstructor

public class ConsultaModel {
    @Getter
    @Setter
    private MedicoModel medico;
    private PacienteModel paciente;
    private LocalDate data;
    private LocalTime hora;

}
