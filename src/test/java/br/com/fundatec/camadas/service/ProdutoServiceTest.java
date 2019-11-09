package br.com.fundatec.camadas.service;

import br.com.fundatec.camadas.model.Produto;
import br.com.fundatec.camadas.repository.ProdutoRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.*;

public class ProdutoServiceTest {
    ProdutoRepository produtoRepository;
    @Before
    public void setUp() throws Exception{
        produtoRepository = Mockito.mock((ProdutoRepository.class));
    }

    @Test
    public void deveConsultarUmProduto(){
        Produto p1 = new Produto( 1l ,"nome produto 1",1D );
        Produto p2 = new Produto(2l, "nome produto 2", 2D);
        Produto p3 = new Produto(3l,"nome produto 3", 3D);

        List<Produto> listaProduto = Arrays.asList(p1,p2,p3);

        Mockito.when()

    }




}
