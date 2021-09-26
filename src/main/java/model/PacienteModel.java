/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
@Getter
@Setter
public class PacienteModel {

    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
}
