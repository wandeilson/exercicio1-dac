package br.edu.ifpb.dac.wandeilson.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.dac.wandeilson.projetojpa.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
