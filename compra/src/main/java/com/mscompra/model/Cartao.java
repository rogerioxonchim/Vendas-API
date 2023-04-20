package com.mscompra.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.math.BigDecimal;

/**
 * @author Rogério Xonchim Alves Corrêa
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@ToString
public class Cartao {

    private String numero;
    private BigDecimal limiteDisponivel;
}
