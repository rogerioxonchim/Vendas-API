package com.mscompra.repository;

import com.mscompra.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rogério Xonchim Alves Corrêa
 */
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
