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
public class PessoaJuridica extends Pessoa {

    private String cnpj; // Cadastro Nacional da Pessoa Jurídica

    public PessoaJuridica() {
        super(); // Chama o construtor da classe pai
    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome); // Chama o construtor da classe pai
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica [id=" + getId() + ", nome=" + getNome() + ", cnpj=" + cnpj + "]";
    }
}
