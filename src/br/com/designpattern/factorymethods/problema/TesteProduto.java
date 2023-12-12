package br.com.designpattern.factorymethods.problema;

import br.com.designpattern.factorymethods.ProdutoDigital;
import br.com.designpattern.factorymethods.ProdutoFisico;

public class TesteProduto {

    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);

    }

}
