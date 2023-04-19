package com.mscompra.service;

import com.mscompra.model.Pedido;
import com.mscompra.repository.PedidoRepository;
import com.mscompra.service.exception.NegocioException;
import com.mscompra.service.rabbitmq.Producer;
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
    private final Producer producer;

    public Pedido salvar(Pedido pedido) {
        pedido = pedidoRepository.save(pedido);
        producer.enviarPedido(pedido);
        return pedido;
    }

    public Pedido buscarOuFalharPorId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(()-> new NegocioException("O pedido de id: " + id + " nao existe na base de dados!"));
    }

    public void excluir(Long id) {
        Pedido pedido = buscarOuFalharPorId(id);
        pedidoRepository.deleteById(pedido.getId());
    }
}
