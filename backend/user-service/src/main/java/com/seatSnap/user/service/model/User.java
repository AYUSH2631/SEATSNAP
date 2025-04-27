package com.seatSnap.user.service.model;

import com.seatSnap.Role;
import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String email;
        private String password;

       @Column(name = "wallet_balance")
       private Double walletBalance;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String contact;

        public User(Long id, String name, String email, String password, Double walletBalance, Role role, String contact) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
            this.walletBalance=walletBalance;
            this.role=role;
            this.contact=contact;
        }

        public User(){

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

    public Double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(Double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}


