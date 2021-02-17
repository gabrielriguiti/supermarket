package br.com.riguitech.supermarket.model.entity;

import br.com.riguitech.supermarket.model.enums.FormaPagamento;

import java.util.Arrays;
import java.util.Date;

/**
 * @version 1.1
 * @since v1.0
 */
public class Carrinho {

    private Long idCarrinho;
    private Cliente cliente;
    private ItemCarrinho[] itensCarrinho;
    private Date dataCompra;
    private Double valorCompra;
    private FormaPagamento formaPagamento;

    public Long getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(Long idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemCarrinho[] getItensCarrinho() {
        return itensCarrinho;
    }

    public void setItensCarrinho(ItemCarrinho[] itensCarrinho) {
        this.itensCarrinho = itensCarrinho;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "idCarrinho=" + idCarrinho +
                ", cliente=" + cliente +
                ", itensCarrinho=" + Arrays.toString(itensCarrinho) +
                ", dataCompra=" + dataCompra +
                ", valorCompra=" + valorCompra +
                ", formaPagamento=" + formaPagamento +
                '}';
    }
}
