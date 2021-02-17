package br.com.riguitech.supermarket.model.entity;

import java.util.Date;

/**
 * @version 1.0
 * @since v1.0
 */
public class Estoque {

    private Produto produto;
    private Double quantidade;
    private String controle;
    private Date dataValidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", controle='" + controle + '\'' +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
