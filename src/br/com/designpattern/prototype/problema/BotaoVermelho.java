package br.com.designpattern.prototype.problema;

public class BotaoVermelho extends Botao{

    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoborda(TipoBordaEnum.FINA);
    }
}
