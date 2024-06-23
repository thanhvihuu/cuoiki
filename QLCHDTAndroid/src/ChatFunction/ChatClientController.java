/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatFunction;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.sql.SQLException;
/**
 *
 * @author THANH
 */
public class ChatClientController {
    private ChatClientView view;
    private UserDAO userDAO;
    private User currentUser;
    private Socket socket;
    private PrintWriter out;

    public ChatClientController() {
        try {
            //Khai báo và khởi tạo socket
            this.userDAO = new UserDAO();
            this.socket = new Socket("localhost", 11279); //tạo đối tượng socket ket noi toi server
            this.out = new PrintWriter(socket.getOutputStream(), true); //gửi dữ liệu cho server

            new Thread(new ReceiveMessages()).start(); //khoi tao va bat dau luong moi de nhan tin nhan tu server
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void setView(ChatClientView view) {
        this.view = view;
    }

    public void login(String taiKhoan, String matKhau) {
        User user = userDAO.validateUser(taiKhoan, matKhau);
        if (user != null) {
            this.currentUser = user;
            view.enableChat(true);
            view.displayMessage("Login successful. Start chatting!");
        } else {
            view.displayMessage("Invalid credentials. Try again.");
        }
    }

    public void sendMessage(String message) {
        if (currentUser != null) {
            String messageToSend = "[" + currentUser.getTen() + "]: " + message;
            out.println(messageToSend);
            view.clearMessageField();
        } else {
            view.displayMessage("You need to login first.");
        }
    }

    private class ReceiveMessages implements Runnable {
        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = in.readLine()) != null) {
                    view.displayMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
