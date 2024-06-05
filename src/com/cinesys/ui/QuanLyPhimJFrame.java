package com.cinesys.ui;

import com.cinesys.untils.DateHelper;
import com.cinesys.DAO.PhimDAO1;
import com.cinesys.entity.PhimEntity;
import com.cinesys.untils.MsgBox;
import com.cinesys.untils.Auth;
import com.cinesys.untils.catchException;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class QuanLyPhimJFrame extends javax.swing.JFrame {

    public QuanLyPhimJFrame() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        txtNgayKT = new javax.swing.JTextField();
        lblNgayKT = new javax.swing.JLabel();
        txtNgayKC = new javax.swing.JTextField();
        lblNgayKC = new javax.swing.JLabel();
        lblNamSX1 = new javax.swing.JLabel();
        lblNamSX = new javax.swing.JLabel();
        txtQuocGia = new javax.swing.JTextField();
        lblAnhPhim = new javax.swing.JLabel();
        txtNamSX = new javax.swing.JTextField();
        lblDaoDien = new javax.swing.JLabel();
        txtDaoDien = new javax.swing.JTextField();
        lblNgayMua = new javax.swing.JLabel();
        txtNgayMua = new javax.swing.JTextField();
        lblTheLoai = new javax.swing.JLabel();
        txtTheLoai = new javax.swing.JTextField();
        lblTenPhim = new javax.swing.JLabel();
        txtTenPhim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMaPhim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhim = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        btnXuatFileExcel = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbltitle.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(51, 51, 255));
        lbltitle.setText("QUẢN LÝ PHIM");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/icon/Refresh.png"))); // NOI18N
        btnTaoMoi.setText("Tạo mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        lblNgayKT.setText("Ngày Kết thúc:");

        lblNgayKC.setText("Ngày Khởi Chiếu:");

        lblNamSX1.setText("Quốc gia:");

        lblNamSX.setText("Năm SX:");

        txtQuocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuocGiaActionPerformed(evt);
            }
        });

        lblAnhPhim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cinesys/img/Default.png"))); // NOI18N
        lblAnhPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhPhimMouseClicked(evt);
            }
        });

        lblDaoDien.setText("Đao diễn:");

        lblNgayMua.setText("Ngày mua:");

        lblTheLoai.setText("Thể loại:");

        lblTenPhim.setText("Tên phim:");

        jLabel1.setText("Mã phim:");

        tblPhim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phim", "Tên Phim", "Thể loại", "Hình ảnh", "Ngày mua", "Đạo diễn", "Năm SX", "Quốc gia", "Ngay KC", "Ngày KT"
            }
        ));
        tblPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhimMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhim);

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        lblTimKiem.setText("Tìm kiếm:");

        btnXuatFileExcel.setText("Xuất file Excel");
        btnXuatFileExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(6, 6, 6)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTaoMoi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXuatFileExcel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblTimKiem)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 333, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblAnhPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDaoDien)
                                    .addComponent(lblNgayMua)
                                    .addComponent(lblNamSX)
                                    .addComponent(lblNamSX1)
                                    .addComponent(lblNgayKC)
                                    .addComponent(lblNgayKT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamSX)
                                    .addComponent(txtQuocGia)
                                    .addComponent(txtNgayKC)
                                    .addComponent(txtNgayKT)
                                    .addComponent(txtNgayMua)
                                    .addComponent(txtDaoDien)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTheLoai)
                                    .addComponent(lblTenPhim)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenPhim)
                                    .addComponent(txtTheLoai)
                                    .addComponent(txtMaPhim)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbltitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenPhim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTheLoai)
                            .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayMua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDaoDien)
                            .addComponent(txtDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamSX)
                            .addComponent(txtNamSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamSX1)
                            .addComponent(txtQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgayKC)
                            .addComponent(txtNgayKC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgayKT)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblAnhPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTaoMoi)
                    .addComponent(btnXuatFileExcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.load();
        this.setStatus(true);
        lblAnhPhim.setToolTipText("Default.png");
    }//GEN-LAST:event_formWindowOpened

    private void tblPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhimMouseClicked
        // TODO add your handling code here:
        setForm();
        this.setStatus(false);
//        if(evt.getClickCount() == 2){
//            this.index = tblPhim.rowAtPoint(evt.getPoint());
//            String imageName = String.valueOf(tblPhim.getValueAt(this.index, 3));
//            lblAnhPhim.setToolTipText(imageName);
//            showImage(imageName);
//        }
    }//GEN-LAST:event_tblPhimMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            them();
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            // TODO add your handling code here:
            xoa();
        } catch (SQLException ex) {
            throw new RuntimeException("Xóa không thành công");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            // TODO add your handling code here:
            sua();
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void lblAnhPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhPhimMouseClicked
        // TODO add your handling code here:
        selectImage();
    }//GEN-LAST:event_lblAnhPhimMouseClicked

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        loadforsearch();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void txtQuocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuocGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuocGiaActionPerformed

    private void btnXuatFileExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileExcelActionPerformed
        // TODO add your handling code here:
        writeExcel();
    }//GEN-LAST:event_btnXuatFileExcelActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyPhimJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhimJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhimJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyPhimJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyPhimJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatFileExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnhPhim;
    private javax.swing.JLabel lblDaoDien;
    private javax.swing.JLabel lblNamSX;
    private javax.swing.JLabel lblNamSX1;
    private javax.swing.JLabel lblNgayKC;
    private javax.swing.JLabel lblNgayKT;
    private javax.swing.JLabel lblNgayMua;
    private javax.swing.JLabel lblTenPhim;
    private javax.swing.JLabel lblTheLoai;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblPhim;
    private javax.swing.JTextField txtDaoDien;
    private javax.swing.JTextField txtMaPhim;
    private javax.swing.JTextField txtNamSX;
    private javax.swing.JTextField txtNgayKC;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtNgayMua;
    private javax.swing.JTextField txtQuocGia;
    private javax.swing.JTextField txtTenPhim;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    int index = 0;
    PhimDAO1 daoPhim = new PhimDAO1();

    void init() {
//        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);

    }

    void load() {
        DefaultTableModel model = (DefaultTableModel) tblPhim.getModel();
        model.setRowCount(0);
        try {
            List<PhimEntity> list = daoPhim.select();
            for (PhimEntity nh : list) {
                Object[] row = {
                    nh.getMaPhim(),
                    nh.getTenPhim(),
                    nh.getTheLoai(),
                    nh.getHinhAnh(),
                    nh.getNgayMua().toString(),
                    nh.getDaoDien(),
                    nh.getNamSX().toString(),
                    nh.getQuocGia(),
                    nh.getNgayKC().toString(),
                    nh.getNgayKT().toString()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    void loadforsearch() {
        try {
            List<PhimEntity> list = (List<PhimEntity>) daoPhim.findByTen(txtTimKiem.getText());
            if (list.size() > 0) {
                DefaultTableModel model = (DefaultTableModel) tblPhim.getModel();
                model.setRowCount(0);
                for (PhimEntity nh : list) {
                    Object[] row = {
                        nh.getMaPhim(),
                        nh.getTenPhim(),
                        nh.getTheLoai(),
                        nh.getHinhAnh(),
                        nh.getNgayMua().toString(),
                        nh.getDaoDien(),
                        nh.getNamSX().toString(),
                        nh.getQuocGia(),
                        nh.getNgayKC().toString(),
                        nh.getNgayKT().toString()
                    };
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi không tìm thấy dữ liệu!");
        }
    }

    void them() throws ParseException {
        if (catchException.nullPoint(txtDaoDien.getText()) || catchException.nullPoint(txtMaPhim.getText())
                || catchException.nullPoint(txtNamSX.getText()) || catchException.nullPoint(txtNgayKC.getText())
                || catchException.nullPoint(txtNgayMua.getText()) || catchException.nullPoint(txtNgayKT.getText())
                || catchException.nullPoint(txtQuocGia.getText()) || catchException.nullPoint(txtTenPhim.getText())
                || catchException.nullPoint(txtTheLoai.getText())) {
            MsgBox.alert(this, "bạn chưa nhập thông tin");
        } else {
            PhimEntity model = getModel();
            try {
                daoPhim.insert(model);
                this.load();
                this.clear();
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
            }
        }
    }

    void sua() throws ParseException {
        if (catchException.nullPoint(txtDaoDien.getText()) || catchException.nullPoint(txtMaPhim.getText())
                || catchException.nullPoint(txtNamSX.getText()) || catchException.nullPoint(txtNgayKC.getText())
                || catchException.nullPoint(txtNgayMua.getText()) || catchException.nullPoint(txtNgayKT.getText())
                || catchException.nullPoint(txtQuocGia.getText()) || catchException.nullPoint(txtTenPhim.getText())
                || catchException.nullPoint(txtTheLoai.getText())) {
            MsgBox.alert(this, "bạn chưa nhập thông tin");
        } else {
            PhimEntity model = getModel();
            try {
                daoPhim.update(model);
                this.load();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    void xoa() throws SQLException {
        if (catchException.nullPoint(txtDaoDien.getText()) || catchException.nullPoint(txtMaPhim.getText())
                || catchException.nullPoint(txtNamSX.getText()) || catchException.nullPoint(txtNgayKC.getText())
                || catchException.nullPoint(txtNgayMua.getText()) || catchException.nullPoint(txtNgayKT.getText())
                || catchException.nullPoint(txtQuocGia.getText()) || catchException.nullPoint(txtTenPhim.getText())
                || catchException.nullPoint(txtTheLoai.getText())) {
            MsgBox.alert(this, "bạn chưa nhập thông tin");
        } else {
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa người học này?")) {
                String maphim = txtMaPhim.getText();
                try {
                    daoPhim.delete(maphim);
                    this.load();
                    this.clear();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (HeadlessException e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    void clear() {
        txtMaPhim.setText("");
        txtTenPhim.setText("");
        txtTheLoai.setText("");
//        lblAnhPhim.setText("");
        txtNgayMua.setText("");
        txtDaoDien.setText("");
        txtNamSX.setText("");
        txtQuocGia.setText("");
        txtNgayKC.setText("");
        txtNgayKT.setText("");
        txtTimKiem.setText("");
        showImage("Default.png");
        this.setStatus(true);
    }

    void edit() {
        try {
            String maphim = (String) tblPhim.getValueAt(this.index, 0);
            PhimEntity model = daoPhim.findById(maphim);
            if (model != null) {
                this.setModel(model);
                this.setStatus(false);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void setModel(PhimEntity model) {
        txtMaPhim.setText(model.getMaPhim());
        txtTenPhim.setText(model.getTenPhim());
        txtTheLoai.setText(model.getTheLoai());
        lblAnhPhim.setToolTipText(model.getHinhAnh());
        System.out.println(model.getHinhAnh());
        ImageIcon image = new ImageIcon(model.getHinhAnh());
        Image img = image.getImage();
        ImageIcon icon = new ImageIcon(img.getScaledInstance(lblAnhPhim.getWidth(), lblAnhPhim.getHeight(), img.SCALE_SMOOTH));
        lblAnhPhim.setText("");
        lblAnhPhim.setIcon(icon);
        txtNgayMua.setText(DateHelper.toString(model.getNgayMua()));
        txtDaoDien.setText(model.getDaoDien());
        txtNamSX.setText(DateHelper.toString(model.getNamSX()));
        txtQuocGia.setText(model.getQuocGia());
        txtNgayKC.setText(DateHelper.toString(model.getNgayKC()));
        txtNgayKT.setText(DateHelper.toString(model.getNgayKT()));
    }

    // lưu dữ liệu từ text vào đối tượng tạm(model)
    PhimEntity getModel() throws ParseException {
        PhimEntity model = new PhimEntity();
        model.setMaPhim(txtMaPhim.getText());
        model.setTenPhim(txtTenPhim.getText());
        model.setTheLoai(txtTheLoai.getText());
        model.setHinhAnh(lblAnhPhim.getToolTipText());
        model.setNgayMua(DateHelper.toDate(txtNgayMua.getText()));
        model.setDaoDien(txtDaoDien.getText());
        model.setNamSX(DateHelper.toDate(txtNamSX.getText()));
        model.setQuocGia(txtQuocGia.getText());
        model.setNgayKC(DateHelper.toDate(txtNgayKC.getText()));
        model.setNgayKT(DateHelper.toDate(txtNgayKT.getText()));
        return model;
    }

    void setStatus(boolean insertable) {
        txtMaPhim.setEditable(insertable);
        btnThem.setEnabled(insertable);
        btnSua.setEnabled(!insertable);
        btnXoa.setEnabled(!insertable);
        boolean first = this.index > 0;
        boolean last = this.index < tblPhim.getRowCount() - 1;
    }

    private void selectImage() {
        JFileChooser fc = new JFileChooser("src");
        FileFilter filter = new FileNameExtensionFilter("Image Files", "gif", "jpeg", "jpg", "png");
        fc.setFileFilter(filter);
        fc.setMultiSelectionEnabled(false);
        int kq = fc.showOpenDialog(fc);
        if (kq == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            Auth.saveLogo(file); // lưu hình vào thư mục đã xác định trong  ShareHelper.saveLogo()
            ImageIcon image = Auth.readLogo(file.getName());
            Image img = image.getImage();
            ImageIcon icon = new ImageIcon(img.getScaledInstance(lblAnhPhim.getWidth(), lblAnhPhim.getHeight(), img.SCALE_SMOOTH));
            System.out.println(file.getName());
//            ImageIcon icon = Auth.readLogo(file.getName()); // đọc hình từ file
            lblAnhPhim.setText("");
            lblAnhPhim.setIcon(icon);
            lblAnhPhim.setToolTipText(file.getName()); // giữ tên hình trong tooltip
        }
    }

    private void showImage(String fileName) {
        ImageIcon icon = Auth.readLogo(fileName);
        lblAnhPhim.setIcon(icon);
        lblAnhPhim.setToolTipText(fileName);
    }

    public void setForm() {
        int row = tblPhim.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPhim.getModel();
        String maPhim = (String) tblPhim.getValueAt(row, 0);
        PhimEntity phim = new PhimEntity();
        try {
            phim = daoPhim.findById(maPhim);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setModel(phim);
    }

    private void writeExcel() {
        try {
            FileOutputStream fot = new FileOutputStream("src/Excel/RapPhim_Phim.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet ws = wb.createSheet("Phim");
            XSSFRow row;
            DefaultTableModel model = (DefaultTableModel) tblPhim.getModel();
            row = ws.createRow((short) 3);
            XSSFCell MaPhim = row.createCell((short) 3);
            MaPhim.setCellValue(model.getColumnName(0));
            XSSFCell TenPhim = row.createCell((short) 4);
            TenPhim.setCellValue(model.getColumnName(1));
            XSSFCell TheLoai = row.createCell((short) 5);
            TheLoai.setCellValue(model.getColumnName(2));
            XSSFCell HinhAnh = row.createCell((short) 6);
            HinhAnh.setCellValue(model.getColumnName(3));
            XSSFCell NgayMua = row.createCell((short) 7);
            NgayMua.setCellValue(model.getColumnName(4));
            XSSFCell DaoDien = row.createCell((short) 8);
            DaoDien.setCellValue(model.getColumnName(5));
            XSSFCell NamSX = row.createCell((short) 9);
            NamSX.setCellValue(model.getColumnName(6));
            XSSFCell QuocGia = row.createCell((short) 10);
            QuocGia.setCellValue(model.getColumnName(7));
            XSSFCell NgayKC = row.createCell((short) 11);
            NgayKC.setCellValue(model.getColumnName(8));
            XSSFCell NgayKT = row.createCell((short) 12);
            NgayKT.setCellValue(model.getColumnName(9));
            List<PhimEntity> list = daoPhim.select();
            int i = 3;
            for (PhimEntity ob : list) {
                row = ws.createRow((short) i + 1);
                XSSFCell cellA = row.createCell((short) 3);
                cellA.setCellValue(ob.getMaPhim());
                XSSFCell cellB = row.createCell((short) 4);
                cellB.setCellValue(ob.getTenPhim());
                XSSFCell cellC = row.createCell((short) 5);
                cellC.setCellValue(ob.getTheLoai());
                XSSFCell cellD = row.createCell((short) 6);
                cellD.setCellValue(ob.getHinhAnh());
                XSSFCell cellE = row.createCell((short) 7);
                cellE.setCellValue(ob.getNgayMua().toString());
                XSSFCell cellF = row.createCell((short) 8);
                cellF.setCellValue(ob.getDaoDien());
                XSSFCell cellG = row.createCell((short) 9);
                cellG.setCellValue(ob.getNamSX().toString());
                XSSFCell cellH = row.createCell((short) 10);
                cellH.setCellValue(ob.getQuocGia());
                XSSFCell cellI = row.createCell((short) 11);
                cellI.setCellValue(ob.getNgayKC().toString());
                XSSFCell cellj = row.createCell((short) 12);
                cellj.setCellValue(ob.getNgayKT().toString());
                i++;
            }
            wb.write(fot);
            wb.close();
            fot.close();
            MsgBox.alert(this, "Xuất file thành công");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex + "1");
        }
    }

}
