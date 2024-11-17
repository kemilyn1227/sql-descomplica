package com.teste1.teste1.entity;

import java.util.List;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

@Table(name = "categoria")

public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "categoria_id")
	private Integer categoriaId;

	@Column(name = "categoria_nome")
	private String categoriaNome;

	@OneToMany(mappedBy = "categoria")
	@JsonManagedReference
	private List<Produto> produtoList;

	public Integer getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getCategoriaNome() {
		return categoriaNome;
	}

	public void setCategoriaNome(String categoriaNome) {
		this.categoriaNome = categoriaNome;
	}

	public List<Produto> getProdutoList() {
		return produtoList;
	}

	public void setProdutoList(List<Produto> produtoList) {
		this.produtoList = produtoList;
	}

}
