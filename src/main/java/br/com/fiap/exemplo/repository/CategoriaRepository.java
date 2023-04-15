package br.com.fiap.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.exemplo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
