package com.cagla.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "akademisyenler")
public class Akademisyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int akademisyenID;
    
    private String akademisyenAD;
    private String akademisyenSOYAD;
    private String unvan;
    
    @OneToOne
    @JoinColumn(name = "kullaniciID")
    private Kullanici kullanici;

    // --- GETTER VE SETTER METOTLARI ---

    public int getAkademisyenID() {
        return akademisyenID;
    }

    public void setAkademisyenID(int akademisyenID) {
        this.akademisyenID = akademisyenID;
    }

    public String getAkademisyenAD() {
        return akademisyenAD;
    }

    public void setAkademisyenAD(String akademisyenAD) {
        this.akademisyenAD = akademisyenAD;
    }

    public String getAkademisyenSOYAD() {
        return akademisyenSOYAD;
    }

    public void setAkademisyenSOYAD(String akademisyenSOYAD) {
        this.akademisyenSOYAD = akademisyenSOYAD;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    // EKSİK OLAN KULLANICI GETTER/SETTER'LARI
    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    // EKSİK OLAN TOSTRING METODU (ComboBox'ta isim görünmesi için şart)
    @Override
    public String toString() {
        // null kontrolü yapalım ki boşsa hata vermesin
        String u = unvan != null ? unvan : "";
        String ad = akademisyenAD != null ? akademisyenAD : "";
        String soyad = akademisyenSOYAD != null ? akademisyenSOYAD : "";
        
        return u + " " + ad + " " + soyad; 
    }
}