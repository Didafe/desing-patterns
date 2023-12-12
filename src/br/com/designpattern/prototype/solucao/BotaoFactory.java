package br.com.designpattern.prototype.solucao;

import br.com.designpattern.prototype.problema.Botao;

public class BotaoFactory {
    public static Botao getInstance(Botao prototipo){
        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoborda(prototipo.getTipoborda());
        return clone;

    }

}
