package br.com.designpattern.chainofresponsibility.solucao;

import br.com.designpattern.chainofresponsibility.Carro;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsibility {

    public BigDecimal calculaValorVenda(Carro carro) {
        DescontoCarro desconto = new DescontoCarroFIAT(
                new DescontoCarroFORD(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDireitoADesconto(null))));
        return desconto.aplicaDesconto(carro);

    }
}
