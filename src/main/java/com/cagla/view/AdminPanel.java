package com.cagla.view;

import com.cagla.entity.*;
import com.cagla.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class AdminPanel extends BaseView{
    DefaultTableModel modelOgrenci;
    DefaultTableModel modelAkademisyen;
    DefaultTableModel modelDers;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminPanel.class.getName());

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        ekranBasliginiAyarla();
        
        modelOgrenci = (DefaultTableModel) tblOgrenciler.getModel();
        modelOgrenci.setColumnIdentifiers(new Object[]{"ID", "Ad", "Soyad", "No", "Kullanıcı Adı"});
        
        modelAkademisyen = (DefaultTableModel) tblAkademisyenler.getModel();
        modelAkademisyen.setColumnIdentifiers(new Object[]{"ID", "Unvan", "Ad", "Soyad", "Kullanıcı Adı"});
        
        modelDers = (DefaultTableModel) tblDersler.getModel();
        modelDers.setColumnIdentifiers(new Object[]{"ID", "Ders Adı", "Kredi", "Sorumlu Hoca"});

        // Verileri Yükle
        tumVerileriYenile();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtOgrAd = new javax.swing.JTextField();
        txtOgrSoyad = new javax.swing.JTextField();
        txtOgrNo = new javax.swing.JTextField();
        txtOgrKadi = new javax.swing.JTextField();
        txtOgrSifre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnOgrEkle = new javax.swing.JButton();
        btnOgrSil = new javax.swing.JButton();
        txtOgrGuncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOgrenciler = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAkaAd = new javax.swing.JTextField();
        btnAkaEkle = new javax.swing.JButton();
        txtAkaSoyad = new javax.swing.JTextField();
        btnAkaSil = new javax.swing.JButton();
        txtAkaUnvan = new javax.swing.JTextField();
        txtAkaGuncelle = new javax.swing.JButton();
        txtAkaSifre = new javax.swing.JTextField();
        txtAkaKadi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAkademisyenler = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDersAd = new javax.swing.JTextField();
        btnDersEkle = new javax.swing.JButton();
        txtDersKredi = new javax.swing.JTextField();
        btnDersSil = new javax.swing.JButton();
        txtDersGuncelle = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDersler = new javax.swing.JTable();
        cmbHocaSec = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N

        txtOgrSoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOgrSoyadActionPerformed(evt);
            }
        });

        jLabel1.setText("Öğrenci Adı");

        jLabel2.setText("Öğrenci No");

        jLabel3.setText("Öğrenci Soyad");

        jLabel4.setText("Öğrenci Parolası");

        jLabel5.setFont(new java.awt.Font("Verdana Pro", 0, 12)); // NOI18N
        jLabel5.setText("Öğrenci İşlemleri");

        jLabel6.setText("Öğrenci Kullanıcı Ad");

        btnOgrEkle.setText("Ekle");
        btnOgrEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrEkleActionPerformed(evt);
            }
        });

        btnOgrSil.setText("Sil");
        btnOgrSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgrSilActionPerformed(evt);
            }
        });

        txtOgrGuncelle.setText("Güncelle");
        txtOgrGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOgrGuncelleActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(txtOgrAd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtOgrSoyad)
                                                    .addComponent(txtOgrNo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtOgrSifre, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                                    .addComponent(txtOgrKadi)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnOgrEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnOgrSil, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txtOgrGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOgrAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOgrSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOgrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOgrKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOgrSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOgrSil)
                            .addComponent(btnOgrEkle))
                        .addGap(18, 18, 18)
                        .addComponent(txtOgrGuncelle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Öğrenciler Yönetimi", jPanel1);

        jLabel7.setText("Akademisyen Adı");

        jLabel8.setText("Akademisyen Ünvan");

        jLabel9.setText("Akademisyen Soyad");

        jLabel10.setText("Akademisyen Parolası");

        jLabel11.setFont(new java.awt.Font("Verdana Pro", 0, 12)); // NOI18N
        jLabel11.setText("Akademisyen İşlemleri");

        jLabel12.setText("Akademisyen Kullanıcı Ad");

        btnAkaEkle.setText("Ekle");
        btnAkaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkaEkleActionPerformed(evt);
            }
        });

        txtAkaSoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAkaSoyadActionPerformed(evt);
            }
        });

        btnAkaSil.setText("Sil");
        btnAkaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkaSilActionPerformed(evt);
            }
        });

        txtAkaGuncelle.setText("Güncelle");
        txtAkaGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAkaGuncelleActionPerformed(evt);
            }
        });

        txtAkaSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAkaSifreActionPerformed(evt);
            }
        });

        txtAkaKadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAkaKadiActionPerformed(evt);
            }
        });

        tblAkademisyenler.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAkademisyenler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAkademisyenlerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAkademisyenler);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAkaUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAkaAd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAkaSoyad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnAkaEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAkaKadi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAkaSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAkaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txtAkaGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAkaAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAkaSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAkaUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAkaKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAkaSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAkaEkle)
                            .addComponent(btnAkaSil))
                        .addGap(18, 18, 18)
                        .addComponent(txtAkaGuncelle))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Akademisyen Yönetimi", jPanel2);

        jLabel13.setText("Ders Adı");

        jLabel15.setText("Kredi");

        jLabel17.setFont(new java.awt.Font("Verdana Pro", 0, 12)); // NOI18N
        jLabel17.setText("Ders İşlemleri");

        btnDersEkle.setText("Ekle");
        btnDersEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersEkleActionPerformed(evt);
            }
        });

        txtDersKredi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDersKrediActionPerformed(evt);
            }
        });

        btnDersSil.setText("Sil");
        btnDersSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDersSilActionPerformed(evt);
            }
        });

        txtDersGuncelle.setText("Güncelle");
        txtDersGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDersGuncelleActionPerformed(evt);
            }
        });

        tblDersler.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDersler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDerslerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDersler);

        cmbHocaSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Akademisyen Girin");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbHocaSec, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDersAd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDersKredi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDersEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnDersSil, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtDersGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtDersAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDersKredi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbHocaSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDersEkle)
                            .addComponent(btnDersSil))
                        .addGap(18, 18, 18)
                        .addComponent(txtDersGuncelle))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ders Yönetimi", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Ders Yönetimi");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDersKrediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDersKrediActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDersKrediActionPerformed

    private void btnDersEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersEkleActionPerformed
        Akademisyen secilenHoca = (Akademisyen) cmbHocaSec.getSelectedItem();

        if (secilenHoca == null) {
            JOptionPane.showMessageDialog(this, "Lütfen bir akademisyen seçiniz!");
            return;
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            Ders d = new Ders();
            d.setDersAd(txtDersAd.getText());
            d.setKredi(Integer.parseInt(txtDersKredi.getText()));
            d.setAkademisyen(secilenHoca); // DERSİ HOCAYA ATIYORUZ

            session.persist(d);
            tx.commit();
            JOptionPane.showMessageDialog(this, "Ders Eklendi ve Hocaya Atandı!");
            tumVerileriYenile();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDersEkleActionPerformed

    private void txtAkaKadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAkaKadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAkaKadiActionPerformed

    private void txtAkaSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAkaSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAkaSifreActionPerformed

    private void txtAkaSoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAkaSoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAkaSoyadActionPerformed

    private void btnAkaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkaEkleActionPerformed
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            Kullanici k = new Kullanici();
            k.setKullaniciAD(txtAkaKadi.getText());
            k.setSifre(txtAkaSifre.getText());
            k.setRol("akademisyen");
            session.persist(k);

            Akademisyen a = new Akademisyen();
            a.setAkademisyenAD(txtAkaAd.getText());
            a.setAkademisyenSOYAD(txtAkaSoyad.getText());
            a.setUnvan(txtAkaUnvan.getText()); // "Prof. Dr." gibi
            a.setKullanici(k);
            session.persist(a);

            tx.commit();
            JOptionPane.showMessageDialog(this, "Akademisyen Eklendi!");
            tumVerileriYenile();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAkaEkleActionPerformed

    private void btnOgrSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrSilActionPerformed
        int secilenSatir = tblOgrenciler.getSelectedRow();
        if(secilenSatir == -1) return;

        int id = (int) modelOgrenci.getValueAt(secilenSatir, 0); // 0. sütun ID

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Ogrenci ogr = session.get(Ogrenci.class, id);
            if(ogr != null) {
                // İlişkili kullanıcıyı da silmek istersen:
                Kullanici k = ogr.getKullanici();
                session.remove(ogr);
                session.remove(k);
            }
            tx.commit();
            tumVerileriYenile();
            JOptionPane.showMessageDialog(this, "Silindi");
        }
    }//GEN-LAST:event_btnOgrSilActionPerformed

    private void btnOgrEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOgrEkleActionPerformed
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // 1. Önce Kullanıcı (Login) hesabı oluşturulmalı
            Kullanici k = new Kullanici();
            k.setKullaniciAD(txtOgrKadi.getText());
            k.setSifre(txtOgrSifre.getText());
            k.setRol("ogrenci");
            session.persist(k); // Kullanıcıyı kaydet

            // 2. Sonra Öğrenci detayı oluşturulmalı
            Ogrenci o = new Ogrenci();
            o.setOgrenciAD(txtOgrAd.getText());
            o.setOgrenciSOYAD(txtOgrSoyad.getText());
            o.setOgrenci_no(txtOgrNo.getText());
            o.setGano(0.0);
            o.setKullanici(k); // İlişkiyi kuruyoruz
            session.persist(o);

            tx.commit();
            JOptionPane.showMessageDialog(this, "Öğrenci Başarıyla Eklendi!");
            tumVerileriYenile();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_btnOgrEkleActionPerformed

    private void txtOgrSoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOgrSoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOgrSoyadActionPerformed

    private void btnDersSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDersSilActionPerformed
        // 1. Tablodan satır seçildi mi kontrol et
        int secilenSatir = tblDersler.getSelectedRow();
        if (secilenSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen silinecek dersi seçiniz!");
            return;
        }

        // 2. Kullanıcıdan onay al (Yanlışlıkla silmeyi önlemek için)
        int onay = JOptionPane.showConfirmDialog(this, "Bu dersi ve derse kayıtlı tüm öğrenci notlarını silmek istiyor musunuz?", "Ders Silme", JOptionPane.YES_NO_OPTION);
        if (onay != JOptionPane.YES_OPTION) return;

        // 3. ID'yi al
        int id = (int) modelDers.getValueAt(secilenSatir, 0);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // 4. Önce bu derse ait öğrenci kayıtlarını (Notları) silmemiz lazım
            // Yoksa "Foreign Key" hatası alırız.
            Query q = session.createQuery("DELETE FROM OgrenciDersleri WHERE ders.dersID = :did");
            q.setParameter("did", id);
            q.executeUpdate();

            // 5. Şimdi Dersin kendisini bul ve sil
            Ders silinecekDers = session.get(Ders.class, id);
            if (silinecekDers != null) {
                session.remove(silinecekDers);
            }

            tx.commit();
            JOptionPane.showMessageDialog(this, "Ders ve ilgili kayıtlar silindi!");
            tumVerileriYenile(); // Tabloyu güncelle
            
            // Kutuları temizle
            txtDersAd.setText("");
            txtDersKredi.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Silme Hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDersSilActionPerformed

    private void btnAkaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkaSilActionPerformed
        // 1. Satır seçimi kontrolü
        int secilenSatir = tblAkademisyenler.getSelectedRow();
        if (secilenSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen silinecek akademisyeni seçiniz!");
            return;
        }

        // 2. Onay iste
        int onay = JOptionPane.showConfirmDialog(this, "Bu akademisyeni silmek istediğinize emin misiniz?", "Akademisyen Sil", JOptionPane.YES_NO_OPTION);
        if (onay != JOptionPane.YES_OPTION) return;

        // 3. ID al
        int id = (int) modelAkademisyen.getValueAt(secilenSatir, 0);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // 4. Akademisyeni veritabanından getir
            Akademisyen aka = session.get(Akademisyen.class, id);
            
            if (aka != null) {
                // 5. KRİTİK ADIM: Bu hocanın verdiği dersler varsa, o derslerin hoca bilgisini BOŞALT (NULL yap)
                // Böylece dersler silinmez, sadece "Atanmamış" olur.
                Query q = session.createQuery("UPDATE Ders SET akademisyen = null WHERE akademisyen.akademisyenID = :aid");
                q.setParameter("aid", id);
                q.executeUpdate();

                // 6. Akademisyene bağlı Kullanıcı (Login) hesabını al
                Kullanici k = aka.getKullanici();

                // 7. Önce Akademisyeni sil (İlişki sırası önemli)
                session.remove(aka);
                
                // 8. Sonra Kullanıcı hesabını sil (Böylece sisteme giremez)
                if (k != null) {
                    session.remove(k);
                }

                tx.commit();
                JOptionPane.showMessageDialog(this, "Akademisyen silindi. Dersleri boşa çıkarıldı.");
                tumVerileriYenile();
                
                // Kutuları temizle
                txtAkaAd.setText("");
                txtAkaSoyad.setText("");
                txtAkaUnvan.setText("");
                txtAkaKadi.setText("");
                txtAkaSifre.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Silme Hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAkaSilActionPerformed

    private void tblOgrencilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOgrencilerMouseClicked
        // 1. Seçilen satırı bul
        int secilenSatir = tblOgrenciler.getSelectedRow();
        if (secilenSatir == -1) return;

        // 2. Tablonun ilk sütunundan (Gizli veya açık) ID'yi al
        // Not: modelOgrenci'yi tanımladığımız yerden ID'nin 0. indexte olduğunu biliyoruz.
        int id = Integer.parseInt(modelOgrenci.getValueAt(secilenSatir, 0).toString());

        // 3. Veritabanından en güncel bilgiyi çek (Şifre tabloda yoksa buradan gelir)
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Ogrenci secilenOgrenci = session.get(Ogrenci.class, id);
            
            if (secilenOgrenci != null) {
                // 4. Kutuları Doldur
                txtOgrAd.setText(secilenOgrenci.getOgrenciAD());
                txtOgrSoyad.setText(secilenOgrenci.getOgrenciSOYAD());
                txtOgrNo.setText(secilenOgrenci.getOgrenci_no());
                
                // Kullanıcı bilgileri (Kullanıcı Adı ve Şifre)
                if (secilenOgrenci.getKullanici() != null) {
                    txtOgrKadi.setText(secilenOgrenci.getKullanici().getKullaniciAD());
                    txtOgrSifre.setText(secilenOgrenci.getKullanici().getSifre());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblOgrencilerMouseClicked

    private void tblAkademisyenlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAkademisyenlerMouseClicked
   

    // 1. Seçilen satırı bul
        int secilenSatir = tblAkademisyenler.getSelectedRow();
        if (secilenSatir == -1) return;

        // 2. ID'yi al
        int id = Integer.parseInt(modelAkademisyen.getValueAt(secilenSatir, 0).toString());

        // 3. Veritabanından çek
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Akademisyen secilenAka = session.get(Akademisyen.class, id);
            
            if (secilenAka != null) {
                // 4. Kutuları Doldur
                txtAkaUnvan.setText(secilenAka.getUnvan());
                txtAkaAd.setText(secilenAka.getAkademisyenAD());
                txtAkaSoyad.setText(secilenAka.getAkademisyenSOYAD());
                
                // Kullanıcı Bilgileri
                if (secilenAka.getKullanici() != null) {
                    txtAkaKadi.setText(secilenAka.getKullanici().getKullaniciAD());
                    txtAkaSifre.setText(secilenAka.getKullanici().getSifre());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
                                       
        }  
    }//GEN-LAST:event_tblAkademisyenlerMouseClicked

    private void tblDerslerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDerslerMouseClicked
        int secilenSatir = tblDersler.getSelectedRow();
        if (secilenSatir == -1) return;
        
        // Tablodan verileri al
        String dersAdi = modelDers.getValueAt(secilenSatir, 1).toString();
        String kredi = modelDers.getValueAt(secilenSatir, 2).toString();
        String hocaBilgisi = modelDers.getValueAt(secilenSatir, 3).toString(); 
        
        // Text kutularına yaz
        txtDersAd.setText(dersAdi);
        txtDersKredi.setText(kredi);
        
        // ComboBox'ta hocayı bul ve seç
        for (int i = 0; i < cmbHocaSec.getItemCount(); i++) {
            Akademisyen hoca = (Akademisyen) cmbHocaSec.getItemAt(i);
            if (hoca.toString().equals(hocaBilgisi)) {
                cmbHocaSec.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_tblDerslerMouseClicked

    private void txtOgrGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOgrGuncelleActionPerformed
        // 1. Tablodan seçim yapılmış mı kontrol et
        int secilenSatir = tblOgrenciler.getSelectedRow();
        if (secilenSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen güncellenecek öğrenciyi seçiniz!");
            return;
        }

        // 2. ID'yi al
        int id = Integer.parseInt(modelOgrenci.getValueAt(secilenSatir, 0).toString());

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // 3. Veritabanından mevcut öğrenciyi getir
            Ogrenci ogr = session.get(Ogrenci.class, id);

            if (ogr != null) {
                // 4. Öğrenci bilgilerini güncelle (Text kutularından al)
                ogr.setOgrenciAD(txtOgrAd.getText());
                ogr.setOgrenciSOYAD(txtOgrSoyad.getText());
                ogr.setOgrenci_no(txtOgrNo.getText());

                // 5. Bağlı olduğu Kullanıcı (Login) bilgilerini de güncelle
                // Eğer kullanıcı adı veya şifre değiştiyse, onu da kaydetmeliyiz.
                if (ogr.getKullanici() != null) {
                    ogr.getKullanici().setKullaniciAD(txtOgrKadi.getText());
                    ogr.getKullanici().setSifre(txtOgrSifre.getText());
                    // Kullanıcı tablosunu güncellemek için merge/update demeye gerek yok,
                    // Öğrenci üzerinden ilişki olduğu için otomatik güncellenir.
                }

                // 6. Değişiklikleri Kaydet
                session.merge(ogr);
                tx.commit();

                JOptionPane.showMessageDialog(this, "Öğrenci bilgileri güncellendi!");
                tumVerileriYenile(); // Tabloyu tazelemek için

                // Kutuları temizle
                txtOgrAd.setText("");
                txtOgrSoyad.setText("");
                txtOgrNo.setText("");
                txtOgrKadi.setText("");
                txtOgrSifre.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_txtOgrGuncelleActionPerformed

    private void txtAkaGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAkaGuncelleActionPerformed
        // 1. Tablodan seçim kontrolü
        int secilenSatir = tblAkademisyenler.getSelectedRow();
        if (secilenSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen güncellenecek akademisyeni seçiniz!");
            return;
        }

        // 2. ID'yi al
        int id = Integer.parseInt(modelAkademisyen.getValueAt(secilenSatir, 0).toString());

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // 3. Akademisyeni bul
            Akademisyen aka = session.get(Akademisyen.class, id);

            if (aka != null) {
                // 4. Akademisyen bilgilerini güncelle
                aka.setUnvan(txtAkaUnvan.getText());
                aka.setAkademisyenAD(txtAkaAd.getText());
                aka.setAkademisyenSOYAD(txtAkaSoyad.getText());

                // 5. Giriş bilgilerini (Kullanıcı Adı/Şifre) güncelle
                if (aka.getKullanici() != null) {
                    aka.getKullanici().setKullaniciAD(txtAkaKadi.getText());
                    aka.getKullanici().setSifre(txtAkaSifre.getText());
                }

                // 6. Kaydet
                session.merge(aka);
                tx.commit();

                JOptionPane.showMessageDialog(this, "Akademisyen bilgileri güncellendi!");
                tumVerileriYenile();

                // Temizlik
                txtAkaUnvan.setText("");
                txtAkaAd.setText("");
                txtAkaSoyad.setText("");
                txtAkaKadi.setText("");
                txtAkaSifre.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_txtAkaGuncelleActionPerformed

    private void txtDersGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDersGuncelleActionPerformed
        // 1. Tablodan satır seçildi mi kontrol et
        int secilenSatir = tblDersler.getSelectedRow();
        
        if (secilenSatir == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen güncellenecek dersi seçiniz!");
            return;
        }
        
        // 2. ID'yi al (Modelin 0. sütununda ID olduğunu varsayıyoruz)
        int id = Integer.parseInt(modelDers.getValueAt(secilenSatir, 0).toString());
        
        // 3. ComboBox'tan seçilen hocayı al
        // (Dikkat: Type Casting yapıyoruz çünkü ComboBox nesne tutuyor)
        Akademisyen secilenHoca = (Akademisyen) cmbHocaSec.getSelectedItem();
        
        if (secilenHoca == null) {
            JOptionPane.showMessageDialog(this, "Lütfen ders için bir akademisyen seçiniz!");
            return;
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            
            // 4. Veritabanından o dersi bul
            Ders d = session.get(Ders.class, id);
            
            if (d != null) {
                // 5. Yeni değerleri set et
                d.setDersAd(txtDersAd.getText());
                d.setKredi(Integer.parseInt(txtDersKredi.getText()));
                d.setAkademisyen(secilenHoca); // Dersi yeni hocaya ata
                
                // 6. Değişikliği Kaydet
                session.merge(d); 
                tx.commit();
                
                JOptionPane.showMessageDialog(this, "Ders başarıyla güncellendi!");
                tumVerileriYenile(); // Tabloyu yenile ki değişiklik görünsün
                
                // Kutuları temizle
                txtDersAd.setText("");
                txtDersKredi.setText("");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtDersGuncelleActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AdminPanel().setVisible(true));
    }

    
    @Override
    public void ekranBasliginiAyarla() {
        this.setTitle("Admin Paneli");
    }
    
    
    private void ogrencileriListele() {
        modelOgrenci.setRowCount(0);
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Ogrenci> liste = session.createQuery("FROM Ogrenci", Ogrenci.class).list();
            for (Ogrenci o : liste) {
                modelOgrenci.addRow(new Object[]{
                    o.getOgrenciID(), o.getOgrenciAD(), o.getOgrenciSOYAD(), o.getOgrenci_no(), o.getKullanici().getKullaniciAD()
                });
            }
        }
    }
    
    private void akademisyenleriListele() {
        modelAkademisyen.setRowCount(0);
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Akademisyen> liste = session.createQuery("FROM Akademisyen", Akademisyen.class).list();
            for (Akademisyen a : liste) {
                modelAkademisyen.addRow(new Object[]{
                    a.getAkademisyenID(), a.getUnvan(), a.getAkademisyenAD(), a.getAkademisyenSOYAD(), a.getKullanici().getKullaniciAD()
                });
            }
        }
    }
    
    private void hocalariComboboxaDoldur() {
        cmbHocaSec.removeAllItems();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Akademisyen> hocalar = session.createQuery("FROM Akademisyen", Akademisyen.class).list();
            for (Akademisyen a : hocalar) {
                cmbHocaSec.addItem(a); // ToString metodu önemli!
            }
        }
    }
    
    private void dersleriListele() {
        modelDers.setRowCount(0);
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Ders> liste = session.createQuery("FROM Ders", Ders.class).list();
            for (Ders d : liste) {
                String hocaAdi = (d.getAkademisyen() != null) 
                        ? d.getAkademisyen().getUnvan() + " " + d.getAkademisyen().getAkademisyenAD() + " " + d.getAkademisyen().getAkademisyenSOYAD()
                        : "Atanmamış";
                
                modelDers.addRow(new Object[]{
                    d.getDersID(), d.getDersAd(), d.getKredi(), hocaAdi
                });
            }
        }
    }
    
    private void tumVerileriYenile() {
        ogrencileriListele();
        akademisyenleriListele();
        dersleriListele();
        hocalariComboboxaDoldur();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAkaEkle;
    private javax.swing.JButton btnAkaSil;
    private javax.swing.JButton btnDersEkle;
    private javax.swing.JButton btnDersSil;
    private javax.swing.JButton btnOgrEkle;
    private javax.swing.JButton btnOgrSil;
    private javax.swing.JComboBox<Object> cmbHocaSec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAkademisyenler;
    private javax.swing.JTable tblDersler;
    private javax.swing.JTable tblOgrenciler;
    private javax.swing.JTextField txtAkaAd;
    private javax.swing.JButton txtAkaGuncelle;
    private javax.swing.JTextField txtAkaKadi;
    private javax.swing.JTextField txtAkaSifre;
    private javax.swing.JTextField txtAkaSoyad;
    private javax.swing.JTextField txtAkaUnvan;
    private javax.swing.JTextField txtDersAd;
    private javax.swing.JButton txtDersGuncelle;
    private javax.swing.JTextField txtDersKredi;
    private javax.swing.JTextField txtOgrAd;
    private javax.swing.JButton txtOgrGuncelle;
    private javax.swing.JTextField txtOgrKadi;
    private javax.swing.JTextField txtOgrNo;
    private javax.swing.JTextField txtOgrSifre;
    private javax.swing.JTextField txtOgrSoyad;
    // End of variables declaration//GEN-END:variables
}
