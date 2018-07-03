package com.example.expensecalculator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double momChase;
    private double myChase;
    private double momBac;
    private double myBac;
    private double google;
    private double bed;
    private double americanExpress;
    private double bge;
    private double phone;
    private double rent;
    private double bestBuy;
    private double comcast;
    private double geico;
    private double amazon;
    private double gym;
    private double adobe;

    private String total;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMomChase() {
        return momChase;
    }

    public void setMomChase(double momChase) {
        this.momChase = momChase;
    }

    public double getMyChase() {
        return myChase;
    }

    public void setMyChase(double myChase) {
        this.myChase = myChase;
    }

    public double getMomBac() {
        return momBac;
    }

    public void setMomBac(double momBac) {
        this.momBac = momBac;
    }

    public double getMyBac() {
        return myBac;
    }

    public void setMyBac(double myBac) {
        this.myBac = myBac;
    }

    public double getGoogle() {
        return google;
    }

    public void setGoogle(double google) {
        this.google = google;
    }

    public double getBed() {
        return bed;
    }

    public void setBed(double bed) {
        this.bed = bed;
    }

    public double getAmericanExpress() {
        return americanExpress;
    }

    public void setAmericanExpress(double americanExpress) {
        this.americanExpress = americanExpress;
    }

    public double getBge() {
        return bge;
    }

    public void setBge(double bge) {
        this.bge = bge;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getBestBuy() {
        return bestBuy;
    }

    public void setBestBuy(double bestBuy) {
        this.bestBuy = bestBuy;
    }

    public double getComcast() {
        return comcast;
    }

    public void setComcast(double comcast) {
        this.comcast = comcast;
    }

    public double getGeico() {
        return geico;
    }

    public void setGeico(double geico) {
        this.geico = geico;
    }

    public double getAmazon() {
        return amazon;
    }

    public void setAmazon(double amazon) {
        this.amazon = amazon;
    }

    public double getGym() {
        return gym;
    }

    public void setGym(double gym) {
        this.gym = gym;
    }

    public double getAdobe() {
        return adobe;
    }

    public void setAdobe(double adobe) {
        this.adobe = adobe;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public double totalExpenses(){
        double total = momBac + momChase +myBac +myChase +adobe +amazon +americanExpress +phone +comcast +bed +bestBuy +geico+ google +gym +bge +rent;
        return total;
    }


}
