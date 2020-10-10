package br.com.siecola.aws_project01.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.siecola.aws_project01.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	Optional<Product> findByCode(String code);
	
}
