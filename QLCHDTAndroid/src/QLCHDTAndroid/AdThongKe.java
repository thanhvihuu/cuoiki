/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLCHDTAndroid;
import com.sun.jdi.connect.spi.Connection;
import java.awt.print.PrinterException;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THANH
 */
public class AdThongKe extends javax.swing.JFrame {
           java.sql.Connection con = null; 
PreparedStatement pst = null; 
ResultSet rs = null;

    /**
     * Creates new form Admin
     */
    public AdThongKe() {
        initComponents();
        this.setLocationRelativeTo(null);
           showThongKe();
           showDoanhThu();
           showTongTien();
    }
    
   public void showThongKe() {
    try {
           con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        
        // Tạo câu truy vấn SQL để lấy thông tin sản phẩm có số lượng bán chạy nhất từ cao đến thấp
        String query = "SELECT Hang_ID, TenDienThoai, SUM(so_luong) AS total_quantity "
             + "FROM DonHang "
             + "GROUP BY Hang_ID, TenDienThoai "
             + "ORDER BY total_quantity DESC";

        pst = con.prepareStatement(query);
        rs = pst.executeQuery();

        // Tạo một đối tượng DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();
        tblTK.setModel(model);

        // Thêm các cột vào model
        model.addColumn("Mã hãng");
        model.addColumn("Tên sản phẩm");
        model.addColumn("Số lượng bán");

        // Thêm dữ liệu vào model từ kết quả truy vấn
        while (rs.next()) {
            model.addRow(new Object[]{rs.getString("Hang_ID"), rs.getString("TenDienThoai"), rs.getInt("total_quantity")});
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Hệ Thống chạy lỗi!!!");
    }
}
   
      public void showDoanhThu() {
    try {
           con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        
        // Tạo câu truy vấn SQL để lấy thông tin sản phẩm có số lượng bán chạy nhất từ cao đến thấp
        String query = "SELECT Hang_ID, TenDienThoai, so_luong, tong_tien FROM DonHang";
            

        pst = con.prepareStatement(query);
        rs = pst.executeQuery();

        // Tạo một đối tượng DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();
        tblDoanhThu.setModel(model);

        // Thêm các cột vào model
        model.addColumn("Mã hãng");
        model.addColumn("Tên sản phẩm");
        model.addColumn("Số lượng bán");
         model.addColumn("Tổng tiền");

        // Thêm dữ liệu vào model từ kết quả truy vấn
        while (rs.next()) {
            model.addRow(new Object[]{rs.getString("Hang_ID"), rs.getString("TenDienThoai"), rs.getInt("so_luong"), rs.getString("tong_tien")});
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Hệ Thống chạy lỗi!!!");
    }
}
      //tinh tong tien
      
      public void showTongTien() {
    try {
        con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa");

        // Tạo câu truy vấn SQL để tính tổng tiền từ DonHang
        String query = "SELECT SUM(tong_tien) as TongTien FROM DonHang";

        pst = con.prepareStatement(query);
        rs = pst.executeQuery();

        // Nếu có kết quả trả về
        if (rs.next()) {
            // Lấy tổng tiền từ kết quả truy vấn
            double tongTien = rs.getDouble("TongTien");
                tfTongDoanhThu.setText(String.format("%.2f", tongTien));

            // Hiển thị tổng tiền (ví dụ: in ra console hoặc gán vào một thành phần GUI)
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Hệ Thống chạy lỗi!!!");
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

        jpnAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        butDonHang = new javax.swing.JButton();
        butNhanVien = new javax.swing.JButton();
        butThongKe = new javax.swing.JButton();
        butHangHoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        butNhanVien1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTK = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfTongDoanhThu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpnAdmin.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCHDTAndroid/admin.png"))); // NOI18N

        butDonHang.setBackground(new java.awt.Color(58, 196, 195));
        butDonHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butDonHang.setForeground(new java.awt.Color(255, 255, 255));
        butDonHang.setText("ĐƠN HÀNG");
        butDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDonHangActionPerformed(evt);
            }
        });

        butNhanVien.setBackground(new java.awt.Color(58, 196, 195));
        butNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        butNhanVien.setText("NGƯỜI DÙNG");
        butNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butNhanVienMouseClicked(evt);
            }
        });
        butNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNhanVienActionPerformed(evt);
            }
        });

        butThongKe.setBackground(new java.awt.Color(255, 102, 102));
        butThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butThongKe.setForeground(new java.awt.Color(255, 255, 255));
        butThongKe.setText("THỐNG KÊ");

        butHangHoa.setBackground(new java.awt.Color(58, 196, 195));
        butHangHoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butHangHoa.setForeground(new java.awt.Color(255, 255, 255));
        butHangHoa.setText("HÀNG HÓA");
        butHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butHangHoaMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("THOÁT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        butNhanVien1.setBackground(new java.awt.Color(58, 196, 195));
        butNhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butNhanVien1.setForeground(new java.awt.Color(255, 255, 255));
        butNhanVien1.setText("REFRESH");
        butNhanVien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butNhanVien1MouseClicked(evt);
            }
        });
        butNhanVien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNhanVien1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnAdminLayout = new javax.swing.GroupLayout(jpnAdmin);
        jpnAdmin.setLayout(jpnAdminLayout);
        jpnAdminLayout.setHorizontalGroup(
            jpnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnAdminLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnAdminLayout.setVerticalGroup(
            jpnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAdminLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(butHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblTK.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTK);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("BÁN CHẠY NHẤT", jPanel1);

        tblDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblDoanhThu);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("TỔNG DOANH THU :");

        tfTongDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tfTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DOANH THU", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDonHangActionPerformed
       this.dispose();
         new AdminDonHang().setVisible(true);
    }//GEN-LAST:event_butDonHangActionPerformed

    private void butHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butHangHoaMouseClicked
this.dispose();
        try {
            new AdminHangHoa().setVisible(true);        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(AdThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butHangHoaMouseClicked

    private void butNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNhanVienActionPerformed
       
    }//GEN-LAST:event_butNhanVienActionPerformed

    private void butNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butNhanVienMouseClicked
this.dispose();
        try {
            new User().setVisible(true);        // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(AdThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butNhanVienMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void butNhanVien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butNhanVien1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_butNhanVien1MouseClicked

    private void butNhanVien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNhanVien1ActionPerformed
         this.dispose();
         new AdThongKe().setVisible(true);
    }//GEN-LAST:event_butNhanVien1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butDonHang;
    private javax.swing.JButton butHangHoa;
    private javax.swing.JButton butHangHoa1;
    private javax.swing.JButton butNhanVien;
    private javax.swing.JButton butNhanVien1;
    private javax.swing.JButton butThongKe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnAdmin;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblTK;
    private javax.swing.JTextField tfTongDoanhThu;
    // End of variables declaration//GEN-END:variables
}
