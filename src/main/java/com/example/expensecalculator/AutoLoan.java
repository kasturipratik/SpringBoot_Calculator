package com.example.expensecalculator;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AutoLoan{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double rate;
    private double principal;
    private double month;

    private String loanAmount;
    private String monthlyPayment;
    private String interestAmount;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(String interestAmount) {
        this.interestAmount = interestAmount;
    }

    public double monthlyPayment(double interestRate, double principalAmount, double time ){

        double r = (interestRate/100)/12;
        double monthlyPay = (principalAmount * r) / (1 - Math.pow(1+r, -time));
        return monthlyPay;
    }

    public double totalLoan(double interestRate, double principalAmount, double time){

        double totalLoanAmount = time * monthlyPayment(interestRate,principalAmount,time);
        return totalLoanAmount;
    }

    public double totalInterest(double interestRate, double principalAmount, double time){
        double totalInterestAmount = totalLoan(interestRate,principalAmount,time) - principalAmount;
        return totalInterestAmount;
    }
}
