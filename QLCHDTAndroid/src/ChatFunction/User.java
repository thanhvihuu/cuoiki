/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatFunction;
/**
 *
 * @author THANH
 */
public class User {
    private String userID;
    private String ten;
    private String chucVu;
    private String caLamViec;
    private String taiKhoan;
    private String matKhau;

    public User(String userID, String ten, String chucVu, String caLamViec, String taiKhoan, String matKhau) {
        this.userID = userID;
        this.ten = ten;
        this.chucVu = chucVu;
        this.caLamViec = caLamViec;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getUserID() {
        return userID;
    }

    public String getTen() {
        return ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getCaLamViec() {
        return caLamViec;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }
}