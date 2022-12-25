package br.com.banco.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id//chave primaria
    @Column(name = "productCode")
    public String productCode;

    @Column(name = "productName")
    public String productName;

    @Column(name = "productLine")
    public String productLine;

    @Column(name = "productScale")
    public String productScale;

    @Column(name = "productVendor")
    public String productVendor;

    @Column(name = "productDescription")
    public String productDescription;

    @Column(name = "quantityInStock")
    public int quantityInStock;

    @Column(name = "buyPrice")
    public double buyPrice;

    @Column(name = "MSRP")
    public double MSRP;

}
