
package com.cagla.view;
import com.cagla.entity.*;
import com.cagla.entity.OgrenciDersleri;
import com.cagla.util.HibernateUtil;
import com.cagla.util.Oturum;
import com.cagla.service.NotHesaplamaService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class AkademisyenPanel extends BaseView {
    private Kullanici aktifKullanici;
    private Akademisyen aktifAkademisyen;
    DefaultTableModel model;
    
   
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AkademisyenPanel.class.getName());

   
    public AkademisyenPanel(Kullanici k) {
        initComponents();
        ekranBasliginiAyarla();
        this.aktifKullanici = k;
        
       
        
        /// Tablo Sütunları
        model = new DefaultTableModel();
        Object[] kolonlar = {"Kayıt ID", "Öğrenci No", "Ad", "Soyad", "Vize", "Final", "Harf"};
        model.setColumnIdentifiers(kolonlar);
        tblOgrenciler.setModel(model);
        
        // Giriş yapan hocayı bul ve derslerini yükle
        akademisyeniBul();
        dersleriYukle();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOgrenciler = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSeciliOgrenci = new javax.swing.JLabel();
        btnTemizle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtVize = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGuncelle = new javax.swing.JButton();
        cmbDersler = new javax.swing.JComboBox<>();
        btnSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblOgrenciler.setModel(new javax.swing.table.DefaultTableModel(
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
        tblOgrenciler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOgrencilerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOgrenciler);

        jLabel6.setFont(new java.awt.Font("Verdana Pro", 1, 18)); // NOI18N
        jLabel6.setText("Notlar");

        jLabel2.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        jLabel2.setText("Seçilen Öğrenci");

        jLabel7.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        jLabel7.setText("Final Notu");

        btnTemizle.setText("Temizle");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        jLabel4.setText("Vize Notu");

        btnEkle.setText("Kaydet");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        jLabel1.setText("Ders Seçiniz");

        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        cmbDersler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDersler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDerslerActionPerformed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEkle)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnGuncelle))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnTemizle)
                                            .addComponent(btnSil))
                                        .addGap(51, 51, 51)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFinal)
                                        .addComponent(txtVize, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDersler, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSeciliOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDersler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSeciliOgrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEkle)
                            .addComponent(btnGuncelle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSil)
                        .addGap(18, 18, 18)
                        .addComponent(btnTemizle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        int seciliSatir = tblOgrenciler.getSelectedRow();
        
        if (seciliSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen not girmek istediğiniz öğrenciyi listeden seçiniz!");
            return;
        }
        
        try {
            // Gizli ID'yi al
            int kayitID = (int) model.getValueAt(seciliSatir, 0);
            
            // Text kutularından notları al
            int v = Integer.parseInt(txtVize.getText());
            int f = Integer.parseInt(txtFinal.getText());
            
            // Hibernate İşlemi
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            
            OgrenciDersleri kayit = session.get(OgrenciDersleri.class, kayitID);
            
            // Sadece notları güncelliyoruz (Çünkü öğrenci zaten derse kayıtlı)
            kayit.setVize(v);
            kayit.setFinalNotu(f);
            
            // Harf Hesapla
            NotHesaplamaService servis = new NotHesaplamaService();
            kayit.setHarfNotu(servis.harfHesapla(v, f));
            
            session.merge(kayit); // Update
            tx.commit();
            session.close();
            
            JOptionPane.showMessageDialog(this, "Not girişi yapıldı!");
            ogrencileriGetir(); // Tabloyu yenile
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lütfen vize ve final için sayı giriniz!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void cmbDerslerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDerslerActionPerformed
        ogrencileriGetir(); // Ders değişince o dersi alan öğrenciler gelir
        formuTemizle();
    }//GEN-LAST:event_cmbDerslerActionPerformed

    private void tblOgrencilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOgrencilerMouseClicked
       int seciliSatir = tblOgrenciler.getSelectedRow();
        if (seciliSatir > -1) {
            // Tıklanan satırdaki verileri kutulara doldur
            String no = model.getValueAt(seciliSatir, 1).toString();
            String ad = model.getValueAt(seciliSatir, 2).toString();
            String soyad = model.getValueAt(seciliSatir, 3).toString();
            String vize = model.getValueAt(seciliSatir, 4).toString();
            String fnl = model.getValueAt(seciliSatir, 5).toString();
            
            lblSeciliOgrenci.setText(ad + " " + soyad);
            txtVize.setText(vize);
            txtFinal.setText(fnl);
        }
    }//GEN-LAST:event_tblOgrencilerMouseClicked

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
    // Öğrenciyi dersten atmaz, sadece notları siler (0 yapar).                                   
        int seciliSatir = tblOgrenciler.getSelectedRow();
        if (seciliSatir == -1) {
            JOptionPane.showMessageDialog(this, "Notları silinecek öğrenciyi seçiniz!");
            return;
        }
        
        int onay = JOptionPane.showConfirmDialog(this, "Notları silmek (sıfırlamak) istediğinize emin misiniz?", "Not Sil", JOptionPane.YES_NO_OPTION);
        
        if (onay == JOptionPane.YES_OPTION) {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                Transaction tx = session.beginTransaction();
                
                int kayitID = (int) model.getValueAt(seciliSatir, 0);
                OgrenciDersleri kayit = session.get(OgrenciDersleri.class, kayitID);
                
                // Kaydı silmiyoruz (remove YOK), değerleri sıfırlıyoruz.
                if (kayit != null) {
                    kayit.setVize(0);
                    kayit.setFinalNotu(0);
                    kayit.setHarfNotu(null); // Harf notunu boşalt
                    
                    session.merge(kayit);
                    tx.commit();
                    
                    JOptionPane.showMessageDialog(this, "Notlar temizlendi (Öğrenci ders listesinde kalmaya devam ediyor).");
                    ogrencileriGetir();
                    formuTemizle();
                }
            }
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        // Ekle butonuyla aynı mantıkta çalışır, notu değiştirir.
        btnEkleActionPerformed(evt);
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        formuTemizle();
    }//GEN-LAST:event_btnTemizleActionPerformed

    
    public static void main(String args[]) {
        /* Tema kodları vs... */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {}

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Test için sahte kullanıcı
                Kullanici testUser = new Kullanici();
                testUser.setKullaniciID(1);
                new AkademisyenPanel(testUser).setVisible(true);
            }
        });
    }

    
     @Override
    public void ekranBasliginiAyarla() {
        this.setTitle("Akademisyen Paneli");
    }
    
    private void akademisyeniBul() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // DÜZELTME: Oturum.aktifKullanici yerine this.aktifKullanici kullanıldı.
            String hql = "FROM Akademisyen WHERE kullanici.kullaniciID = :id";
            Query<Akademisyen> q = session.createQuery(hql, Akademisyen.class);
            q.setParameter("id", this.aktifKullanici.getKullaniciID());
            
            aktifAkademisyen = q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void dersleriYukle() {
        cmbDersler.removeAllItems();
        if (aktifAkademisyen != null) {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                // Sadece bu hocanın derslerini getir
                String hql = "FROM Ders WHERE akademisyen.akademisyenID = :id";
                Query<Ders> q = session.createQuery(hql, Ders.class);
                q.setParameter("id", aktifAkademisyen.getAkademisyenID());
                List<Ders> dersler = q.list();
                
                for (Ders d : dersler) {
                    cmbDersler.addItem(d);
                }
            }
        }
    }

    // Listeyi doldururken öğrenci zaten kayıtlıdır (Öğrenci panelinden)
    private void ogrencileriGetir() {
        model.setRowCount(0); // Temizle
        Ders secilenDers = (Ders) cmbDersler.getSelectedItem();
        
        if (secilenDers != null) {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                // Seçilen dersi alan öğrencileri getir
                String hql = "FROM OgrenciDersleri WHERE ders.dersID = :did";
                Query<OgrenciDersleri> q = session.createQuery(hql, OgrenciDersleri.class);
                q.setParameter("did", secilenDers.getDersID());
                List<OgrenciDersleri> kayitlar = q.list();
                
                for (OgrenciDersleri k : kayitlar) {
                    // Notlar null veya 0 ise tabloda "-" veya boş görünsün diye kontrol edebiliriz
                    // Ama veritabanında int olduğu için 0 gelir.
                    
                    model.addRow(new Object[]{
                        k.getId(), // Gizli ID (Update için şart)
                        k.getOgrenci().getOgrenci_no(),
                        k.getOgrenci().getOgrenciAD(),
                        k.getOgrenci().getOgrenciSOYAD(),
                        k.getVize(),
                        k.getFinalNotu(),
                        k.getHarfNotu() == null ? "-" : k.getHarfNotu()
                    });
                }
            }
        }
    }
    
    private void formuTemizle() {
        txtVize.setText("");
        txtFinal.setText("");
        lblSeciliOgrenci.setText("...");
        tblOgrenciler.clearSelection();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<Object> cmbDersler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSeciliOgrenci;
    private javax.swing.JTable tblOgrenciler;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtVize;
    // End of variables declaration//GEN-END:variables
}
