package br.com.designpattern.proxy.solucao;

import br.com.designpattern.builder.Pessoa;
import br.com.designpattern.proxy.PessoaService;

import java.time.LocalDate;

public class TestePessoaComProxy {

    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(novoPessoaRepositoryProxy);

        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .sobrenome("Sousa")
                .dataNascimento(LocalDate.of(1981, 01, 01))
                .nome("Fernando")
                .apelido("Fer")
                .documento("12345678911")
                .build();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);
    }
}
