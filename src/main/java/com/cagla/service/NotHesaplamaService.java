package com.cagla.service;

public class NotHesaplamaService {
    public String harfHesapla(int vize, int finalNotu) {
        double ort = (vize * 0.4) + (finalNotu * 0.6);
        
        if(ort >= 90) return "AA";
        else if(ort >= 85) return "BA";
        else if(ort >= 70) return "BB";
        else if(ort >= 50) return "CC";
        else return "FF";
    }
}