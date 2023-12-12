package br.com.designpattern.factorymethods;

public class Produto {
    private String descrição;
    private String preco;
    private Boolean possuiDimensoesFisicas;

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Boolean getPossuiDimensoesFisicas() {
        return possuiDimensoesFisicas;
    }

    public void setPossuiDimensoesFisicas(Boolean possuiDimensoesFisicas) {
        this.possuiDimensoesFisicas = possuiDimensoesFisicas;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descrição='" + descrição + '\'' +
                ", preco='" + preco + '\'' +
                ", possuiDimensoesFisicas=" + possuiDimensoesFisicas +
                '}';
    }
}
