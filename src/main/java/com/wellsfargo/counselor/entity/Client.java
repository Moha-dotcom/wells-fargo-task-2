package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity(name = "CLIENTS")
public class Client {

    private @Id @GeneratedValue int clientId;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisor;
    private     @Column(nullable = false) String firstName;
    private     @Column(nullable = false) String lastName;
    private    @Column(nullable = false) Address Address;
    private     @Column(nullable = false)String phoneNumber;
    private    @Column(nullable = false) String email;

    public Client() {
    }

    public Client(int clientId, Advisor advisor, String firstName, String lastName, com.wellsfargo.counselor.entity.Address address, String phoneNumber, String email) {
        this.clientId = clientId;
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        Address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public com.wellsfargo.counselor.entity.Address getAddress() {
        return Address;
    }

    public void setAddress(com.wellsfargo.counselor.entity.Address address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
