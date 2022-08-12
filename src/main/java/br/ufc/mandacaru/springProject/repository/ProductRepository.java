package br.ufc.mandacaru.springProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufc.mandacaru.springProject.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findFirstByName (String name);
	List<Product> findAllByName (String name);

}
