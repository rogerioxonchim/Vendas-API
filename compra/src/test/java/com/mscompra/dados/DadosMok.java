package com.mscompra.dados;

import com.mscompra.model.Pedido;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Rogério Xonchim Alves Corrêa
 */
@UtilityClass
public class DadosMok {

    public Pedido getPedido() {
        return Pedido.builder()
                .nome("Lucas Barros")
                .produto(1L)
                .valor(BigDecimal.TEN)
                .dataCompra(new Date())
                .cpfCliente("111.222.333-44")
                .cep("12345678")
                .email("lucas-barros28@hotmail.com")
                .build();
    }

    public Pedido getPedidoSalvo() {
        return Pedido.builder()
                .id(1L)
                .nome("Lucas Barros")
                .produto(1L)
                .valor(BigDecimal.TEN)
                .dataCompra(new Date())
                .cpfCliente("111.222.333-44")
                .cep("12345678")
                .email("lucas-barros28@hotmail.com")
                .build();
    }
}
