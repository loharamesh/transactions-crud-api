package com.colakin.java.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransactionID")
    private Long transactionID;

    @Column(name = "UserID")
    private Long userID;

    @Column(name = "TransactionType")
    @NotBlank
    @Size(max = 20)
    private String transactionType;

    @Column(name = "CategoryID")
    private Integer categoryID;

    @Column(name = "SubcategoryID")
    private Integer subcategoryID;

    @Column(name = "AccountID")
    private Long accountID;

    @Column(name = "Amount")
    @NotNull
    private BigDecimal amount;

    @Column(name = "TransactionDescription")
    @Size(max = 255)
    private String transactionDescription;

    @Column(name = "TransactionDate")
    @NotNull
    private LocalDate transactionDate;

    @Column(name = "CurrencyCode")
    @Size(max = 10)
    private String currencyCode;

    @Column(name = "CreatedBy")
    private Long createdBy;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "UpdatedBy")
    private Long updatedBy;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;

    @Column(name = "RecurringPayment")
    private Boolean recurringPayment;

    @Column(name = "RecurringPaymentID")
    private Long recurringPaymentID;

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getSubcategoryID() {
        return subcategoryID;
    }

    public void setSubcategoryID(Integer subcategoryID) {
        this.subcategoryID = subcategoryID;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Boolean getRecurringPayment() {
        return recurringPayment;
    }

    public void setRecurringPayment(Boolean recurringPayment) {
        this.recurringPayment = recurringPayment;
    }

    public Long getRecurringPaymentID() {
        return recurringPaymentID;
    }

    public void setRecurringPaymentID(Long recurringPaymentID) {
        this.recurringPaymentID = recurringPaymentID;
    }
}