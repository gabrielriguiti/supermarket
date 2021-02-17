package br.com.riguitech.supermarket.model.entity;

/**
 * @version 1.1
 * @since v1.0
 */
public class Produto {

    private Long codigo;
    private String descricao;
    private String complemento;
    private Long codBarras;
    private String marca;
    private Double percDesconto;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Long getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(Long codBarras) {
        this.codBarras = codBarras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPercDesconto() {
        return percDesconto;
    }

    public void setPercDesconto(Double percDesconto) {
        this.percDesconto = percDesconto;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", complemento='" + complemento + '\'' +
                ", codBarras=" + codBarras +
                ", marca='" + marca + '\'' +
                '}';
    }
}
