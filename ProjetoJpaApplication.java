package br.edu.ifpb.dac.wandeilson.projetojpa;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifpb.dac.wandeilson.projetojpa.controller.ProductController;
import br.edu.ifpb.dac.wandeilson.projetojpa.model.Product;

@SpringBootApplication
public class ProjetoJpaApplication implements CommandLineRunner{
	
	@Autowired
	private ProductController productController;
	
	private Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(ProjetoJpaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		String menu = "1- Cadastrar novo produto. "
				+ "\n2- Mostrar todos produtos. \n3- Sair. \nOpção:";
		System.out.println(menu);
		
		int opcao = Integer.parseInt(s.nextLine());
		
		while(opcao != 3) {
			if(opcao == 1) {
				System.out.print("Nome:");
				String name = s.nextLine();
				System.out.print("Descrição:");
				String description = s.nextLine();
				System.out.print("Preço:");
				BigDecimal price = BigDecimal.valueOf(s.nextDouble());
				productController.save(name, description, price);
				System.out.println(menu);
				s = new Scanner(System.in);
				opcao = Integer.parseInt(s.nextLine());
			}
			if(opcao == 2) {
				List<Product> allProducts = (List<Product>) productController.getAll();
				System.out.println("Todos produtos cadastrados:\n");
				for(Product p : allProducts) {
					System.out.println(p);
				}
				System.out.println(menu);
				s = new Scanner(System.in);
				opcao = Integer.parseInt(s.nextLine());
			}
		}
		
	}

}
