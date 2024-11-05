/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cadastroee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Date;

/**
 *
 * @author Misael
 */
@Entity
public class Movimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idProduto; // ID do produto relacionado
    private int quantidade; // Quantidade movimentada
    private Date dataMovimento; // Data da movimentação

    public Movimento() {
    }

    public Movimento(Long idProduto, int quantidade, Date dataMovimento) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.dataMovimento = dataMovimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    @Override
    public String toString() {
        return "Movimento [id=" + id + ", idProduto=" + idProduto + ", quantidade=" + quantidade + ", dataMovimento=" + dataMovimento + "]";
    }
}
