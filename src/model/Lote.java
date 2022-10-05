package model;

import java.util.Objects;

public class Lote {
    private int quantidade;
    private String dataV;
    private Produto produto;

    public Lote(Produto produto ,int quantidade, String dataV) {
        this.quantidade = quantidade;
        this.dataV = dataV;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataV() {
        return dataV;
    }

    public void setDataV(String dataV) {
        this.dataV = dataV;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lote lote)) return false;
        return getQuantidade() == lote.getQuantidade() && Objects.equals(getDataV(), lote.getDataV()) && Objects.equals(getProduto(), lote.getProduto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantidade(), getDataV(), getProduto());
    }
}
