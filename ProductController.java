package br.edu.ifpb.dac.wandeilson.projetojpa.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifpb.dac.wandeilson.projetojpa.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	public void save (String name, String description, BigDecimal price) {
		 System.out.println(productService.save(name, description, price));
	}
	
	public  List<?> getAll() {
		return productService.getAll();
	}
}
