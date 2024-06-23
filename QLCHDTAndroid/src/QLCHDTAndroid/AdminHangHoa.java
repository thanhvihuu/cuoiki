/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLCHDTAndroid;
import Chat.AdminChat;
import ChatFunction.ChatClientView;
import com.sun.jdi.connect.spi.Connection;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ChatFunction.ChatClientController;
import ChatFunction.ChatClientView;
/**
 *
 * @author THANH
 */
public class AdminHangHoa extends javax.swing.JFrame {
   java.sql.Connection con = null; 
PreparedStatement pst = null; 
ResultSet rs = null;
    

    /**
     * Creates new form Admin
     */
    public AdminHangHoa() throws SQLException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        showDataHangDienThoai();
        showDataDienThoai();

    }
    
   public void  showDataHangDienThoai(){  
    try {
        con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst = con.prepareStatement("SELECT * FROM HangDienThoai"); 
        rs = pst.executeQuery(); 
        
        DefaultTableModel model = new DefaultTableModel(); 
        tableHangDienThoai.setModel(model); 
        
       model.addColumn("Mã Hãng Điện Thoại_ID");
        model.addColumn("Tên Hãng");
        
        while(rs.next()) { 
            model.addRow(new Object[] {rs.getString("Hang_ID"),rs.getString("TenHang")});

        }       
    } catch (SQLException ex) {
        System.out.println("Hệ Thống chạy lỗi!!!");
    }   
}  
   
   
      public void  showDataDienThoai(){  
    try {
        con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst = con.prepareStatement("SELECT * FROM DienThoai"); 
        rs = pst.executeQuery(); 
        
        DefaultTableModel model = new DefaultTableModel(); 
        tblDT.setModel(model); 
        
       model.addColumn("Mã Điện Thoại_ID");
        model.addColumn("Mã Hãng_ID");
          model.addColumn("Tên Điện Thoại");
            model.addColumn("Đơn Giá");
        
        while(rs.next()) { 
            model.addRow(new Object[] {rs.getString("DienThoai_ID"),rs.getString("Hang_ID"),rs.getString("TenDienThoai"),rs.getString("GiaBan")});
        }   
    } catch (SQLException ex) {
        System.out.println("Hệ Thống chạy lỗi!!!");
    }   
} 
      
      public void getSelectedRowHDT() {
            int selectedRow = tableHangDienThoai.getSelectedRow();   
        if(tableHangDienThoai.getValueAt(selectedRow, 0) == null ){ 
            tfMaHang.setText(""); 
            tfTenHang.setText(""); 
            
        } else { 
        tfMaHang.setText(tableHangDienThoai.getValueAt(selectedRow, 0).toString());  
        tfTenHang.setText(tableHangDienThoai.getValueAt(selectedRow, 1).toString());                    
        }
      }
      
      
         public void getSelectedRowDT() {
            int selectedRow = tblDT.getSelectedRow();   
        if(tblDT.getValueAt(selectedRow, 0) == null ){ 
            tfMaDienThoai_ID.setText(""); 
            tfMaHang_ID.setText(""); 
             tfTenDienThoai.setText(""); 
              tfGiaBanDT.setText(""); 
            
        } else { 
        tfMaDienThoai_ID.setText(tblDT.getValueAt(selectedRow, 0).toString());  
        tfMaHang_ID.setText(tblDT.getValueAt(selectedRow, 1).toString());   
         tfTenDienThoai.setText(tblDT.getValueAt(selectedRow, 2).toString());  
          tfGiaBanDT.setText(tblDT.getValueAt(selectedRow, 3).toString());  
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
        jButton1 = new javax.swing.JButton();
        BUTRS = new javax.swing.JButton();
        btnADChat = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfMaHang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTenHang = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableHangDienThoai = new javax.swing.JTable();
        butHangHoaThemHang = new javax.swing.JButton();
        butHangHoaXoaHang = new javax.swing.JButton();
        butHangHoaCapNhatHang = new javax.swing.JButton();
        butHangHoaHuyHang = new javax.swing.JButton();
        txtTimKiemHDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        butSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfMaDienThoai_ID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfMaHang_ID = new javax.swing.JTextField();
        butThemDT = new javax.swing.JButton();
        butXoaDT = new javax.swing.JButton();
        butCapNhatDT = new javax.swing.JButton();
        butHuyDT = new javax.swing.JButton();
        tfTenDienThoai = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfGiaBanDT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDT = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtTimDT = new javax.swing.JTextField();
        butDonHang1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpnAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jpnAdmin.setForeground(new java.awt.Color(255, 255, 255));

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

        butThongKe.setBackground(new java.awt.Color(58, 196, 195));
        butThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butThongKe.setForeground(new java.awt.Color(255, 255, 255));
        butThongKe.setText("THỐNG KÊ");
        butThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butThongKeActionPerformed(evt);
            }
        });

        butHangHoa.setBackground(new java.awt.Color(255, 102, 102));
        butHangHoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butHangHoa.setForeground(new java.awt.Color(255, 255, 255));
        butHangHoa.setText("HÀNG HÓA");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("THOÁT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        BUTRS.setBackground(new java.awt.Color(58, 196, 195));
        BUTRS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BUTRS.setForeground(new java.awt.Color(255, 255, 255));
        BUTRS.setText("REFRESH");
        BUTRS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BUTRSMouseClicked(evt);
            }
        });

        btnADChat.setBackground(new java.awt.Color(58, 196, 195));
        btnADChat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnADChat.setForeground(new java.awt.Color(255, 255, 255));
        btnADChat.setText("CHAT");
        btnADChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnADChatMouseClicked(evt);
            }
        });
        btnADChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADChatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnAdminLayout = new javax.swing.GroupLayout(jpnAdmin);
        jpnAdmin.setLayout(jpnAdminLayout);
        jpnAdminLayout.setHorizontalGroup(
            jpnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jpnAdminLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(butNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(butDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(butHangHoa, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(BUTRS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnADChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addComponent(BUTRS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnADChat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("DANH SÁCH HÃNG ĐIỆN THOẠI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Mã Hãng_ID: ");

        tfMaHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Tên Hãng: ");

        tfTenHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfTenHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenHangActionPerformed(evt);
            }
        });

        tableHangDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableHangDienThoai.setModel(new javax.swing.table.DefaultTableModel(
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
        tableHangDienThoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHangDienThoaiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableHangDienThoai);

        butHangHoaThemHang.setBackground(new java.awt.Color(58, 196, 195));
        butHangHoaThemHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butHangHoaThemHang.setForeground(new java.awt.Color(255, 255, 255));
        butHangHoaThemHang.setText("Thêm");
        butHangHoaThemHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butHangHoaThemHangActionPerformed(evt);
            }
        });

        butHangHoaXoaHang.setBackground(new java.awt.Color(58, 196, 195));
        butHangHoaXoaHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butHangHoaXoaHang.setForeground(new java.awt.Color(255, 255, 255));
        butHangHoaXoaHang.setText("Xóa");
        butHangHoaXoaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butHangHoaXoaHangActionPerformed(evt);
            }
        });

        butHangHoaCapNhatHang.setBackground(new java.awt.Color(58, 196, 195));
        butHangHoaCapNhatHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butHangHoaCapNhatHang.setForeground(new java.awt.Color(255, 255, 255));
        butHangHoaCapNhatHang.setText("Cập Nhật");
        butHangHoaCapNhatHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butHangHoaCapNhatHangActionPerformed(evt);
            }
        });

        butHangHoaHuyHang.setBackground(new java.awt.Color(58, 196, 195));
        butHangHoaHuyHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butHangHoaHuyHang.setForeground(new java.awt.Color(255, 255, 255));
        butHangHoaHuyHang.setText("Hủy");
        butHangHoaHuyHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butHangHoaHuyHangMouseClicked(evt);
            }
        });

        txtTimKiemHDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimKiemHDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemHDTActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Tìm hãng :");

        butSearch.setBackground(new java.awt.Color(58, 196, 195));
        butSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butSearch.setForeground(new java.awt.Color(255, 255, 255));
        butSearch.setText("tìm");
        butSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(butHangHoaThemHang, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(butHangHoaCapNhatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(butHangHoaXoaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(butHangHoaHuyHang, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTimKiemHDT, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(butSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiemHDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butSearch)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butHangHoaThemHang)
                    .addComponent(butHangHoaCapNhatHang)
                    .addComponent(butHangHoaXoaHang)
                    .addComponent(butHangHoaHuyHang))
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Hãng diện thoại", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText("DANH SÁCH  ĐIỆN THOẠI");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Mã điện thoại _ID:");

        tfMaDienThoai_ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfMaDienThoai_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaDienThoai_IDActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Mã hãng_ID :");

        tfMaHang_ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfMaHang_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaHang_IDActionPerformed(evt);
            }
        });

        butThemDT.setBackground(new java.awt.Color(58, 196, 195));
        butThemDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butThemDT.setForeground(new java.awt.Color(255, 255, 255));
        butThemDT.setText("Thêm");
        butThemDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butThemDTActionPerformed(evt);
            }
        });

        butXoaDT.setBackground(new java.awt.Color(58, 196, 195));
        butXoaDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butXoaDT.setForeground(new java.awt.Color(255, 255, 255));
        butXoaDT.setText("Xóa");
        butXoaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butXoaDTActionPerformed(evt);
            }
        });

        butCapNhatDT.setBackground(new java.awt.Color(58, 196, 195));
        butCapNhatDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butCapNhatDT.setForeground(new java.awt.Color(255, 255, 255));
        butCapNhatDT.setText("Cập Nhật");
        butCapNhatDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCapNhatDTActionPerformed(evt);
            }
        });

        butHuyDT.setBackground(new java.awt.Color(58, 196, 195));
        butHuyDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butHuyDT.setForeground(new java.awt.Color(255, 255, 255));
        butHuyDT.setText("Hủy");
        butHuyDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butHuyDTMouseClicked(evt);
            }
        });

        tfTenDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfTenDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenDienThoaiActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("Tên điện thoại :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Giá bán :");

        tfGiaBanDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfGiaBanDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGiaBanDTActionPerformed(evt);
            }
        });

        tblDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblDT.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDT);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Tìm kiếm Điện thoại :");

        txtTimDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimDTActionPerformed(evt);
            }
        });

        butDonHang1.setBackground(new java.awt.Color(58, 196, 195));
        butDonHang1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        butDonHang1.setForeground(new java.awt.Color(255, 255, 255));
        butDonHang1.setText("Tìm");
        butDonHang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butDonHang1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfMaHang_ID))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMaDienThoai_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(tfGiaBanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfTenDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(200, 200, 200))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(butThemDT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(butCapNhatDT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(butXoaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(butHuyDT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTimDT, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(butDonHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMaDienThoai_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTenDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMaHang_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGiaBanDT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDonHang1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butThemDT)
                    .addComponent(butCapNhatDT)
                    .addComponent(butXoaDT)
                    .addComponent(butHuyDT))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 947, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Điện thoại", jPanel2);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTenHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenHangActionPerformed

    private void tfMaHang_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaHang_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaHang_IDActionPerformed

    private void tfTenDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenDienThoaiActionPerformed

    private void tfMaDienThoai_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaDienThoai_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaDienThoai_IDActionPerformed

    private void tfGiaBanDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGiaBanDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGiaBanDTActionPerformed

    private void butDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butDonHangMouseClicked
        this.dispose();
        new AdminDonHang().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_butDonHangMouseClicked

    private void butNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butNhanVienMouseClicked
     this.dispose();
       try {
           new User().setVisible(true);        // TODO add your handling code here:
       } catch (SQLException ex) {
           Logger.getLogger(AdminHangHoa.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_butNhanVienMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void butHangHoaThemHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butHangHoaThemHangActionPerformed
               try { 
        con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst = con.prepareStatement("INSERT INTO HangDienThoai VALUES (?, ?)");  
        if(tfMaHang.getText().isEmpty() || tfTenHang.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
        } else { 
       pst.setString(1, tfMaHang.getText().toString()); 
          pst.setString(2, tfTenHang.getText().toString()); 
       
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Đã thêm", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataHangDienThoai();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Đã  có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }
               
    }//GEN-LAST:event_butHangHoaThemHangActionPerformed

    private void butThemDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butThemDTActionPerformed
                    String GiaBantext = tfGiaBanDT.getText().toString();
               try { 
        con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst = con.prepareStatement("INSERT INTO DienThoai VALUES (?, ?, ?, ?)");  
        if(tfMaDienThoai_ID.getText().isEmpty() || tfMaHang_ID.getText().isEmpty()|| tfTenDienThoai.getText().isEmpty()|| tfGiaBanDT.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
        } else { 
       pst.setString(1, tfMaDienThoai_ID.getText().toString()); 
          pst.setString(2, tfMaHang_ID.getText().toString()); 
          pst.setString(3, tfTenDienThoai.getText().toString()); 
          BigDecimal giaBan = new BigDecimal(GiaBantext);
        pst.setBigDecimal(4, giaBan);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Đã thêm", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataDienThoai();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Đã  có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_butThemDTActionPerformed

    private void butHangHoaXoaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butHangHoaXoaHangActionPerformed
         try { 
        con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst = con.prepareStatement("DELETE HangDienThoai WHERE Hang_ID = ?");   
        if(tfMaHang.getText().isEmpty() || tfTenHang.getText().isEmpty())
        { 
            JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
        } else { 
        pst.setString(1, tfMaHang.getText().toString()); 
        pst.executeUpdate();  
        JOptionPane.showMessageDialog(null, "Đã xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataHangDienThoai();            
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Đã  có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
    } // TODO add your handling code here:
    }//GEN-LAST:event_butHangHoaXoaHangActionPerformed

    private void butXoaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butXoaDTActionPerformed
  try { 
        con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
        pst = con.prepareStatement("DELETE DienThoai WHERE DienThoai_ID = ?");   
         if(tfMaDienThoai_ID.getText().isEmpty() || tfMaHang_ID.getText().isEmpty()|| tfTenDienThoai.getText().isEmpty()|| tfGiaBanDT.getText().isEmpty())
        { 
            JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
        } else { 
        pst.setString(1, tfMaDienThoai_ID.getText().toString()); 
        pst.executeUpdate();  
        JOptionPane.showMessageDialog(null, "Đã xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataDienThoai();            
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Đã  có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_butXoaDTActionPerformed

    private void butHangHoaHuyHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butHangHoaHuyHangMouseClicked
       tfMaHang.setText("");
       tfTenHang.setText("");
    }//GEN-LAST:event_butHangHoaHuyHangMouseClicked

    private void butHuyDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butHuyDTMouseClicked
        tfMaDienThoai_ID.setText("");// TODO add your handling code here:
        tfMaHang_ID.setText("");
        tfTenDienThoai.setText("");
        tfGiaBanDT.setText("");
    }//GEN-LAST:event_butHuyDTMouseClicked

    private void tableHangDienThoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHangDienThoaiMouseClicked

        //        int selectedRow = tableHangDienThoai.getSelectedRow();
        //        if(tableHangDienThoai.getValueAt(selectedRow, 0) == null ){
            //            tfMaHang.setText("");
            //            tfTenHang.setText("");
            //
            //        } else {
            //        tfMaHang.setText(tableHangDienThoai.getValueAt(selectedRow, 0).toString());
            //        tfTenHang.setText(tableHangDienThoai.getValueAt(selectedRow, 1).toString());
            //        }
        // TODO add your handling code here:
        getSelectedRowHDT();
    }//GEN-LAST:event_tableHangDienThoaiMouseClicked

    private void tblDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDTMouseClicked
    getSelectedRowDT();  // TODO add your handling code here:
    }//GEN-LAST:event_tblDTMouseClicked

    private void butHangHoaCapNhatHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butHangHoaCapNhatHangActionPerformed
      try { 
    con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
    
    // Sửa câu lệnh UPDATE để chính xác cú pháp SQL
    pst = con.prepareStatement("UPDATE HangDienThoai SET Hang_ID = ?, TenHang = ? WHERE Hang_ID = ?");
    
    if (tfMaHang.getText().isEmpty() || tfTenHang.getText().isEmpty()) { 
        JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
    } else { 
        pst.setString(1, tfMaHang.getText().toString());     
        pst.setString(2, tfTenHang.getText().toString());
        
        // Đặt giá trị cho tham số WHERE
        pst.setString(3, tfMaHang.getText().toString());
        
        pst.executeUpdate();  
        JOptionPane.showMessageDialog(null, "Đã sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataHangDienThoai();            
    }
} catch (SQLException ex) {
    ex.printStackTrace(); // Hiển thị lỗi chi tiết trong quá trình thực hiện truy vấn
    JOptionPane.showMessageDialog(null, "Đã có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_butHangHoaCapNhatHangActionPerformed

    private void butCapNhatDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCapNhatDTActionPerformed
         String GiaBantext = tfGiaBanDT.getText().toString();
    try { 
    con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
    
    // Sửa câu lệnh UPDATE để chính xác cú pháp SQL
    pst = con.prepareStatement("UPDATE DienThoai set DienThoai_ID = ?, Hang_ID = ?, TenDienThoai = ?, GiaBan = ? WHERE DienThoai_ID = ?");

    if(tfMaDienThoai_ID.getText().isEmpty() || tfMaHang_ID.getText().isEmpty() || tfTenDienThoai.getText().isEmpty() || tfGiaBanDT.getText().isEmpty()) { 
        JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);    
    } else { 
        // Đảm bảo rằng các giá trị được lấy từ JTable và JTextField đều đúng
        pst.setString(1, tfMaDienThoai_ID.getText().toString());     
        pst.setString(2, tfMaHang_ID.getText().toString());
        pst.setString(3, tfTenDienThoai.getText().toString());

        // Sử dụng setBigDecimal cho trường GiaBan
        BigDecimal giaBan = new BigDecimal(GiaBantext);
        pst.setBigDecimal(4, giaBan);

        // Đặt giá trị cho tham số WHERE
        pst.setString(5, tfMaDienThoai_ID.getText().toString());  // Sửa lại thành trường khóa chính

        pst.executeUpdate();  
        JOptionPane.showMessageDialog(null, "Đã sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        showDataDienThoai();  // Hiển thị lại dữ liệu sau khi cập nhật          
    }
} catch (SQLException ex) {
    ex.printStackTrace(); // Hiển thị lỗi chi tiết trong quá trình thực hiện truy vấn
    JOptionPane.showMessageDialog(null, "Đã có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
}


       // TODO add your handling code here:
    }//GEN-LAST:event_butCapNhatDTActionPerformed

    private void BUTRSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUTRSMouseClicked
        this.dispose();
        try {
            new AdminHangHoa().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminHangHoa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BUTRSMouseClicked

    private void txtTimKiemHDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemHDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemHDTActionPerformed

    private void butSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSearchMouseClicked
  try {
    con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
    
    // Sử dụng PreparedStatement và thêm dấu '?' để tránh vấn đề SQL injection
    pst = con.prepareStatement("SELECT * FROM HangDienThoai WHERE TenHang LIKE ?");
    
    // Đặt giá trị vào dấu '?' trong câu lệnh SQL, thêm '%' để tìm kiếm các dòng có chứa kí tự 'o'
    pst.setString(1, "%" + txtTimKiemHDT.getText().toString() + "%");
    
    rs = pst.executeQuery(); 
    
    DefaultTableModel model = new DefaultTableModel(); 
    tableHangDienThoai.setModel(model); 
    
    model.addColumn("Mã Hãng Điện Thoại_ID");
    model.addColumn("Tên Hãng");
    
    while(rs.next()) { 
        model.addRow(new Object[] {rs.getString("Hang_ID"), rs.getString("TenHang")});
    }       
} catch (SQLException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Đã có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
}

  
    }//GEN-LAST:event_butSearchMouseClicked

    private void txtTimDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimDTActionPerformed

    private void butDonHang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butDonHang1MouseClicked
        
    try {
    con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true", "sa", "sa"); 
    pst = con.prepareStatement("SELECT * FROM DienThoai WHERE TenDienThoai LIKE ?");
    pst.setString(1, "%" + txtTimDT.getText().toString() + "%"); // Sử dụng LIKE để tìm kiếm theo mẫu
    
    rs = pst.executeQuery(); 
    
    DefaultTableModel model = new DefaultTableModel(); 
    tblDT.setModel(model); 
    
    model.addColumn("Mã Điện Thoại_ID");
    model.addColumn("Mã Hãng_ID");
    model.addColumn("Tên Điện Thoại");
    model.addColumn("Đơn Giá");
    
    while(rs.next()) { 
        model.addRow(new Object[] {rs.getString("DienThoai_ID"), rs.getString("Hang_ID"), rs.getString("TenDienThoai"), rs.getString("GiaBan")});
    }   
} catch (SQLException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Đã có lỗi xãy ra", "Thông báo", JOptionPane.ERROR_MESSAGE);
}
  
        // TODO add your handling code here:
    }//GEN-LAST:event_butDonHang1MouseClicked

    private void butThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butThongKeActionPerformed
         this.dispose();
         new AdThongKe().setVisible(true);
    }//GEN-LAST:event_butThongKeActionPerformed

    private void butNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNhanVienActionPerformed

    private void btnADChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnADChatMouseClicked
     
         
    }//GEN-LAST:event_btnADChatMouseClicked

    private void btnADChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADChatActionPerformed

    ChatClientController controller = new ChatClientController();
    ChatClientView chatClientView = new ChatClientView(controller);
    controller.setView(chatClientView);
    chatClientView.setVisible(true);
    }//GEN-LAST:event_btnADChatActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminHangHoa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminHangHoa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTRS;
    private javax.swing.JButton btnADChat;
    private javax.swing.JButton butCapNhatDT;
    private javax.swing.JButton butDonHang;
    private javax.swing.JButton butDonHang1;
    private javax.swing.JButton butHangHoa;
    private javax.swing.JButton butHangHoaCapNhatHang;
    private javax.swing.JButton butHangHoaHuyHang;
    private javax.swing.JButton butHangHoaThemHang;
    private javax.swing.JButton butHangHoaXoaHang;
    private javax.swing.JButton butHuyDT;
    private javax.swing.JButton butNhanVien;
    private javax.swing.JButton butSearch;
    private javax.swing.JButton butThemDT;
    private javax.swing.JButton butThongKe;
    private javax.swing.JButton butXoaDT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnAdmin;
    private javax.swing.JTable tableHangDienThoai;
    private javax.swing.JTable tblDT;
    private javax.swing.JTextField tfGiaBanDT;
    private javax.swing.JTextField tfMaDienThoai_ID;
    private javax.swing.JTextField tfMaHang;
    private javax.swing.JTextField tfMaHang_ID;
    private javax.swing.JTextField tfTenDienThoai;
    private javax.swing.JTextField tfTenHang;
    private javax.swing.JTextField txtTimDT;
    private javax.swing.JTextField txtTimKiemHDT;
    // End of variables declaration//GEN-END:variables
}
