package br.com.designpattern.TemplateMethod.solucao;

import br.com.designpattern.TemplateMethod.VeiculoParaReparo;

public class RepararoVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public RepararoVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }

    @Override
    protected void entradaOficina() {
        System.out.println("Entrando na oficina, meu carro é simples mas está quitado :)");
    }
}
