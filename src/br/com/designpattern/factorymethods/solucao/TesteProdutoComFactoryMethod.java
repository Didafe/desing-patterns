package br.com.designpattern.factorymethods.solucao;

import br.com.designpattern.factorymethods.Produto;
import br.com.designpattern.factorymethods.TipoProdutoEnum;

import java.util.Calendar;

public class TesteProdutoComFactoryMethod {

    public static void main(String[] args) {
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);

        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
    }
}
