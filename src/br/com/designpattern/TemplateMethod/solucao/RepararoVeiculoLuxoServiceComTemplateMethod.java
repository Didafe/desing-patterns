package br.com.designpattern.TemplateMethod.solucao;

import br.com.designpattern.TemplateMethod.VeiculoParaReparo;

public class RepararoVeiculoLuxoServiceComTemplateMethod extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public RepararoVeiculoLuxoServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {

        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }


}
