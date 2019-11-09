package br.com.fundatec.camadas.repository;

import org.junit.Test;

public class PedidoRepositoryTest {
    @Test
    public void deveVerSeListouAlgumItem(){
        PedidoRepository pedidoRepository = new PedidoRepository();
        pedidoRepository.listar();
    }

}
