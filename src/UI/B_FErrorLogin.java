/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class B_FErrorLogin extends javax.swing.JFrame {

    /**
     * Creates new form FErrorLogin
     */
    public B_FErrorLogin() {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTaikhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbPass = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        lbUser = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/NUCE1.png"))); // NOI18N
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QU??N M???T KH???U ?");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("T??i Kho???n :");

        txtTaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTaikhoan.setBorder(null);
        txtTaikhoan.setName("txtTaikhoan"); // NOI18N
        txtTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTaikhoanMouseClicked(evt);
            }
        });
        txtTaikhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaikhoanKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText(" S??? ??i???n Tho???i :");

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSDT.setBorder(null);
        txtSDT.setName("txtPhoneNum"); // NOI18N
        txtSDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSDTMouseClicked(evt);
            }
        });
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSDTKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("M???t Kh???u C???a B???n L?? :");

        lbPass.setBackground(new java.awt.Color(204, 204, 255));
        lbPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPass.setBorder(null);
        lbPass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPass.setName("lbPass"); // NOI18N

        btnXacNhan.setBackground(new java.awt.Color(255, 255, 51));
        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXacNhan.setText("X??c Nh???n");
        btnXacNhan.setBorder(null);
        btnXacNhan.setBorderPainted(false);
        btnXacNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhan.setName("btnXacNhan"); // NOI18N
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(255, 255, 51));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangNhap.setText("????ng Nh???p");
        btnDangNhap.setBorder(null);
        btnDangNhap.setBorderPainted(false);
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.setName("btnDangNhapBack"); // NOI18N
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(255, 255, 51));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLamMoi.setText("L??m M???i");
        btnLamMoi.setBorder(null);
        btnLamMoi.setBorderPainted(false);
        btnLamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLamMoi.setName("btnLamMoi"); // NOI18N
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        lbUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtSDT)
                    .addComponent(txtTaikhoan)
                    .addComponent(lbPass)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        txtTaikhoan.setText("");
        txtSDT.setText("");
        lbPass.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        new A_FLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        if (txtTaikhoan.getText().equals("") && txtSDT.getText().equals("")) {
            lbUser.setText("*Ch??a nh???p t??i kho???n.");
            lbUser.setForeground(Color.red);
            lbSDT.setText("*Ch??a nh???p s??? ??i???n tho???i.");
            lbSDT.setForeground(Color.red);
            Border RedLine = BorderFactory.createLineBorder(Color.red);
            txtTaikhoan.setBorder(RedLine);
            txtSDT.setBorder(RedLine);
        } else if (txtTaikhoan.getText().equals("")) {
            lbUser.setText("*Ch??a nh???p t??i kho???n.");
            lbUser.setForeground(Color.red);
            Border RedLine = BorderFactory.createLineBorder(Color.red);
            txtTaikhoan.setBorder(RedLine);
        } else if (txtSDT.getText().equals("")) {
            lbSDT.setText("*Ch??a nh???p s??? ??i???n tho???i.");
            lbSDT.setForeground(Color.red);
            Border RedLine = BorderFactory.createLineBorder(Color.red);
            txtSDT.setBorder(RedLine);
        } else {
            DangNhapDAO dn = new DangNhapDAO();
            AccountDTO tk = dn.CheckUser(txtTaikhoan.getText());
            AccountDTO tk1 = dn.CheckPhone(txtSDT.getText(),txtTaikhoan.getText());
            if (tk == null) {
                lbUser.setText("*T??i kho???n kh??ng t???n t???i");
                lbUser.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtTaikhoan.setBorder(RedLine);
                lbSDT.setText("");
                txtSDT.setBorder(null);
                txtSDT.setText("");
                lbPass.setText("");
            } else {
                if (tk1 == null) {
                    lbSDT.setText("S??? ??i???n tho???i kh??ng ????ng");
                    lbSDT.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtSDT.setBorder(RedLine);
                    txtSDT.setText("");
                    lbPass.setText("");
                } else {
                    lbPass.setText(tk.getMatKhau());
                }
            }
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void txtTaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaikhoanMouseClicked
        // TODO add your handling code here:
        lbUser.setText("");
        txtTaikhoan.setBorder(null);
    }//GEN-LAST:event_txtTaikhoanMouseClicked

    private void txtSDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSDTMouseClicked
        // TODO add your handling code here:
        lbSDT.setText("");
        txtSDT.setBorder(null);
    }//GEN-LAST:event_txtSDTMouseClicked

    private void txtTaikhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaikhoanKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtTaikhoan.getText().equals("") && txtSDT.getText().equals("")) {
                lbUser.setText("*Ch??a nh???p t??i kho???n.");
                lbUser.setForeground(Color.red);
                lbSDT.setText("*Ch??a nh???p s??? ??i???n tho???i.");
                lbSDT.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtTaikhoan.setBorder(RedLine);
                txtSDT.setBorder(RedLine);
            } else if (txtTaikhoan.getText().equals("")) {
                lbUser.setText("*Ch??a nh???p t??i kho???n.");
                lbUser.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtTaikhoan.setBorder(RedLine);
            } else if (txtSDT.getText().equals("")) {
                lbSDT.setText("*Ch??a nh???p s??? ??i???n tho???i.");
                lbSDT.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtSDT.setBorder(RedLine);
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                AccountDTO tk = dn.CheckUser(txtTaikhoan.getText());
                AccountDTO tk1 = dn.CheckPhone(txtSDT.getText(),txtTaikhoan.getText());
                if (tk == null) {
                    lbUser.setText("*T??i kho???n kh??ng t???n t???i");
                    lbUser.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtTaikhoan.setBorder(RedLine);
                    lbSDT.setText("");
                    txtSDT.setBorder(null);
                    txtSDT.setText("");
                } else {
                    if (tk1 == null) {
                        lbSDT.setText("S??? ??i???n tho???i kh??ng ????ng");
                        lbSDT.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtSDT.setBorder(RedLine);
                        txtSDT.setText("");
                    } else {
                        lbPass.setText(tk.getMatKhau());
                    }
                }
            }
        }
    }//GEN-LAST:event_txtTaikhoanKeyPressed

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtTaikhoan.getText().equals("") && txtSDT.getText().equals("")) {
                lbUser.setText("*Ch??a nh???p t??i kho???n.");
                lbUser.setForeground(Color.red);
                lbSDT.setText("*Ch??a nh???p s??? ??i???n tho???i.");
                lbSDT.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtTaikhoan.setBorder(RedLine);
                txtSDT.setBorder(RedLine);
            } else if (txtTaikhoan.getText().equals("")) {
                lbUser.setText("*Ch??a nh???p t??i kho???n.");
                lbUser.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtTaikhoan.setBorder(RedLine);
            } else if (txtSDT.getText().equals("")) {
                lbSDT.setText("*Ch??a nh???p s??? ??i???n tho???i.");
                lbSDT.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtSDT.setBorder(RedLine);
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                AccountDTO tk = dn.CheckUser(txtTaikhoan.getText());
                AccountDTO tk1 = dn.CheckPhone(txtSDT.getText(),txtTaikhoan.getText());
                if (tk == null) {
                    lbUser.setText("*T??i kho???n kh??ng t???n t???i");
                    lbUser.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtTaikhoan.setBorder(RedLine);
                    lbSDT.setText("");
                    txtSDT.setBorder(null);
                    txtSDT.setText("");
                } else {
                    if (tk1 == null) {
                        lbSDT.setText("S??? ??i???n tho???i kh??ng ????ng");
                        lbSDT.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtSDT.setBorder(RedLine);
                        txtSDT.setText("");
                    } else {
                        lbPass.setText(tk.getMatKhau());
                    }
                }
            }
        }
    }//GEN-LAST:event_txtSDTKeyPressed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(B_FErrorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B_FErrorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B_FErrorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B_FErrorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B_FErrorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lbPass;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbUser;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTaikhoan;
    // End of variables declaration//GEN-END:variables
}
