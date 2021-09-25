/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Wanderson
 */
public class Paciente {

    @Getter
    @Setter
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
}
