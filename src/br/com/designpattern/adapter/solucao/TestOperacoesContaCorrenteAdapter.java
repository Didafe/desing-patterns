package br.com.designpattern.adapter.solucao;

import br.com.designpattern.adapter.problema.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TestOperacoesContaCorrenteAdapter {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
        ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        client.saca(valorPretendidoParaSaque); // 1° Chamada

        client.deposita(new BigDecimal(500)); // 2° Chamada
    }
}
