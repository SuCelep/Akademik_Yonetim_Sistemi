package com.cagla.view;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public abstract class BaseView extends JFrame {

    public BaseView() {
        // 1. Ortak Pencere Ayarları
        setLocationRelativeTo(null); // Ortada açıl
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        // 2. ARKA PLAN RENGİ (Color sınıfı)
        // RGB kodları verebilirsin. Örn: (230, 240, 255) açık mavi tonudur.
        // Veya Color.WHITE, Color.LIGHT_GRAY gibi hazır renkler kullanabilirsin.
        this.getContentPane().setBackground(new Color(235, 245, 255)); 
        
        // 3. İKON EKLEME
        try {
            // resources klasöründeki resmi bul
            URL url = getClass().getResource("/graduation.png"); 
            
            if (url != null) {
                ImageIcon icon = new ImageIcon(url);
                this.setIconImage(icon.getImage()); // İkonu ayarla
            } else {
                System.out.println("İkon resmi bulunamadı! İsmi kontrol et.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Abstract metot (Burası aynen kalıyor)
    public abstract void ekranBasliginiAyarla();
}