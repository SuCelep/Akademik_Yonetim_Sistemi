
package com.cagla.view;
import com.cagla.entity.*;
import com.cagla.util.HibernateUtil;
import java.text.MessageFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class OgrenciPanel extends BaseView {
    private Kullanici aktifKullanici;
    private Ogrenci aktifOgrenci; // İşlemleri bu öğrenci adına yapacağız

    DefaultTableModel modelDersler;
    DefaultTableModel modelTranskript;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(OgrenciPanel.class.getName());

    
    public OgrenciPanel(Kullanici k) {
        initComponents();
        ekranBasliginiAyarla();
        
        this.aktifKullanici = k;
        
        // Tablo Modellerini Hazırla
        modelDersler = (DefaultTableModel) tblAcilanDersler.getModel();
        modelDersler.setColumnIdentifiers(new Object[]{"ID", "Ders Adı", "Kredi", "Dersi Veren Hoca"});
        
        modelTranskript = (DefaultTableModel) tblTranskript.getModel();
        modelTranskript.setColumnIdentifiers(new Object[]{"Ders", "Hoca", "Vize", "Final", "Ortalama", "Harf"});

        // 1. Önce giriş yapan kullanıcının ÖĞRENCİ kaydını bulalım
        ogrenciyiBul();
        
        // 2. Başlığa ismini yazalım
        if (aktifOgrenci != null) {
            this.setTitle("Öğrenci Paneli - Hoşgeldiniz: " + aktifOgrenci.getOgrenciAD() + " " + aktifOgrenci.getOgrenciSOYAD());
            lblGano.setText("Genel Not Ortalaması (GANO): " + aktifOgrenci.getGano());
        }

        // 3. Verileri Listele
        acilanDersleriListele();
        transkriptListele();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcilanDersler = new javax.swing.JTable();
        btnDersSec = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTranskript = new javax.swing.JTable();
        lblGano = new javax.swing.JLabel();
        btnYazdir = new javax.swing.JButton();
        btnDersiBirak = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtYeniSifre = new javax.swing.JTextField();
        btnProfilGuncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        tblAcilanDersler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAcilanDersler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAcilanDerslerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAcilanDersler);

        btnDersSec.setText("Seç");
        btnDersSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersSecActionPerformed(evt);
            }
        });

        jLabel1.setText("Seçilen Derse Kayıt Ol");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnDersSec, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDersSec)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ders Seçimi", jPanel1);

        tblTranskript.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblTranskript);

        lblGano.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        btnYazdir.setText("Transkript Yazdır");
        btnYazdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYazdirActionPerformed(evt);
            }
        });

        btnDersiBirak.setText("Dersi Bırak");
        btnDersiBirak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersiBirakActionPerformed(evt);
            }
        });

        jLabel3.setText("Seçilen Dersi Bırak");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnYazdir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDersiBirak, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGano, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblGano, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnYazdir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDersiBirak, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transkript Yazdır", jPanel2);

        jLabel4.setText("Yeni Şifre Gir");

        btnProfilGuncelle.setText("Güncelle");
        btnProfilGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfilGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtYeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnProfilGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profil", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDersSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersSecActionPerformed
       // --- EKLENECEK KISIM BAŞLANGIÇ ---
        if (aktifOgrenci == null) {
            JOptionPane.showMessageDialog(this, "HATA: Öğrenci profili bulunamadı! Lütfen Admin panelinden bu kullanıcı için öğrenci kaydı oluşturun.");
            return; // İşlemi durdur
        }
        // --- EKLENECEK KISIM BİTİŞ ---

        
        int secilenSatir = tblAcilanDersler.getSelectedRow();
        if (secilenSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen almak istediğiniz dersi seçiniz.");
            return;
        }

        int dersID = (int) modelDersler.getValueAt(secilenSatir, 0);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // Önce kontrol et: Öğrenci bu dersi zaten almış mı?
            String kontrolHQL = "FROM OgrenciDersleri WHERE ogrenci.ogrenciID = :oid AND ders.dersID = :did";
            Query q = session.createQuery(kontrolHQL);
            q.setParameter("oid", aktifOgrenci.getOgrenciID());
            q.setParameter("did", dersID);
            
            if (!q.list().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Bu dersi zaten listenize eklediniz!");
                return;
            }

            // Dersi Ekle
            Ders secilenDers = session.get(Ders.class, dersID);
            
            OgrenciDersleri yeniKayit = new OgrenciDersleri();
            yeniKayit.setOgrenci(aktifOgrenci);
            yeniKayit.setDers(secilenDers);
            yeniKayit.setVize(0); // Başlangıç notları
            yeniKayit.setFinalNotu(0);
            yeniKayit.setHarfNotu("-"); // Henüz harf yok
            
            session.persist(yeniKayit);
            tx.commit();
            
            JOptionPane.showMessageDialog(this, "Ders başarıyla seçildi! Transkript sekmesinden görebilirsiniz.");
            transkriptListele(); // Diğer sekmeyi güncelle

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDersSecActionPerformed

    private void btnYazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYazdirActionPerformed
        try {
            // JTable'ın kendi yazdırma özelliği vardır. Çok pratiktir.
            // Başlık ve Alt Bilgi ekleyerek yazıcı diyaloğunu açar.
            MessageFormat header = new MessageFormat("Öğrenci Transkripti - " + aktifOgrenci.getOgrenciAD() + " " + aktifOgrenci.getOgrenciSOYAD());
            MessageFormat footer = new MessageFormat("Sayfa {0,number,integer}");
            
            boolean complete = tblTranskript.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            
            if (complete) {
                JOptionPane.showMessageDialog(this, "Yazdırma işlemi tamamlandı.");
            } else {
                JOptionPane.showMessageDialog(this, "Yazdırma iptal edildi.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Yazdırma Hatası: " + e.getMessage());
        }
    }//GEN-LAST:event_btnYazdirActionPerformed

    private void btnDersiBirakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersiBirakActionPerformed
        // 1. Tablodan satır seçildi mi?
        int secilenSatir = tblTranskript.getSelectedRow();
        if (secilenSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen bırakmak istediğiniz dersi tablodan seçiniz.");
            return;
        }

        // 2. ID'yi al (Artık 0. sütunda ID var)
        int kayitID = Integer.parseInt(modelTranskript.getValueAt(secilenSatir, 0).toString());

        // 3. Güvenlik ve Mantık Kontrolü (İsteğe bağlı)
        // Örneğin: Notu girilmiş ders bırakılamaz diyebiliriz.
        // Şimdilik direkt siliyoruz.
        int onay = JOptionPane.showConfirmDialog(this, "Bu dersi listenizden silmek istiyor musunuz?", "Dersi Bırak", JOptionPane.YES_NO_OPTION);
        if (onay != JOptionPane.YES_OPTION) return;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // Kaydı bul ve sil
            OgrenciDersleri silinecekKayit = session.get(OgrenciDersleri.class, kayitID);
            if (silinecekKayit != null) {
                session.remove(silinecekKayit);
            }

            tx.commit();
            JOptionPane.showMessageDialog(this, "Ders başarıyla bırakıldı.");
            
            // Listeyi Yenile
            transkriptListele(); 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDersiBirakActionPerformed

    private void btnProfilGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilGuncelleActionPerformed
        // 1. Yeni şifreyi kutudan al
        String yeniSifre = txtYeniSifre.getText().trim(); // trim() boşlukları temizler
        
        // 2. Boş mu diye kontrol et
        if (yeniSifre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen yeni şifrenizi giriniz!", "Hata", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // 3. Şifre uzunluğu kontrolü (İsteğe bağlı, örneğin en az 3 karakter)
        if (yeniSifre.length() < 3) {
            JOptionPane.showMessageDialog(this, "Şifre en az 3 karakter olmalıdır.", "Hata", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // 4. Aktif öğrencinin veritabanındaki en güncel halini çekiyoruz.
            // (Hafızadaki eski veriyle işlem yapmamak için en güvenli yöntem budur)
            Ogrenci guncellenecekOgrenci = session.get(Ogrenci.class, aktifOgrenci.getOgrenciID());
            
            if (guncellenecekOgrenci != null && guncellenecekOgrenci.getKullanici() != null) {
                
                // 5. Bağlı olduğu Kullanıcı tablosundaki şifreyi güncelle
                guncellenecekOgrenci.getKullanici().setSifre(yeniSifre);
                
                // 6. Kaydet
                session.merge(guncellenecekOgrenci);
                tx.commit();
                
                JOptionPane.showMessageDialog(this, "Şifreniz başarıyla güncellendi!", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
                
                // 7. Kutuyu temizle
                txtYeniSifre.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Kullanıcı bilgisine ulaşılamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Güncelleme Hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnProfilGuncelleActionPerformed

    private void tblAcilanDerslerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAcilanDerslerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAcilanDerslerMouseClicked

 
    public static void main(String args[]) {
 /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // TEST İÇİN SAHTE KULLANICI OLUŞTURUYORUZ
                // Gerçek çalışmada Login ekranından geleceği için buna gerek kalmayacak.
                Kullanici testUser = new Kullanici();
                testUser.setKullaniciID(1); // Varsayılan bir ID
                testUser.setKullaniciAD("test");
                
                // Hatasız açılması için parametre olarak gönderiyoruz
                new OgrenciPanel(testUser).setVisible(true);
            }
        });
    }
    
    
    private void ogrenciyiBul() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Kullanıcı ID'sine göre Öğrenci tablosunu sorguluyoruz
            String hql = "FROM Ogrenci WHERE kullanici.kullaniciID = :kid";
            Query<Ogrenci> q = session.createQuery(hql, Ogrenci.class);
            q.setParameter("kid", aktifKullanici.getKullaniciID());
            
            aktifOgrenci = q.uniqueResult(); // Tek bir sonuç bekliyoruz
        }
    }

    private void acilanDersleriListele() {
        modelDersler.setRowCount(0);
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Tüm dersleri getir
            List<Ders> dersler = session.createQuery("FROM Ders", Ders.class).list();
            
            for (Ders d : dersler) {
                String hocaAdi = (d.getAkademisyen() != null) ? d.getAkademisyen().toString() : "Atanmamış";
                modelDersler.addRow(new Object[]{
                    d.getDersID(), d.getDersAd(), d.getKredi(), hocaAdi
                });
            }
        }
    }
    
    private double harfNotunuKatsayiyaCevir(String harf) {
    if (harf == null) return -1;
    switch (harf) {
        case "AA": return 4.0;
        case "BA": return 3.5;
        case "BB": return 3.0;
        case "CB": return 2.5;
        case "CC": return 2.0;
        case "DC": return 1.5;
        case "DD": return 1.0;
        case "FF": return 0.0;
        default: return -1; // "-" veya girilmemiş notlar için
    }
}

   private void transkriptListele() {
    if (aktifOgrenci == null) {
        // Eğer öğrenci yoksa uyarı verme işlemini yukarıda yapmıştık, burayı boş geçebiliriz
        return; 
    }

    // Tabloyu temizle
    modelTranskript.setRowCount(0);
    // Sütun başlıklarını ayarla
    modelTranskript.setColumnIdentifiers(new Object[]{"Kayıt ID", "Ders", "Hoca", "Vize", "Final", "Ortalama", "Harf"});

    // GANO Hesaplama Değişkenleri
    double toplamCarpim = 0.0; // (Kredi * Katsayı) toplamı
    int toplamKredi = 0;       // Alınan toplam kredi

    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        Transaction tx = session.beginTransaction(); // GANO güncellemesi için transaction açtık

        String hql = "FROM OgrenciDersleri WHERE ogrenci.ogrenciID = :oid";
        Query<OgrenciDersleri> q = session.createQuery(hql, OgrenciDersleri.class);
        q.setParameter("oid", aktifOgrenci.getOgrenciID());
        
        List<OgrenciDersleri> kayitlar = q.list();
        
        for (OgrenciDersleri od : kayitlar) {
            Ders d = od.getDers();
            String hoca = (d.getAkademisyen() != null) ? d.getAkademisyen().toString() : "-";
            
            // Ortalama Hesabı (Vize %40 + Final %60)
            double ort = (od.getVize() * 0.4) + (od.getFinalNotu() * 0.6);
            
            // Tabloya Ekleme
            modelTranskript.addRow(new Object[]{
                od.getId(), 
                d.getDersAd(), 
                hoca, 
                od.getVize(), 
                od.getFinalNotu(), 
                String.format("%.2f", ort), 
                od.getHarfNotu()
            });

            // --- GANO HESAPLAMA MANTIĞI ---
            double katsayi = harfNotunuKatsayiyaCevir(od.getHarfNotu());
            
            // Eğer notu girilmişse (katsayı -1 değilse) hesaba kat
            if (katsayi >= 0) {
                toplamCarpim += (d.getKredi() * katsayi);
                toplamKredi += d.getKredi();
            }
        }

        // Döngü bitti, GANO'yu hesapla
        double gano = 0.0;
        if (toplamKredi > 0) {
            gano = toplamCarpim / toplamKredi;
        }

        // 1. Ekrana Yazdır
        lblGano.setText("Genel Not Ortalaması (GANO): " + String.format("%.2f", gano));

        // 2. Veritabanını Güncelle (Önemli!)
        // Böylece programı kapatıp açtığında da güncel GANO gelir.
        aktifOgrenci = session.get(Ogrenci.class, aktifOgrenci.getOgrenciID()); // Nesneyi tazeledik
        aktifOgrenci.setGano(gano); // Entity'de setGano metodu olduğunu varsayıyoruz
        session.merge(aktifOgrenci);
        
        tx.commit();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Listeleme Hatası: " + e.getMessage());
    }
}
         @Override
    public void ekranBasliginiAyarla() {
        this.setTitle("Öğrenci Paneli");
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDersSec;
    private javax.swing.JButton btnDersiBirak;
    private javax.swing.JButton btnProfilGuncelle;
    private javax.swing.JButton btnYazdir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblGano;
    private javax.swing.JTable tblAcilanDersler;
    private javax.swing.JTable tblTranskript;
    private javax.swing.JTextField txtYeniSifre;
    // End of variables declaration//GEN-END:variables
}
