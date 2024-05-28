package br.com.alura.modelos;

public class Conta {
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double incluiCompra(double valor) {
        saldo -= valor;
        return saldo;
    }
}
