
package com.cagla.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "ogrenci_dersleri")

public class OgrenciDersleri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "ogrenciID")
    private Ogrenci ogrenci;
    
    @ManyToOne
    @JoinColumn(name = "dersID")
    private Ders ders;
    
    private int vize;
    
    @Column(name = "finalNotu")
    private int finalNotu; // 'final' java'da yasaklı kelime olduğu için 'finalNotu' yaptık ama veritabanında 'final'
    
    @Column(name = "harf_notu")
    private String harfNotu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public Ders getDers() {
        return ders;
    }

    public void setDers(Ders ders) {
        this.ders = ders;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinalNotu() {
        return finalNotu;
    }

    public void setFinalNotu(int finalNotu) {
        this.finalNotu = finalNotu;
    }

    public String getHarfNotu() {
        return harfNotu;
    }

    public void setHarfNotu(String harfNotu) {
        this.harfNotu = harfNotu;
    }
}
