package com.example.security.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(
        name = "accounts"
)
@Getter
@Setter
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "create_dt")
    private String createDt;

    @Builder
    public Account(int customerId, String accountType, String branchAddress, String createDt) {
        this.customerId = customerId;
        this.accountType = accountType;
        this.branchAddress = branchAddress;
        this.createDt = createDt;
    }
}
