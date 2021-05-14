package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;

    private String email;
    private String password;
    private String firstN;

    @Override
    public String toString() {
        return "Client{" +
                "idC=" + idC +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstN='" + firstN + '\'' +
                ", lastN='" + lastN + '\'' +
                '}';
    }

    private String lastN;

    public Client(Long idC, String email, String password, String firstN, String lastN) {
        this.idC = idC;
        this.email = email;
        this.password = password;
        this.firstN = firstN;
        this.lastN = lastN;
    }

    public Client() {

    }

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }
}
