/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DAO.QuanLyBaiXeDAO;
import DAO.TraCuuBaiXeDAO;
import java.awt.event.ItemEvent;
import DAO.QuanLyBaiXeDAO;
import DTO.NhapXeDTO;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class PFQuanLyBaiXe extends javax.swing.JPanel {

    /**
     * Creates new form PFGiveCarBack
     */
    public PFQuanLyBaiXe() {
        initComponents();
        setSize(1040, 545);
        LoadForm();
        showTable();
        loadTabel();
    }

    private void LoadForm() {
        TraCuuBaiXeDAO tx = new TraCuuBaiXeDAO();

        txtXeA.setText(tx.XeMayA());
        txtXeB.setText(tx.XeMayB());
        txtXeC.setText(tx.XeMayC());
        txtXeD.setText(tx.XeMayD());
        txtXeE.setText(tx.OTOE());
        txtXeF.setText(tx.OTOF());
    }

    private void showTable() {
        DefaultTableModel tblModel;
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Loại Xe", "Biển Số Xe", "Màu Xe", "Mã Vé", "Khu Vực", "Vị Trí", "Ngày Nhận", "Giờ Nhận"});
        TableXeTrongBai.setModel(tblModel);
    }

    public void loadTabel() {
        ArrayList<NhapXeDTO> list = QuanLyBaiXeDAO.veXe();
        DefaultTableModel tblModel = (DefaultTableModel) TableXeTrongBai.getModel();
        Object[] row = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getLoaiXe();
            row[1] = list.get(i).getBienSo();
            row[2] = list.get(i).getMauXe();
            row[3] = list.get(i).getMaVe();
            row[4] = list.get(i).getKhuVuc();
            row[5] = list.get(i).getViTri();
            row[6] = list.get(i).getNgayGui();
            row[7] = list.get(i).getGioGui();
            tblModel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TableXeTrongBai = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxLoaiXe = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxLoaiVe = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtXeA = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtXeD = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtXeB = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtXeC = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtXeE = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtXeF = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        TableXeTrongBai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Loại Xe", "Biển Số Xe", "Màu Xe", "Mã Xe", "Khu Vực", "Vị Trí", "Ngày Nhận", "Giờ Nhận"
            }
        ));
        jScrollPane1.setViewportView(TableXeTrongBai);
        if (TableXeTrongBai.getColumnModel().getColumnCount() > 0) {
            TableXeTrongBai.getColumnModel().getColumn(0).setPreferredWidth(100);
            TableXeTrongBai.getColumnModel().getColumn(0).setMaxWidth(100);
            TableXeTrongBai.getColumnModel().getColumn(1).setPreferredWidth(150);
            TableXeTrongBai.getColumnModel().getColumn(1).setMaxWidth(150);
            TableXeTrongBai.getColumnModel().getColumn(2).setPreferredWidth(120);
            TableXeTrongBai.getColumnModel().getColumn(2).setMaxWidth(120);
            TableXeTrongBai.getColumnModel().getColumn(3).setPreferredWidth(100);
            TableXeTrongBai.getColumnModel().getColumn(3).setMaxWidth(100);
            TableXeTrongBai.getColumnModel().getColumn(4).setPreferredWidth(80);
            TableXeTrongBai.getColumnModel().getColumn(4).setMaxWidth(80);
            TableXeTrongBai.getColumnModel().getColumn(5).setPreferredWidth(80);
            TableXeTrongBai.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Xe đang trong bãi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Loại Xe :");

        cbxLoaiXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng xe", "Xe máy", "Ô tô" }));
        cbxLoaiXe.setBorder(null);
        cbxLoaiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxLoaiXe.setFocusable(false);
        cbxLoaiXe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLoaiXeItemStateChanged(evt);
            }
        });
        cbxLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoaiXeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Loại Vé :");

        cbxLoaiVe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxLoaiVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng vé", "Vé Ngày", "Vé Tháng" }));
        cbxLoaiVe.setBorder(null);
        cbxLoaiVe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxLoaiVe.setFocusable(false);
        cbxLoaiVe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLoaiVeItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Xe đang trong khu A :");

        txtXeA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtXeA.setBorder(null);
        txtXeA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtXeA.setEnabled(false);
        txtXeA.setFocusable(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Chiếc");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Xe đang trong khu D :");

        txtXeD.setBackground(new java.awt.Color(204, 204, 204));
        txtXeD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtXeD.setBorder(null);
        txtXeD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtXeD.setEnabled(false);
        txtXeD.setFocusable(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Chiếc");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Xe đang trong khu B :");

        txtXeB.setBackground(new java.awt.Color(204, 204, 204));
        txtXeB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtXeB.setBorder(null);
        txtXeB.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtXeB.setEnabled(false);
        txtXeB.setFocusable(false);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Chiếc");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Xe đang trong khu C :");

        txtXeC.setBackground(new java.awt.Color(204, 204, 204));
        txtXeC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtXeC.setBorder(null);
        txtXeC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtXeC.setEnabled(false);
        txtXeC.setFocusable(false);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Chiếc");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Xe đang trong khu E :");

        txtXeE.setBackground(new java.awt.Color(204, 204, 204));
        txtXeE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtXeE.setBorder(null);
        txtXeE.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtXeE.setEnabled(false);
        txtXeE.setFocusable(false);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Chiếc");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Xe đang trong khu F :");

        txtXeF.setBackground(new java.awt.Color(204, 204, 204));
        txtXeF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtXeF.setBorder(null);
        txtXeF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtXeF.setEnabled(false);
        txtXeF.setFocusable(false);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Chiếc");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXeC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXeB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXeA, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXeD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXeE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXeF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtXeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(txtXeD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txtXeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txtXeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtXeF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtXeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbxLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbxLoaiVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbxLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxLoaiVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoaiXeActionPerformed

    }//GEN-LAST:event_cbxLoaiXeActionPerformed

    private void cbxLoaiXeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLoaiXeItemStateChanged
        DefaultTableModel tblModel = (DefaultTableModel) TableXeTrongBai.getModel();
        Object[] row = new Object[8];
        cbxLoaiXe = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cbxLoaiXe.getSelectedItem().toString().equals("Tổng xe") && cbxLoaiVe.getSelectedItem().toString().equals("Tổng vé")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeAll();
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy") && cbxLoaiVe.getSelectedItem().toString().equals("Tổng vé")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeTheoXe(cbxLoaiXe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô") && cbxLoaiVe.getSelectedItem().toString().equals("Tổng vé")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeTheoXe(cbxLoaiXe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else if (cbxLoaiXe.getSelectedItem().toString().equals("Tổng xe") && cbxLoaiVe.getSelectedItem().toString().equals("Vé Ngày")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeTheoVe(cbxLoaiVe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else if (cbxLoaiXe.getSelectedItem().toString().equals("Tổng xe") && cbxLoaiVe.getSelectedItem().toString().equals("Vé Tháng")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeTheoVe(cbxLoaiVe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else{
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXe(cbxLoaiXe.getSelectedItem().toString(),cbxLoaiVe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_cbxLoaiXeItemStateChanged

    private void cbxLoaiVeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLoaiVeItemStateChanged
        DefaultTableModel tblModel = (DefaultTableModel) TableXeTrongBai.getModel();
        Object[] row = new Object[8];
        cbxLoaiVe = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cbxLoaiXe.getSelectedItem().toString().equals("Tổng xe") && cbxLoaiVe.getSelectedItem().toString().equals("Tổng vé")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeAll();
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy") && cbxLoaiVe.getSelectedItem().toString().equals("Tổng vé")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeTheoXe(cbxLoaiXe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô") && cbxLoaiVe.getSelectedItem().toString().equals("Tổng vé")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeTheoXe(cbxLoaiXe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else if (cbxLoaiXe.getSelectedItem().toString().equals("Tổng xe") && cbxLoaiVe.getSelectedItem().toString().equals("Vé Ngày")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeTheoVe(cbxLoaiVe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else if (cbxLoaiXe.getSelectedItem().toString().equals("Tổng xe") && cbxLoaiVe.getSelectedItem().toString().equals("Vé Tháng")) {
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXeTheoVe(cbxLoaiVe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            } else{
                for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                    tblModel.removeRow(i);
                }
                QuanLyBaiXeDAO tx = new QuanLyBaiXeDAO();
                ArrayList<NhapXeDTO> list = tx.findXe(cbxLoaiXe.getSelectedItem().toString(),cbxLoaiVe.getSelectedItem().toString());
                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getLoaiXe();
                    row[1] = list.get(i).getBienSo();
                    row[2] = list.get(i).getMauXe();
                    row[3] = list.get(i).getMaVe();
                    row[4] = list.get(i).getKhuVuc();
                    row[5] = list.get(i).getViTri();
                    row[6] = list.get(i).getNgayGui();
                    row[7] = list.get(i).getGioGui();
                    tblModel.addRow(row);
                }
            }
    }  
    }//GEN-LAST:event_cbxLoaiVeItemStateChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableXeTrongBai;
    private javax.swing.JComboBox<String> cbxLoaiVe;
    private javax.swing.JComboBox<String> cbxLoaiXe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtXeA;
    private javax.swing.JTextField txtXeB;
    private javax.swing.JTextField txtXeC;
    private javax.swing.JTextField txtXeD;
    private javax.swing.JTextField txtXeE;
    private javax.swing.JTextField txtXeF;
    // End of variables declaration//GEN-END:variables
}