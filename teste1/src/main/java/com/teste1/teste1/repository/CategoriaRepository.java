package com.teste1.teste1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste1.teste1.entity.Categoria; 

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}