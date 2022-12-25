package br.com.banco.repositories;

import br.com.banco.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product> {

    //Opera dentro do Banco

    @Query("SELECT p FROM Product p where p.buyPrice >= :price")//: price vem do argumento da função
    List<Product> findPriceAbove(double price);


}
