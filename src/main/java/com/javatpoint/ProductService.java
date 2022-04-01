package com.javatpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
	@Override
	public List<Product> findAll() {
		ArrayList<Product> products = new ArrayList<Product>();
		Map<String, String> map = new HashMap<>();
		map.put("sat", "some");
		map.put("rat", "some");
		products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6,map));
		products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3,map));
		return products;
	}
}
