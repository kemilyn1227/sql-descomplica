package com.teste1.teste1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste1.teste1.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}