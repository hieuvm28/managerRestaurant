/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DAO_HoaDon;
import dao.DAO_HoaDonCT;
import dao.DAO_Menu;
import dao.DAO_Ship;
import dao.DAO_Statistical;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdbcHelper.ShareHelper;
import model.Ship;
import model.Statistical;

/**
 *
 * @author Admin
 */
public class PalStatistical extends javax.swing.JPanel {

    /**
     * Creats new form PalStatistical
     */
    DecimalFormat fomater = new DecimalFormat("###,###,###");
    DAO_Statistical daoSta = new DAO_Statistical();
    DAO_Ship daoShip = new DAO_Ship();
    DAO_Menu daoMenu = new DAO_Menu();
    DAO_HoaDonCT daoHDCT = new DAO_HoaDonCT();
    DAO_HoaDon daoHD = new DAO_HoaDon();
    String type;

    public PalStatistical() {
        initComponents();
        btnRemove.setVisible(false);
//        loadStatistical();
//        loadDonHang();
        load();
        //load Tổng hóa đơn
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbbTK = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDoanhThu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSumBill = new javax.swing.JTextField();
        btnQLType = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStatistical = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        radRemoveAll = new javax.swing.JRadioButton();
        radRemoveById = new javax.swing.JRadioButton();
        btnRemove = new javax.swing.JButton();

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 255, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STATISTICAL");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Thống kê theo: ");

        cbbTK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Tháng", "Ngày", "Năm", "Nhân viên bán", "Tên món ăn", "Hóa Đơn", " " }));
        cbbTK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTKItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tổng số hóa đơn");

        txtDoanhThu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoanhThuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Doanh thu");

        txtSumBill.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSumBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSumBillActionPerformed(evt);
            }
        });

        btnQLType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnQLType.setText("QUẢN LÝ LOẠI");
        btnQLType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTypeActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("QUẢN LÝ BÀN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_filled_48px.png"))); // NOI18N

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 51, 0)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        tbStatistical.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbStatistical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nhân viên bán", "Mã Hóa Đơn", "Tên Món", "Số Lương", "Đơn Giá", "Thành Tiền", "Ngày bán", "Giờ"
            }
        ));
        tbStatistical.setGridColor(new java.awt.Color(255, 255, 255));
        tbStatistical.setRowHeight(35);
        tbStatistical.setRowMargin(5);
        tbStatistical.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(tbStatistical);
        if (tbStatistical.getColumnModel().getColumnCount() > 0) {
            tbStatistical.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbStatistical.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbStatistical.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbStatistical.getColumnModel().getColumn(3).setPreferredWidth(30);
            tbStatistical.getColumnModel().getColumn(4).setPreferredWidth(40);
            tbStatistical.getColumnModel().getColumn(5).setPreferredWidth(45);
            tbStatistical.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        jTabbedPane1.addTab("HÓA ĐƠN BÁN", jScrollPane1);

        tbHoaDon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HX", "Tên Món", "SL", "Đơn Giá", "Thành Tiền", "Ngày Đặt ", "Ngày Giao"
            }
        ));
        tbHoaDon.setRowHeight(23);
        tbHoaDon.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane2.setViewportView(tbHoaDon);
        if (tbHoaDon.getColumnModel().getColumnCount() > 0) {
            tbHoaDon.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbHoaDon.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbHoaDon.getColumnModel().getColumn(2).setPreferredWidth(20);
            tbHoaDon.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbHoaDon.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbHoaDon.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        jTabbedPane1.addTab("ĐƠN HÀNG SHIP", jScrollPane2);

        radRemoveAll.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(radRemoveAll);
        radRemoveAll.setText("Xóa toàn bộ hóa đơn");
        radRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRemoveAllActionPerformed(evt);
            }
        });

        radRemoveById.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(radRemoveById);
        radRemoveById.setText("Xóa hóa đơn");
        radRemoveById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radRemoveByIdActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(58, 58, 58)))
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSumBill, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbTK, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(radRemoveAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radRemoveById)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnQLType)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radRemoveAll)
                    .addComponent(radRemoveById)
                    .addComponent(btnRemove))
                .addGap(10, 10, 10)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSumBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(cbbTK, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQLType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSumBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSumBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSumBillActionPerformed

    private void btnQLTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTypeActionPerformed
        new FrmCategory().setVisible(true);
    }//GEN-LAST:event_btnQLTypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FrmTable().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        load();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoanhThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoanhThuActionPerformed

    private void cbbTKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTKItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            type = cbbTK.getSelectedItem().toString();
            load();
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {

        }
    }//GEN-LAST:event_cbbTKItemStateChanged

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        int chooser = JOptionPane.showConfirmDialog(this, "BẠN CÓ CHẮC CHẮN MUỐN XÓA KHÔNG ? HÃY CHẮC CHẮN", "REMOVE", JOptionPane.YES_NO_OPTION);
        if (chooser == JOptionPane.YES_OPTION) {

            if (!radRemoveAll.isSelected() && !radRemoveById.isSelected()) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn phương thức xóa");
                return;
            }

            if (jTabbedPane1.getSelectedIndex() == 0) { // nếu nó đang ở tab 1
                if (radRemoveAll.isSelected()) { // kiểm tra xem lựa chọn xóa

                    daoHDCT.deleteAll();
                    daoHD.deleteAll();
                    loadStatistical();
                    radRemoveAll.setSelected(false);

                } else {

                    if (!(txtSearch.getText().equals(""))) {
                        int maHD = Integer.parseInt(txtSearch.getText());
                        daoHDCT.deleteById(maHD);
                        daoHD.deleteAllById(maHD);
                        loadStatistical();
                        radRemoveById.setSelected(false);
                        txtSearch.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã hóa đơn cần xóa");
                        txtSearch.requestFocus();
                    }
                }
            } else {
                if (radRemoveAll.isSelected()) { // kiểm tra xem lựa chọn xóa

                    daoShip.deleteAll();
                    loadDonHang();
                    radRemoveAll.setSelected(false);

                } else {
                    if (!(txtSearch.getText().equals(""))) {
                        int maHX = Integer.parseInt(txtSearch.getText());
                        daoShip.delete(maHX);
                        loadDonHang();
                        radRemoveById.setSelected(false);
                        txtSearch.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã hàng cần xóa");
                        txtSearch.requestFocus();
                    }
                }
            }

        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void radRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRemoveAllActionPerformed
        btnRemove.setVisible(true);
    }//GEN-LAST:event_radRemoveAllActionPerformed

    private void radRemoveByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radRemoveByIdActionPerformed
        btnRemove.setVisible(true);
    }//GEN-LAST:event_radRemoveByIdActionPerformed

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
         load();
    }//GEN-LAST:event_jTabbedPane1MousePressed

    public void load() {
        if (jTabbedPane1.getSelectedIndex() == 0) {
            loadStatistical();
        } else {
            loadDonHang();
        }
    }

    public void loadStatistical() {

        DefaultTableModel model = (DefaultTableModel) tbStatistical.getModel();
        model.setRowCount(0);
        try {
            double sum = 0;
            ArrayList<Statistical> list = new ArrayList<>();

            type = cbbTK.getSelectedItem().toString();
            String keyword = txtSearch.getText();
            if (type.trim().equals("All")) {
                txtSearch.setText("");
                list = daoSta.select();
                txtSumBill.setText(Integer.toString(daoHDCT.sumBillHD()));
            } else if (type.trim().equals("Tháng")) {
                int month = Integer.parseInt(keyword);
                list = daoSta.findByMonth(month);
                txtSumBill.setText(Integer.toString(daoHDCT.sumBillHDbyMonth(month)));
            } else if (type.equals("Ngày")) {
                int day = Integer.parseInt(keyword);
                list = daoSta.findByDay(day);
                txtSumBill.setText(Integer.toString(daoHDCT.sumBillHDbyDay(day)));
            } else if (type.equals("Năm")) {
                int year = Integer.parseInt(keyword);
                list = daoSta.findByYear(year);
            } else if (type.equals("Nhân viên bán")) {
                String nv = keyword;
                list = daoSta.findByNV(nv);
            } else if (type.equals("Hóa Đơn")) {
                int maHD = Integer.parseInt(keyword);
                list = daoSta.findByHoaDon(maHD);
            }
            
            for (Statistical sta : list) {
                double thanhTien = sta.getSoLuong() * sta.getDonGia();

                Object[] row = new Object[]{
                    sta.getMaNhanVien(),
                    sta.getMaHD(),
                    sta.getTenMon(),
                    sta.getSoLuong(),
                    fomater.format(sta.getDonGia()),
                    fomater.format(thanhTien),
                    sta.getNgayLapHD(),
                    sta.getGio()
                };
                sum += thanhTien;
                txtDoanhThu.setText(fomater.format(sum) + " VNĐ");
                model.addRow(row);
            }

        } catch (Exception e) {
        }

    }

    
    public void loadDonHang() {
        DefaultTableModel model = (DefaultTableModel) tbHoaDon.getModel();
        model.setRowCount(0);
        try {
            double sum = 0;
            ArrayList<Ship> list = new ArrayList<>();
            type = cbbTK.getSelectedItem().toString();
            String keyword = txtSearch.getText();
           
            if (type.trim().equals("All")) {
                txtSearch.setText("");
                list = daoShip.select();
                txtSumBill.setText(Integer.toString(daoHDCT.sumBillHX()));
            } else if (type.trim().equals("Tháng")) {
                int month = Integer.parseInt(keyword);
                list = daoShip.findByMonth(month);
                txtSumBill.setText(Integer.toString(daoHDCT.sumBillHXbyMonth(month)));
            } else if (type.equals("Ngày")) {
                int day = Integer.parseInt(keyword);
                list = daoShip.findByDay(day);
                txtSumBill.setText(Integer.toString(daoHDCT.sumBillHXbyMonth(day)));
            } else if (type.equals("Năm")) {
                int year = Integer.parseInt(keyword);
                list = daoShip.findByYear(year);
            } else if (type.equals("Hóa đơn")) {
                int maHX = Integer.parseInt(keyword);
                list = daoShip.finByHX(maHX);
            }
            
            for (Ship ship : list) {
                double thanhTien = ship.getSoLuong() * ship.getDonGia();

                Object[] row = new Object[]{
                    ship.getMaHX(),
                    daoMenu.findById(ship.getMaMon()).getTenMon(),
                    ship.getSoLuong(),
                    fomater.format(ship.getDonGia()),
                    fomater.format(thanhTien),
                    ship.getNgayDat(),
                    ship.getNgayGiao()
                };
                sum += thanhTien;
                txtDoanhThu.setText(fomater.format(sum) + " VNĐ");
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLType;
    private javax.swing.JButton btnRemove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbTK;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton radRemoveAll;
    private javax.swing.JRadioButton radRemoveById;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbStatistical;
    private javax.swing.JTextField txtDoanhThu;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSumBill;
    // End of variables declaration//GEN-END:variables
}
