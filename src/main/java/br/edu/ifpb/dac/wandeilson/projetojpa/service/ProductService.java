package br.edu.ifpb.dac.wandeilson.projetojpa.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.wandeilson.projetojpa.model.Product;
import br.edu.ifpb.dac.wandeilson.projetojpa.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public String save (String name, String description, BigDecimal price) {
		Product product = new Product(name, description, price);
		productRepository.save(product);
		return "Produto salvo com sucesso";
	}
}
