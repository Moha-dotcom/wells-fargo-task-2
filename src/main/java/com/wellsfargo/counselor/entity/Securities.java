package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "SECURITIES")
public class Securities {
    private @Id @GeneratedValue int securityId;
    @ManyToOne
    @JoinColumn(name = "profolioId", nullable = false)
    private Profolio profolio;
    private String security_name;
    private String security_category;
    private LocalDate security_purchaseDate;
    private Double security_purchasePrice;
    private int quantity;


    public Securities() {
    }

    public Securities(int securityId, Profolio profolio, String security_name, String security_category, LocalDate security_purchaseDate, Double security_purchasePrice, int quantity) {
        this.securityId = securityId;
        this.profolio = profolio;
        this.security_name = security_name;
        this.security_category = security_category;
        this.security_purchaseDate = security_purchaseDate;
        this.security_purchasePrice = security_purchasePrice;
        this.quantity = quantity;
    }

    public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }

    public Profolio getProfolio() {
        return profolio;
    }

    public void setProfolio(Profolio profolio) {
        this.profolio = profolio;
    }

    public String getSecurity_name() {
        return security_name;
    }

    public void setSecurity_name(String security_name) {
        this.security_name = security_name;
    }

    public String getSecurity_category() {
        return security_category;
    }

    public void setSecurity_category(String security_category) {
        this.security_category = security_category;
    }

    public LocalDate getSecurity_purchaseDate() {
        return security_purchaseDate;
    }

    public void setSecurity_purchaseDate(LocalDate security_purchaseDate) {
        this.security_purchaseDate = security_purchaseDate;
    }

    public Double getSecurity_purchasePrice() {
        return security_purchasePrice;
    }

    public void setSecurity_purchasePrice(Double security_purchasePrice) {
        this.security_purchasePrice = security_purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
