package br.com.designpattern.TemplateMethod.problema;

import br.com.designpattern.TemplateMethod.VeiculoParaReparo;

public class TesteRepararVeiculos {

    public static void main(String[] args) {
        System.out.println("-------------------LUXO------------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        RepararVeiculoDeLuxoService rpl = new RepararVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("-------------------COMUM------------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);

        RepararVeiculoComumService rpc = new RepararVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}
