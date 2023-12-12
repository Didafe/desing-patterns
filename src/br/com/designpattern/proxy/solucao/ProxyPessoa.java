package br.com.designpattern.proxy.solucao;

import br.com.designpattern.builder.Pessoa;

public interface ProxyPessoa {
    void save(Pessoa pessoa);

    Pessoa findById(Long id);
}
