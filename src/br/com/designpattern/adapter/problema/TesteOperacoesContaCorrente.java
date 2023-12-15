package br.com.designpattern.adapter.problema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);
        if(client.validaSaldo(valorPretendidoParaSaque)){ // 1° Chamada
            client.saca(valorPretendidoParaSaque); // 2° Chamada
        }

        client.deposita(new BigDecimal(500)); // 3° Chamada
    }
}
