package br.com.riguitech.supermarket.model.entity;

/**
 * @version 1.1
 * @since v1.0
 */
public class ItemCarrinho {

    private Carrinho idCarrinho;
    private Produto produto;
    private Double quantidade;
    private Double vlrItem;
    private Double percDesc;
    private Double vlrDesc;

    public Carrinho getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(Carrinho idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

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

    public Double getVlrItem() {
        return vlrItem;
    }

    public void setVlrItem(Double vlrItem) {
        this.vlrItem = vlrItem;
    }

    public Double getPercDesc() {
        return percDesc;
    }

    public void setPercDesc(Double percDesc) {
        this.percDesc = percDesc;
    }

    public Double getVlrDesc() {
        return vlrDesc;
    }

    public void setVlrDesc(Double vlrDesc) {
        this.vlrDesc = vlrDesc;
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" +
                "idCarrinho=" + idCarrinho +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", vlrItem=" + vlrItem +
                ", percDesc=" + percDesc +
                ", vlrDesc=" + vlrDesc +
                '}';
    }
}
