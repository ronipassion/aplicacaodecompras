package br.com.alura.modelos;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double valorResposta) {
        this.preco = valorResposta;
    }

    @Override
    public String toString() {
        return descricao + " - " + "R$" + preco;
    }

    @Override
    public int compareTo(Compra novaCompra) {
        return Double.compare(this.getPreco(), (novaCompra.getPreco()));
    }
}
