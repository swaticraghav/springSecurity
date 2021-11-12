package com.rest.web.services.interfaces;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.rest.web.services.model.Product;


@Path("/productservice")
public interface ProductService {

	
	@Path("/products")
	@GET
	public List<Product> getProducts();
	
	@Path("/products")
	@POST
	public Product addProduct(Product product);
}
