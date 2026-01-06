
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

public class LoginView extends BaseView{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginView.class.getName());

   
    public LoginView() {
        initComponents();
        ekranBasliginiAyarla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKadi = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        btnGiris = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGİN");
        setResizable(false);

        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setText("Parola");

        txtSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSifreActionPerformed(evt);
            }
        });

        btnGiris.setText("Giriş Yap");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGiris)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSifre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtKadi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGiris)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSifreActionPerformed

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
     String kadi = txtKadi.getText();
        String sifre = new String(txtSifre.getPassword());

        System.out.println("--- GİRİŞ DENEMESİ BAŞLADI ---");
        System.out.println("Aranan Kullanıcı: " + kadi + " | Şifre: " + sifre);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM Kullanici WHERE kullaniciAD = :kadi AND sifre = :sifre";
            Query<Kullanici> q = session.createQuery(hql, Kullanici.class);
            q.setParameter("kadi", kadi);
            q.setParameter("sifre", sifre);

            Kullanici kullanici = q.uniqueResult();

            if (kullanici != null) {
                System.out.println("KULLANICI BULUNDU! ID: " + kullanici.getKullaniciID());
                String rol = kullanici.getRol();
                System.out.println("Veritabanındaki Rol: " + rol);

                if (rol.equalsIgnoreCase("akademisyen")) {
                    System.out.println(">> Akademisyen Paneli açılıyor...");
                    new AkademisyenPanel(kullanici).setVisible(true);
                    this.dispose();
                } 
                else if (rol.equalsIgnoreCase("ogrenci")) {
                    System.out.println(">> Öğrenci Paneli açılıyor...");
                    new OgrenciPanel(kullanici).setVisible(true); // Buraya dikkat
                    this.dispose();
                } 
                else if (rol.equalsIgnoreCase("admin") || rol.equalsIgnoreCase("yonetici")) {
                    System.out.println(">> Admin Paneli açılıyor...");
                    new AdminPanel().setVisible(true);
                    this.dispose();
                } else {
                    System.out.println("!! ROL EŞLEŞMEDİ !! Kodda arananlar: akademisyen, ogrenci, admin");
                    JOptionPane.showMessageDialog(this, "Tanımsız Rol: " + rol);
                }
            } else {
                System.out.println("KULLANICI BULUNAMADI (NULL DÖNDÜ)");
                JOptionPane.showMessageDialog(this, "Hatalı Kullanıcı Adı veya Şifre!");
            }
        } catch (Exception e) {
            System.out.println("BİR HATA OLUŞTU:");
            e.printStackTrace(); // Hatayı konsola kırmızı yazdırır
            JOptionPane.showMessageDialog(this, "Hata: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGirisActionPerformed

    
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
        java.awt.EventQueue.invokeLater(() -> new LoginView().setVisible(true));
    }
    
    @Override
    public void ekranBasliginiAyarla() {
        this.setTitle("ÜAY-- Hoşgeldiniz!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtKadi;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
