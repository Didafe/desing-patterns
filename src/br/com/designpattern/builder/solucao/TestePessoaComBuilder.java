package br.com.designpattern.builder.solucao;

import br.com.designpattern.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {

    public static void main(String[] args) {
        Pessoa pessoa =
                new Pessoa.PessoaBuilder()
                        .nome("Fernando")
                        .sobrenome("Sousa")
                        .documento("123456789989")
                        .email("teste@teste.com.br")
                        .apelido("Fer")
                        .dataNascimento(LocalDate.of(1981, 01, 01))
                        .build();

        System.out.println(pessoa);

        StringBuilder sb = new StringBuilder().append("palavra 1").append("palavra2");
        System.out.println(sb);
    }
}
