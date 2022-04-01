package com.javatpoint;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@Autowired
	private SalesRespository salesrespo;

	@GetMapping(value = "/product")
	public List<Product> getProduct() {
		List<Product> products = productService.findAll();
		return products;
	}

	@PostMapping(value = "/users")
	public Product createUser(@Valid @RequestBody Product user) {
		return user;
	}
	
	@GetMapping(value = "/sales")
	public List<sales> getSales() {
		List<sales> products = (List<sales>) salesrespo.findAll();
		return products;
	}
}
