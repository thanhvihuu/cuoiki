/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatFunction;
import java.sql.*;
import org.mindrot.jbcrypt.BCrypt;
/**
 *
 * @author THANH
 */
public class UserDAO {
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public UserDAO() throws SQLException {
        String url = "jdbc:sqlserver://LAPTOP-MPLEJDGS\\SQLEXPRESS:1433;databaseName=QLCHDTAndroid;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "sa";
        con = DriverManager.getConnection(url, username, password);
    }

    public User validateUser(String taiKhoan, String matKhau) {
        try {
            String query = "SELECT * FROM USERR WHERE TaiKhoan = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, taiKhoan);
            rs = pst.executeQuery();
            if (rs.next()) {
                String hashedPassword = rs.getString("MatKhau"); // Lấy mật khẩu đã băm từ CSDL

                // Kiểm tra mật khẩu nhập vào với mật khẩu đã băm
                if (BCrypt.checkpw(matKhau, hashedPassword)) {
                    String userID = rs.getString("User_ID");
                    String ten = rs.getString("Ten");
                    String chucVu = rs.getString("ChucVu");
                    String caLamViec = rs.getString("CaLamViec");
                    return new User(userID, ten, chucVu, caLamViec, taiKhoan, matKhau);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
