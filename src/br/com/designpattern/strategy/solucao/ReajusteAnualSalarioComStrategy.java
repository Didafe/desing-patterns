package br.com.designpattern.strategy.solucao;

import br.com.designpattern.strategy.Funcionario;

public class ReajusteAnualSalarioComStrategy {

    public void calculaReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador){
        calculador.calcularReajusteAnual(funcionario);
    }
}
