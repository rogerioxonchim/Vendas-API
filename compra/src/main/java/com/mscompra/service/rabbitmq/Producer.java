package com.mscompra.service.rabbitmq;

import com.mscompra.model.Pedido;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rogério Xonchim Alves Corrêa
 */

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class Producer {

    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    @PostMapping
    public void enviarPedido(Pedido pedido) {
        rabbitTemplate.convertAndSend(queue.getName(), pedido);
    }
}
