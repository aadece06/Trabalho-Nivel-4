/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cadastroee.model;

import jakarta.persistence.Entity;

/**
 *
 * @author Misael
 */
@Entity
public class PessoaFisica extends Pessoa {

    private String cpf; // Cadastro de Pessoa Física

    public PessoaFisica() {
        super(); // Chama o construtor da classe pai
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome); // Chama o construtor da classe pai
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica [id=" + getId() + ", nome=" + getNome() + ", cpf=" + cpf + "]";
    }
}
