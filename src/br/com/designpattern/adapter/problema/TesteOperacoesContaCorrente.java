package br.com.designpattern.adapter.problema;

public class TesteOperacoesContaCorrente {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);
    }
}
