package br.com.siecola.aws_project01.repository;

<<<<<<< HEAD
import java.util.Optional;

import br.com.siecola.aws_project01.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Optional<Product> findByCode(String code);
	
=======
import br.com.siecola.aws_project01.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findByCode(String code);

>>>>>>> 9f8a9a8b39a0c5269ae337f88ce6766d537a8a35
}
