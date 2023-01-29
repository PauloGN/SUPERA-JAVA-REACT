package br.com.banco.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id//chave primaria
    @Column(name = "orderNumber")//nome igual a da tabela no DB
    public int orderNumber;

    @Column(name = "orderDate")//nome igual a da tabela no DB
    public LocalDate orderDate; // obj Date mySql

    @Column(name = "requiredDate")//nome igual a da tabela no DB
    public LocalDate requiredDate;

    @Column(name = "shippedDate")//nome igual a da tabela no DB
    public LocalDate shippedDate;

    @Column(name = "status")//nome igual a da tabela no DB
    public String status;

    @Column(name = "comments")//nome igual a da tabela no DB
    public String comments;

    //Foreign key
    //@Column(name = "customerNumber")//nome igual a da tabela no DB
    //public int customerNumber;

    //usando uma coluna que é o id da foreign
  //  @ManyToOne(fetch = FetchType.LAZY) // memory performance
  //  @JoinColumn(name = "customerNumber")//nome igual a da tabela no DB
  //  //@JsonInclude(JsonInclude.Include.NON_NULL)
  //  public Customer customer;

}
