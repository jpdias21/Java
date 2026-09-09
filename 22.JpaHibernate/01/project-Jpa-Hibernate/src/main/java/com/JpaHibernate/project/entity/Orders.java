package com.JpaHibernate.project.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Integer total;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;


    ////
    @ManyToMany(mappedBy = "orders")
    private List<Products> products;

    public Orders() {
    }

    public Orders(Date date, Integer total) {
        this.date = date;
        this.total = total;
    }

    public Long getId() {
        return id;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }

    public List<Products> getProduct() {
        return products;
    }

    public void setProduct(List<Products> products) {
        this.products = products;
    }
}
