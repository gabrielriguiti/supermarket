package br.com.riguitech.supermarket.model.entity;

import java.util.Date;

/**
 * @version 1.0
 * @since v1.0
 */
public class TabelaPreco {

    private Produto produto;
    private Double vlrVenda;
    private Date dataAtualizacao;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getVlrVenda() {
        return vlrVenda;
    }

    public void setVlrVenda(Double vlrVenda) {
        this.vlrVenda = vlrVenda;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "TabelaPreco{" +
                "produto=" + produto +
                ", vlrVenda=" + vlrVenda +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }
}
