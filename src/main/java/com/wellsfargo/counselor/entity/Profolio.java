package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "PROFOLIO")
public class Profolio {
    private @Id
    @GeneratedValue int profolioId;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;
    @Column
    private LocalDate createDate;


    public Profolio() {
    }


    public Profolio(int profolioId, Client client, LocalDate createDate) {
        this.profolioId = profolioId;
        this.client = client;
        this.createDate = createDate;
    }

    public int getProfolioId() {
        return profolioId;
    }

    public void setProfolioId(int profolioId) {
        this.profolioId = profolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}