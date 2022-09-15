package com.example.security.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(
        name = "account_transactions"
)
@Getter
@Setter
@NoArgsConstructor
public class AccountTransaction {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "transaction_dt")
    private Date transactionDt;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amt")
    private int transactionAmt;

    @Column(name = "closing_balance")
    private int closingBalance;

    @Column(name = "create_dt")
    private String createDt;

    @Builder
    public AccountTransaction(String transactionId, int accountNumber, int customerId, Date transactionDt, String transactionSummary, String transactionType, int transactionAmt, int closingBalance, String createDt) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.transactionDt = transactionDt;
        this.transactionSummary = transactionSummary;
        this.transactionType = transactionType;
        this.transactionAmt = transactionAmt;
        this.closingBalance = closingBalance;
        this.createDt = createDt;
    }
}
