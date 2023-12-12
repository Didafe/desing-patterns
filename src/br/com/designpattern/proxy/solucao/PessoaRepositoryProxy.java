package br.com.designpattern.proxy.solucao;

import br.com.designpattern.builder.Pessoa;
import br.com.designpattern.proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa{

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private static Map<Long, Pessoa> cache = new HashMap<>();
    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do método save...");
        super.save(pessoa);
        log.info("Chamada do método save finalizada.");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do método findById...");
        long inicio = System.currentTimeMillis();

        Pessoa pessoa = null;
        if (Objects.nonNull(cache.get(id))){
            log.info("Está pegando do Cache");
            pessoa =  cache.get(id);
        }else {
            log.info("Está pegando do PessoaRepository");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
        log.info("Chamada do método findById finalizada.");
        long fim = System.currentTimeMillis();

        log.info("Tempo gasto na chamada... " + (fim - inicio));
        return pessoa;
    }
}
