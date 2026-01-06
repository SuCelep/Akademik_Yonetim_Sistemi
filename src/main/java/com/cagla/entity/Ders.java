package com.cagla.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dersler")
public class Ders {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dersID;
    
    private String dersAd;
    private int kredi;
    
    // Dersin hocasıyla olan bağlantısı
    @ManyToOne
    @JoinColumn(name = "akademisyenID") 
    private Akademisyen akademisyen;

    // --- GETTER ve SETTER METOTLARI ---

    public int getDersID() {
        return dersID;
    }

    public void setDersID(int dersID) {
        this.dersID = dersID;
    }

    public String getDersAd() {
        return dersAd;
    }

    public void setDersAd(String dersAd) {
        this.dersAd = dersAd;
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    public Akademisyen getAkademisyen() {
        return akademisyen;
    }

    public void setAkademisyen(Akademisyen akademisyen) {
        this.akademisyen = akademisyen;
    }
    
    // Admin panelinde ve Öğrenci panelinde ders adı düzgün görünsün diye:
    @Override
    public String toString() {
        return dersAd;
    }
}