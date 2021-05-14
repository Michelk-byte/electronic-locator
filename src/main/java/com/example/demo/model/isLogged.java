package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="islogged")
public class isLogged {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idC;
    private String email;
    private String password;
    private String firstN;
    private String lastN;

    @Override
    public String toString() {
        return "isLogged{" +
                "id=" + id +
                ", idC=" + idC +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstN='" + firstN + '\'' +
                ", lastN='" + lastN + '\'' +
                '}';
    }

    public isLogged(Long id, Long idC, String email, String password, String firstN, String lastN) {
        this.id=id;
        this.idC = idC;
        this.email = email;
        this.password = password;
        this.firstN = firstN;
        this.lastN = lastN;
    }

    public isLogged() {

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
