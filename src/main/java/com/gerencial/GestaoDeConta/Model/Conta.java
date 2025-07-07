package com.gerencial.GestaoDeConta.Model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Pessoa pessoa;
    private Integer numero;
    private BigDecimal saldo;
    private boolean ativo;
    private LocalDateTime dataCadastro;
    
}
