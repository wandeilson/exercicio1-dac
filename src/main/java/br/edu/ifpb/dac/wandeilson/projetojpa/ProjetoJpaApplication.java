package br.edu.ifpb.dac.wandeilson.projetojpa;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifpb.dac.wandeilson.projetojpa.controller.ProductController;

@SpringBootApplication
public class ProjetoJpaApplication implements CommandLineRunner{
	
	@Autowired
	private ProductController productController;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoJpaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		productController.save("Notebook3", "Notebook bom", new BigDecimal(44));
		
	}

}
