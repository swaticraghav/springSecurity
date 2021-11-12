package com.rest.web.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.web.services.interfaces.ProductService;
import com.rest.web.services.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	List<Product> products = new ArrayList<>();
	private int id;

	ProductServiceImpl() {
		init();
	}

	private void init() {
		Product product = new Product();
		product.setId(++id);
		product.setDescription("Apple");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public Product addProduct(Product product) {
		product.setId(++id);
		products.add(product);
		return product;
	}

}
