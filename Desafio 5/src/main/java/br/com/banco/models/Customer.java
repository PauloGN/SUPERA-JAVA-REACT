package br.com.banco.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

    @Id//chave primaria
    @Column(name = "customerNumber")//nome igual a da tabela no DB
    public int customerNumber;

    @Column(name = "customerName")//nome igual a da tabela no DB
    public String customerName;

    @Column(name = "city")//nome igual a da tabela no DB
    public String city;

   // contactLastName
   // contactFirstName
   // phone
   // addressLine1
   // addressLine2
   // state
   // postalCode
   // country
   // salesRepEmployeeNumber
   // creditLimit


}
