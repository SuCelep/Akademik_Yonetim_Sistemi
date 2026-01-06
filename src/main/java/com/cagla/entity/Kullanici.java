package com.cagla.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "kullanicilar")
// @Inheritance SATIRINI SİLDİK (Gerek kalmadı)
public class Kullanici {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kullaniciID;
    
    @Column(unique = true, nullable = false)
    private String kullaniciAD;
    
    @Column(nullable = false)
    private String sifre;
    
    @Column(nullable = false)
    private String rol;

    public int getKullaniciID() {
        return kullaniciID;
    }

    public void setKullaniciID(int kullaniciID) {
        this.kullaniciID = kullaniciID;
    }

    public String getKullaniciAD() {
        return kullaniciAD;
    }

    public void setKullaniciAD(String kullaniciAD) {
        this.kullaniciAD = kullaniciAD;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}