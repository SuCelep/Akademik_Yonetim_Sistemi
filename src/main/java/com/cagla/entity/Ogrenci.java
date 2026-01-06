package com.cagla.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ogrenciler") // <-- BURASI "kullanicilar" DEĞİL "ogrenciler" OLMALI
public class Ogrenci {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ogrenciID;

    // Öğrenci tablosundaki 'kullaniciID' sütunu ile Kullanici tablosunu bağlıyoruz
    @OneToOne
    @JoinColumn(name = "kullaniciID") 
    private Kullanici kullanici;
    
    private String ogrenciAD;
    private String ogrenciSOYAD;
    private String ogrenci_no;
    
    @Column(name = "gano")
    private double gano;

    public int getOgrenciID() {
        return ogrenciID;
    }

    public void setOgrenciID(int ogrenciID) {
        this.ogrenciID = ogrenciID;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public String getOgrenciAD() {
        return ogrenciAD;
    }

    public void setOgrenciAD(String ogrenciAD) {
        this.ogrenciAD = ogrenciAD;
    }

    public String getOgrenciSOYAD() {
        return ogrenciSOYAD;
    }

    public void setOgrenciSOYAD(String ogrenciSOYAD) {
        this.ogrenciSOYAD = ogrenciSOYAD;
    }

    public String getOgrenci_no() {
        return ogrenci_no;
    }

    public void setOgrenci_no(String ogrenci_no) {
        this.ogrenci_no = ogrenci_no;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }
    
}