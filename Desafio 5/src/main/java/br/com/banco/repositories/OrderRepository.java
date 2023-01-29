package br.com.banco.repositories;

import br.com.banco.models.Customer;
import br.com.banco.models.Order;
import br.com.banco.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {

    //msql = '=='

   // @Query("SELECT d FROM Order d left join fetch d.customer c where d.orderDate = :date")//: price vem do argumento da função
    List<Order> findByOrderDate(LocalDate date);

    //nomenclatura para simples consultas
    List<Order> findByStatus(String status);

    /*
    *
    *
    * */

}
