package br.com.siecola.aws_project01.repository;

import java.util.Optional;

import br.com.siecola.aws_project01.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Optional<Product> findByCode(String code);
	
}
