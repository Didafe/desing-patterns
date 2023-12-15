package br.com.designpattern.chainofresponsibility.problema;

import br.com.designpattern.chainofresponsibility.Carro;
import br.com.designpattern.chainofresponsibility.Marca;

import java.math.BigDecimal;

public class VendaCarroService {

    public BigDecimal calculaValorVenda(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        if (Marca.FIAT.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(1000));
        }

        if (Marca.FORD.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000));
        }

        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0){
            return valorVenda.subtract(new BigDecimal(10000));
        }

        return valorVenda;

//        if (Marca.CHEVROLET.equals(carro.getMarca())){
//            return valorVenda.subtract(new BigDecimal(3000));
//        }
    }
}
