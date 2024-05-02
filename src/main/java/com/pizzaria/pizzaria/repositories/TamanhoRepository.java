package com.pizzaria.pizzaria.repositories;

import com.pizzaria.models.Tamanho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TamanhoRepository<Tamanho> extends JpaRepository<Tamanho, Long> {
}
