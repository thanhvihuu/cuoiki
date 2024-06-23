/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLCHDTAndroid;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.sun.jdi.connect.spi.Connection;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import java.math.BigDecimal;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author THANH
 */
public class User extends javax.swing.JFrame {
        java.sql.Connection con2 = null; 
        PreparedStatement pst2 = null; 
        ResultSet rs2 = null;
    
    /**
     * Creates new form Admin
     */
    public User() throws SQLException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        showDataUser();
        
    }
    
       public void  showDataUser(){  
    try {
        con2 = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst2 = con2.prepareStatement("SELECT * FROM USERR"); 
        rs2 = pst2.executeQuery(); 
        
        DefaultTableModel model = new DefaultTableModel(); 
        tableUser.setModel(model); 
        
       model.addColumn("Mã Nhân VIên ID");
        model.addColumn("Tên Nhân Viên");
           model.addColumn("Chức Vụ");
              model.addColumn("Ca Làm Việc");
                 model.addColumn("Tài Khoản Đăng Nhập");
                    model.addColumn("Mật Khẩu Đăng Nhập");
        
       while(rs2.next()) { 
            model.addRow(new Object[] {rs2.getString("User_ID"),rs2.getString("Ten"),rs2.getString("ChucVu"),rs2.getString("CaLamViec"),rs2.getString("TaiKhoan"),rs2.getString("MatKhau")});

        }       
    } catch (SQLException ex) {
        System.out.println("Hệ Thống chạy lỗi!!!");
    }   
}
       
          public void getSelectedRowUSERR() {
            int selectedRow = tableUser.getSelectedRow();   
        if(tableUser.getValueAt(selectedRow, 0) == null ){ 
            
            tfMaNguoiDung.setText(""); 
            tfTenNguoiDung.setText(""); 
             tfChucVu.setText(""); 
              tfCaLamViec.setText(""); 
               tfLogin.setText(""); 
                tfPass.setText(""); 
            
        } else { 
        tfMaNguoiDung.setText(tableUser.getValueAt(selectedRow, 0).toString());  
         tfTenNguoiDung.setText(tableUser.getValueAt(selectedRow, 1).toString());  
          tfChucVu.setText(tableUser.getValueAt(selectedRow, 2).toString());  
           tfCaLamViec.setText(tableUser.getValueAt(selectedRow, 3).toString());  
            tfLogin.setText(tableUser.getValueAt(selectedRow, 4).toString());  
             tfPass.setText(tableUser.getValueAt(selectedRow, 5).toString());  
        }
      }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        butDonHang = new javax.swing.JButton();
        butNhanVien = new javax.swing.JButton();
        butThongKe = new javax.swing.JButton();
        butHangHoa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnrf = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfMaNguoiDung = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTenNguoiDung = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        butUserThem = new javax.swing.JButton();
        butUserXoa = new javax.swing.JButton();
        butUserHuy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfChucVu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCaLamViec = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        tfPass = new javax.swing.JTextField();
        butUserCapNhat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTimNV = new javax.swing.JTextField();
        butTim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpnAdmin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLCHDTAndroid/admin.png"))); // NOI18N

        butDonHang.setBackground(new java.awt.Color(58, 196, 195));
        butDonHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butDonHang.setForeground(new java.awt.Color(255, 255, 255));
        butDonHang.setText("ĐƠN HÀNG");
        butDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butDonHangMouseClicked(evt);
            }
        });

        butNhanVien.setBackground(new java.awt.Color(255, 102, 102));
        butNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        butNhanVien.setText("NGƯỜI DÙNG");

        butThongKe.setBackground(new java.awt.Color(58, 196, 195));
        butThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butThongKe.setForeground(new java.awt.Color(255, 255, 255));
        butThongKe.setText("THỐNG KÊ");
        butThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butThongKeActionPerformed(evt);
            }
        });

        butHangHoa.setBackground(new java.awt.Color(58, 196, 195));
        butHangHoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butHangHoa.setForeground(new java.awt.Color(255, 255, 255));
        butHangHoa.setText("HÀNG HÓA");
        butHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butHangHoaMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("THOÁT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        btnrf.setBackground(new java.awt.Color(58, 196, 195));
        btnrf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnrf.setForeground(new java.awt.Color(255, 255, 255));
        btnrf.setText("REFRESH");
        btnrf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnAdminLayout = new javax.swing.GroupLayout(jpnAdmin);
        jpnAdmin.setLayout(jpnAdminLayout);
        jpnAdminLayout.setHorizontalGroup(
            jpnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnAdminLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(butNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(butDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(butHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnrf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
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
                .addComponent(btnrf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("BẢNG NGƯỜI DÙNG");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Mã người dùng :");

        tfMaNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Chức vụ :");

        tfTenNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfTenNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenNguoiDungActionPerformed(evt);
            }
        });

        tableUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
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
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableUser);

        butUserThem.setBackground(new java.awt.Color(58, 196, 195));
        butUserThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butUserThem.setForeground(new java.awt.Color(255, 255, 255));
        butUserThem.setText("Thêm");
        butUserThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUserThemActionPerformed(evt);
            }
        });

        butUserXoa.setBackground(new java.awt.Color(58, 196, 195));
        butUserXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butUserXoa.setForeground(new java.awt.Color(255, 255, 255));
        butUserXoa.setText("Xóa");
        butUserXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUserXoaActionPerformed(evt);
            }
        });

        butUserHuy.setBackground(new java.awt.Color(58, 196, 195));
        butUserHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butUserHuy.setForeground(new java.awt.Color(255, 255, 255));
        butUserHuy.setText("Hủy");
        butUserHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butUserHuyMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Ca làm việc :");

        tfChucVu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfChucVuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tên người dùng :");

        tfCaLamViec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfCaLamViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCaLamViecActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Tài khoản  :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Mật khẩu :");

        tfLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tfPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        butUserCapNhat.setBackground(new java.awt.Color(58, 196, 195));
        butUserCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butUserCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        butUserCapNhat.setText("Cập nhật");
        butUserCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUserCapNhatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tìm kiếm User :");

        txtTimNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimNVActionPerformed(evt);
            }
        });

        butTim.setBackground(new java.awt.Color(58, 196, 195));
        butTim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butTim.setForeground(new java.awt.Color(255, 255, 255));
        butTim.setText("Tìm");
        butTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butTimMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(butUserThem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(butUserCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(butUserXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(butUserHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTenNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(tfMaNguoiDung)
                                    .addComponent(tfChucVu))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(tfCaLamViec)
                            .addComponent(tfPass)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butTim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMaNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butTim)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butUserThem)
                    .addComponent(butUserCapNhat)
                    .addComponent(butUserXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butUserHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Người dùng", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
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

    private void tfTenNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenNguoiDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenNguoiDungActionPerformed

    private void tfChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfChucVuActionPerformed

    private void tfCaLamViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCaLamViecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCaLamViecActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void butDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butDonHangMouseClicked
              this.dispose();
        new AdminDonHang().setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_butDonHangMouseClicked

    private void butHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butHangHoaMouseClicked
    this.dispose();
            try {
                new AdminHangHoa().setVisible(true);           // TODO add your handling code here:
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_butHangHoaMouseClicked

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        getSelectedRowUSERR() ;      // TODO add your handling code here:
    }//GEN-LAST:event_tableUserMouseClicked

    private void butUserThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUserThemActionPerformed
                        try { 
        con2 = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst2 = con2.prepareStatement("INSERT INTO USERR VALUES (?, ?, ?, ? ,?, ?)");  
        if(tfMaNguoiDung.getText().isEmpty() || tfTenNguoiDung.getText().isEmpty()|| tfChucVu.getText().isEmpty()|| tfCaLamViec.getText().isEmpty()|| tfLogin.getText().isEmpty()|| tfPass.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
        } else { 
            //          
            String hashedPassword = BCrypt.hashpw(tfPass.getText().toString(), BCrypt.gensalt()); //bam mat khau
            pst2.setString(1, tfMaNguoiDung.getText().toString()); 
               pst2.setString(2, tfTenNguoiDung.getText().toString()); 
               pst2.setString(3, tfChucVu.getText().toString()); 
               pst2.setString(4, tfCaLamViec.getText().toString()); 
               pst2.setString(5, tfLogin.getText().toString()); 
               pst2.setString(6, hashedPassword); 
        pst2.executeUpdate();
        JOptionPane.showMessageDialog(null, "Đã thêm", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataUser();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Đã  có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_butUserThemActionPerformed

    private void butUserXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUserXoaActionPerformed
        try { 
        con2 = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst2 = con2.prepareStatement("DELETE USERR WHERE User_ID = ?");   
         if(tfMaNguoiDung.getText().isEmpty() || tfTenNguoiDung.getText().isEmpty()|| tfChucVu.getText().isEmpty()|| tfCaLamViec.getText().isEmpty()|| tfLogin.getText().isEmpty()|| tfPass.getText().isEmpty())
        { 
            JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
        } else { 
        pst2.setString(1, tfMaNguoiDung.getText().toString()); 
        pst2.executeUpdate();  
        JOptionPane.showMessageDialog(null, "Đã xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataUser();            
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Đã  có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
    } 
    }//GEN-LAST:event_butUserXoaActionPerformed

    private void butUserHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butUserHuyMouseClicked
       tfMaNguoiDung.setText("");
       tfTenNguoiDung.setText("");
       tfChucVu.setText("");
       tfCaLamViec.setText("");
       tfLogin.setText("");
       tfPass.setText("");
    }//GEN-LAST:event_butUserHuyMouseClicked

    private void butUserCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUserCapNhatActionPerformed
      try { 
    con2 = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
    
    // Sửa câu lệnh UPDATE để chính xác cú pháp SQL
    pst2 = con2.prepareStatement("UPDATE USERR SET User_ID = ?, Ten = ?, ChucVu = ?, CaLamViec = ?, TaiKhoan = ?, MatKhau = ? WHERE User_ID = ?");

    
     if(tfMaNguoiDung.getText().isEmpty() || tfTenNguoiDung.getText().isEmpty()|| tfChucVu.getText().isEmpty()|| tfCaLamViec.getText().isEmpty()|| tfLogin.getText().isEmpty()|| tfPass.getText().isEmpty()) { 
        JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
    } else { 
        pst2.setString(1, tfMaNguoiDung.getText().toString());     
         pst2.setString(2, tfTenNguoiDung.getText().toString());  
          pst2.setString(3, tfChucVu.getText().toString());  
           pst2.setString(4, tfCaLamViec.getText().toString());  
            pst2.setString(5, tfLogin.getText().toString());  
             pst2.setString(6, tfPass.getText().toString());  
             
                // Đặt giá trị cho tham số WHERE
         pst2.setString(7, tfMaNguoiDung.getText().toString());
        
        
        pst2.executeUpdate();  
        JOptionPane.showMessageDialog(null, "Đã sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataUser();            
    }
} catch (SQLException ex) {
    ex.printStackTrace(); // Hiển thị lỗi chi tiết trong quá trình thực hiện truy vấn
    JOptionPane.showMessageDialog(null, "Đã có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
}        // TODO add your handling code here:
    }//GEN-LAST:event_butUserCapNhatActionPerformed

    private void txtTimNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimNVActionPerformed

    private void butTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butTimMouseClicked
                 try {
        con2 = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
       pst2 = con2.prepareStatement("SELECT * FROM USERR WHERE Ten LIKE ?"); 
         pst2.setString(1, "%" + txtTimNV.getText().toString() + "%");
        rs2 = pst2.executeQuery(); 
        
        DefaultTableModel model = new DefaultTableModel(); 
        tableUser.setModel(model); 
        
       model.addColumn("Mã Nhân VIên ID");
        model.addColumn("Tên Nhân Viên");
           model.addColumn("Chức Vụ");
              model.addColumn("Ca Làm Việc");
                 model.addColumn("Tài Khoản Đăng Nhập");
                    model.addColumn("Mật Khẩu Đăng Nhập");
        
       while(rs2.next()) { 
            model.addRow(new Object[] {rs2.getString("User_ID"),rs2.getString("Ten"),rs2.getString("ChucVu"),rs2.getString("CaLamViec"),rs2.getString("TaiKhoan"),rs2.getString("MatKhau")});

        }       
    } catch (SQLException ex) {
        System.out.println("Hệ Thống chạy lỗi!!!");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_butTimMouseClicked

    private void butThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butThongKeActionPerformed
          this.dispose();
         new AdThongKe().setVisible(true);
    }//GEN-LAST:event_butThongKeActionPerformed

    private void btnrfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrfActionPerformed
         this.dispose();
            try {
                new User().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnrfActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
                try {
                    new User().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrf;
    private javax.swing.JButton butDonHang;
    private javax.swing.JButton butHangHoa;
    private javax.swing.JButton butNhanVien;
    private javax.swing.JButton butThongKe;
    private javax.swing.JButton butTim;
    private javax.swing.JButton butUserCapNhat;
    private javax.swing.JButton butUserHuy;
    private javax.swing.JButton butUserThem;
    private javax.swing.JButton butUserXoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnAdmin;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField tfCaLamViec;
    private javax.swing.JTextField tfChucVu;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfMaNguoiDung;
    private javax.swing.JTextField tfPass;
    private javax.swing.JTextField tfTenNguoiDung;
    private javax.swing.JTextField txtTimNV;
    // End of variables declaration//GEN-END:variables
}
