package br.com.designpattern.proxy;

import br.com.designpattern.builder.Pessoa;
import br.com.designpattern.proxy.solucao.PessoaRepositoryProxy;
import br.com.designpattern.proxy.solucao.ProxyPessoa;

public class PessoaService {

   private ProxyPessoa proxyPessoa;

    public PessoaService(ProxyPessoa proxyPessoa){
        this.proxyPessoa = proxyPessoa;
    }

    public void save(Pessoa pessoa){
        proxyPessoa.save(pessoa);
    }

    public Pessoa findById(Long id) {
        return proxyPessoa.findById(id);
    }

}
