package com.packt.webstore.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Product;

public interface ProductService {

	 List <Product> getAllProducts();
	 List<Product> getProductsByCategory(String category); 
	 List<Product> getProductsByFilter(Map<String, List<String>>filterParams); 
	 List<Product> getFilterProducts(Map<String, Object> params); 
	 Product getProductById(String productID); 
	 void updateAllStock(); 
	 void addProduct(Product product); 
	  
}
