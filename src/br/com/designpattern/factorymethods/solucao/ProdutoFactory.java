package br.com.designpattern.factorymethods.solucao;

import br.com.designpattern.factorymethods.Produto;
import br.com.designpattern.factorymethods.ProdutoDigital;
import br.com.designpattern.factorymethods.ProdutoFisico;
import br.com.designpattern.factorymethods.TipoProdutoEnum;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {

        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw  new IllegalArgumentException("Tipo de produto não disponível");
        }

    }

}
