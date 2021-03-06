package br.com.siecola.aws_project01.controller;

<<<<<<< HEAD
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.siecola.aws_project01.model.Product;
import br.com.siecola.aws_project01.repository.ProductRepository;
=======
import br.com.siecola.aws_project01.model.Product;
import br.com.siecola.aws_project01.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
>>>>>>> 9f8a9a8b39a0c5269ae337f88ce6766d537a8a35

@RestController
@RequestMapping("/api/products")
public class ProductController {
<<<<<<< HEAD
	
	private ProductRepository productRepository;
	
	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@GetMapping
	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable long id) {
		Optional<Product> optProduct = productRepository.findById(id);
		if (optProduct.isPresent()) {
			return new ResponseEntity<Product>(optProduct.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<Product> saveProduct(@RequestBody @Valid Product product) {
		return new ResponseEntity<Product>(productRepository.save(product), HttpStatus.CREATED);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Product> updateProduct(@RequestBody @Valid Product product, @PathVariable("id") long id) {
		if (productRepository.existsById(id)) {
			product.setId(id);
			return new ResponseEntity<Product>(productRepository.save(product), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") long id) {
		Optional<Product> optProduct = productRepository.findById(id);
		if (optProduct.isPresent()) {
			Product product = optProduct.get();
			productRepository.delete(product);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping(path = "/bycode")
	public ResponseEntity<Product> findByCode(@RequestParam String code) {
		Optional<Product> optProduct = productRepository.findByCode(code);
		if (optProduct.isPresent()) {
			return new ResponseEntity<Product>(optProduct.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
=======

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable long id) {
        Optional<Product> optProduct = productRepository.findById(id);
        if (optProduct.isPresent()) {
            return new ResponseEntity<Product>(optProduct.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(
            @RequestBody @Valid Product product) {
        return new ResponseEntity<Product>(productRepository.save(product),
                HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Product> updateProduct(
            @RequestBody @Valid Product product, @PathVariable("id") long id) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return new ResponseEntity<Product>(productRepository.save(product),
                    HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/bycode")
    public ResponseEntity<Product> findByCode(@RequestParam String code) {
        Optional<Product> optProduct = productRepository.findByCode(code);
        if (optProduct.isPresent()) {
            return new ResponseEntity<Product>(optProduct.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
>>>>>>> 9f8a9a8b39a0c5269ae337f88ce6766d537a8a35

}
