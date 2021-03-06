/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.DangNhapDAO;
import DTO.AccountDTO;

/**
 *
 * @author Admin
 */
public class E_FMenuStaff extends javax.swing.JFrame {

    private PFNhanXe PFNhanXeTab;
    private PFTraXe PFTraXeTab;
    private PFDKiVeThang PFDKiVeThangTab;
    private PFTraCuuBaiXe PFTraCuuBaiXeTab;
    private PFThongTinThem PFInfor;

    /**
     * Creates new form FMenuStaff
     */
    public E_FMenuStaff(String user) {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(null);
        xinchao(user);
    }

    private void xinchao(String user) {
        DangNhapDAO dn = new DangNhapDAO();
        AccountDTO ac = dn.CheckUser(user);
        if (ac != null) {
            txtChaomung.setText("Chào mừng nhân viên " + ac.getTenNguoidung());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        txtChaomung = new javax.swing.JButton();
        btnDoimaukhau = new javax.swing.JLabel();
        btnThoat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnNhanXe = new javax.swing.JButton();
        btnTraXe = new javax.swing.JButton();
        btnDangKyVeThang = new javax.swing.JButton();
        btnTraCuuBaiXe = new javax.swing.JButton();
        btnThongTinThem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TabMainBoard = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnDangXuat.setBackground(new java.awt.Color(255, 255, 65));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/download-icon-left+previous+icon-1320166862746760425_24.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setToolTipText("");
        btnDangXuat.setBorder(null);
        btnDangXuat.setBorderPainted(false);
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setFocusPainted(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDangXuat.setName("btnDangXuat"); // NOI18N
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        txtChaomung.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtChaomung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_user_45px.png"))); // NOI18N
        txtChaomung.setText("Chào mừng");
        txtChaomung.setBorder(null);
        txtChaomung.setBorderPainted(false);
        txtChaomung.setContentAreaFilled(false);
        txtChaomung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtChaomung.setFocusPainted(false);
        txtChaomung.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtChaomung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChaomungActionPerformed(evt);
            }
        });

        btnDoimaukhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoimaukhau.setText("Đổi mật khẩu");
        btnDoimaukhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoimaukhauMouseClicked(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(txtChaomung, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnDoimaukhau, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChaomung)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDoimaukhau)
                            .addComponent(btnThoat))))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_parking_128px.png"))); // NOI18N
        jLabel3.setName("ParkingIcon"); // NOI18N

        btnNhanXe.setBackground(new java.awt.Color(255, 255, 65));
        btnNhanXe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhanXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_sedan_32px.png"))); // NOI18N
        btnNhanXe.setText("Nhận Xe");
        btnNhanXe.setToolTipText("");
        btnNhanXe.setBorder(null);
        btnNhanXe.setBorderPainted(false);
        btnNhanXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhanXe.setFocusPainted(false);
        btnNhanXe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanXe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanXeActionPerformed(evt);
            }
        });

        btnTraXe.setBackground(new java.awt.Color(255, 255, 65));
        btnTraXe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTraXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_car_theft_32px.png"))); // NOI18N
        btnTraXe.setText("Trả Xe");
        btnTraXe.setToolTipText("");
        btnTraXe.setBorder(null);
        btnTraXe.setBorderPainted(false);
        btnTraXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraXe.setFocusPainted(false);
        btnTraXe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTraXe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTraXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraXeActionPerformed(evt);
            }
        });

        btnDangKyVeThang.setBackground(new java.awt.Color(255, 255, 65));
        btnDangKyVeThang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangKyVeThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_membership_card_32px_1.png"))); // NOI18N
        btnDangKyVeThang.setText("Đăng Kí Vé Tháng");
        btnDangKyVeThang.setToolTipText("");
        btnDangKyVeThang.setBorder(null);
        btnDangKyVeThang.setBorderPainted(false);
        btnDangKyVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangKyVeThang.setFocusPainted(false);
        btnDangKyVeThang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangKyVeThang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangKyVeThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyVeThangActionPerformed(evt);
            }
        });

        btnTraCuuBaiXe.setBackground(new java.awt.Color(255, 255, 65));
        btnTraCuuBaiXe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTraCuuBaiXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_car_racing_32px_1.png"))); // NOI18N
        btnTraCuuBaiXe.setText("Tra Cứu Bãi Xe");
        btnTraCuuBaiXe.setToolTipText("");
        btnTraCuuBaiXe.setBorder(null);
        btnTraCuuBaiXe.setBorderPainted(false);
        btnTraCuuBaiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraCuuBaiXe.setFocusPainted(false);
        btnTraCuuBaiXe.setFocusable(false);
        btnTraCuuBaiXe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTraCuuBaiXe.setName("btnTraCuuBaiXe"); // NOI18N
        btnTraCuuBaiXe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTraCuuBaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuBaiXeActionPerformed(evt);
            }
        });

        btnThongTinThem.setBackground(new java.awt.Color(255, 255, 65));
        btnThongTinThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThongTinThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_information_32px.png"))); // NOI18N
        btnThongTinThem.setText("Thông Tin");
        btnThongTinThem.setToolTipText("");
        btnThongTinThem.setBorder(null);
        btnThongTinThem.setBorderPainted(false);
        btnThongTinThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTinThem.setFocusPainted(false);
        btnThongTinThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongTinThem.setName("btnThongTinThem"); // NOI18N
        btnThongTinThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongTinThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNhanXe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTraXe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDangKyVeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTraCuuBaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongTinThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(13, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(btnNhanXe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnTraXe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnDangKyVeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnTraCuuBaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnThongTinThem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TabMainBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        TabMainBoard.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        TabMainBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabMainBoard.setFocusable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/logo.png"))); // NOI18N
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(TabMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        new A_FLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnTraXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraXeActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraXeTab = new PFTraXe();
            TabMainBoard.addTab("Trả Xe", null, PFTraXeTab, "Trả Xe");
        }
        if (PFTraXeTab == null) {
            PFTraXeTab = new PFTraXe();
            TabMainBoard.addTab("Trả Xe", null, PFTraXeTab, "Trả Xe");
        }
    }//GEN-LAST:event_btnTraXeActionPerformed

    private void btnThongTinThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinThemActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFInfor = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
        }
        if (PFInfor == null) {
            PFInfor = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
        }
    }//GEN-LAST:event_btnThongTinThemActionPerformed

    private void btnNhanXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanXeActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFNhanXeTab = new PFNhanXe();
            TabMainBoard.addTab("Nhận Xe", null, PFNhanXeTab, "Nhận Xe");
        }
        if (PFNhanXeTab == null) {
            PFNhanXeTab = new PFNhanXe();
            TabMainBoard.addTab("Nhận Xe", null, PFNhanXeTab, "Nhận Xe");
        }
    }//GEN-LAST:event_btnNhanXeActionPerformed

    private void btnDangKyVeThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyVeThangActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFDKiVeThangTab = new PFDKiVeThang();
            TabMainBoard.addTab("Đăng Kí Vé Tháng", null, PFDKiVeThangTab, "Đăng Kí Vé Tháng");
        }
        if (PFDKiVeThangTab == null) {
            PFDKiVeThangTab = new PFDKiVeThang();
            TabMainBoard.addTab("Đăng Kí Vé Tháng", null, PFDKiVeThangTab, "Đăng Kí Vé Tháng");
        }
    }//GEN-LAST:event_btnDangKyVeThangActionPerformed

    private void btnTraCuuBaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuBaiXeActionPerformed
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraCuuBaiXeTab = new PFTraCuuBaiXe();
            TabMainBoard.addTab("Tra Cứu Bãi Gửi Xe", null, PFTraCuuBaiXeTab, "Tra Cứu Bãi Gửi Xe");
        }
        if (PFTraCuuBaiXeTab == null) {
            PFTraCuuBaiXeTab = new PFTraCuuBaiXe();
            TabMainBoard.addTab("Tra Cứu Bãi Gửi Xe", null, PFTraCuuBaiXeTab, "Tra Cứu Bãi Gửi Xe");
        }
    }//GEN-LAST:event_btnTraCuuBaiXeActionPerformed

    private void txtChaomungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChaomungActionPerformed
        /*if(PFNhanVienTab == null){
            PFNhanVienTab = new PFNhanVien();
            TabMainBoard.addTab("Nhân Viên", null, PFNhanVienTab, "Nhân Viên");
        }
        TabMainBoard.setSelectedComponent(PFNhanVienTab);*/
    }//GEN-LAST:event_txtChaomungActionPerformed

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        new A_FLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnDoimaukhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoimaukhauMouseClicked
        new C_FDoiMatKhau().setVisible(true);
    }//GEN-LAST:event_btnDoimaukhauMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabMainBoard;
    private javax.swing.JButton btnDangKyVeThang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JLabel btnDoimaukhau;
    private javax.swing.JButton btnNhanXe;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JButton btnThongTinThem;
    private javax.swing.JButton btnTraCuuBaiXe;
    private javax.swing.JButton btnTraXe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton txtChaomung;
    // End of variables declaration//GEN-END:variables
}
