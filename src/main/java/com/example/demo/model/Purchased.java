package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="purchased")
public class Purchased {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idC;
    private Long idI;
    private String img;
    private String name;
    private Long price;
    private Long qty;

    @Override
    public String toString() {
        return "Purchased{" +
                "id=" + id +
                ", idC=" + idC +
                ", idI=" + idI +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public Purchased() {

    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Purchased(Long id, Long idC, Long idI, String img, String name, Long price, Long qty) {
        this.id = id;
        this.idC = idC;
        this.idI = idI;
        this.img = img;
        this.name = name;
        this.price = price*qty;
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public Long getIdI() {
        return idI;
    }

    public void setIdI(Long idI) {
        this.idI = idI;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }
}


