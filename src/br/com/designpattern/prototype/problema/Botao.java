package br.com.designpattern.prototype.problema;

public class Botao {
    protected String cor;
    protected int largura;
    protected int altura;
    protected TipoBordaEnum tipoborda;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public TipoBordaEnum getTipoborda() {
        return tipoborda;
    }

    public void setTipoborda(TipoBordaEnum tipoborda) {
        this.tipoborda = tipoborda;
    }

    @Override
    public String toString() {
        return "Botao{" +
                "cor='" + cor + '\'' +
                ", largura=" + largura +
                ", altura=" + altura +
                ", tipoborda=" + tipoborda +
                '}';
    }
}
