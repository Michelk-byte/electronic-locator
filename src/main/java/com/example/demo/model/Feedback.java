package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idC;
    private String Fname;
    private String Lname;
    private String Email;
    private String num;
    private String feedback;

    public Feedback(Long id, Long idC, String fname, String lname, String email, String num, String feedback) {
        this.id = id;
        this.idC = idC;
        Fname = fname;
        Lname = lname;
        Email = email;
        this.num = num;
        this.feedback = feedback;
    }

    public Feedback() {
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", idC=" + idC +
                ", Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", Email='" + Email + '\'' +
                ", num='" + num + '\'' +
                ", feedback='" + feedback + '\'' +
                '}';
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

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
