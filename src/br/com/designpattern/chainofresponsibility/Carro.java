package br.com.designpattern.chainofresponsibility;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Carro {

    private Marca marca;

    private String modelo;

    private BigDecimal preco;

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        NumberFormat formatador = NumberFormat.getCurrencyInstance();
        return "Carro{" +
                "marca=" + marca +
                ", modelo='" + modelo + '\'' +
                ", preco=" + formatador.format(preco) +
                '}';
    }
}
