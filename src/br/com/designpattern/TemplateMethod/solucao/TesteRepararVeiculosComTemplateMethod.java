package br.com.designpattern.TemplateMethod.solucao;

import br.com.designpattern.TemplateMethod.VeiculoParaReparo;

public class TesteRepararVeiculosComTemplateMethod {

    public static void main(String[] args) {
        System.out.println("-------------------LUXO------------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        ReparoVeiculoService rpl = new RepararoVeiculoLuxoServiceComTemplateMethod(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("-------------------COMUM------------------");
        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparoVeiculoService rpc = new RepararoVeiculoComumServiceComTemplateMethod(veiculoComum);

        rpc.reparaVeiculo();
    }
}
