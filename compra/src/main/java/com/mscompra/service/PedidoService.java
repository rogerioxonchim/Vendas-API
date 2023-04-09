package com.mscompra.service;

import com.mscompra.model.Pedido;
import com.mscompra.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Rogério Xonchim Alves Corrêa
 */
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
