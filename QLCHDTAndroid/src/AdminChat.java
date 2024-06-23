package Chat;

import java.io.*;
import java.net.*;
import javax.swing.*;

public class AdminChat extends javax.swing.JFrame {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public AdminChat() {
        initComponents();
        startServer();
    }

    private void startServer() {
        try {
            serverSocket = new ServerSocket(12345);
            new Thread(() -> {
                try {
                    clientSocket = serverSocket.accept();
                    out = new ObjectOutputStream(clientSocket.getOutputStream());
                    in = new ObjectInputStream(clientSocket.getInputStream());
                    jTextArea1.append("Nhân viên đã kết nối.\n");

                    Object inputObject;
                    while ((inputObject = in.readObject()) != null) {
                        if (inputObject instanceof String) {
                            String message = (String) inputObject;
                            jTextArea1.append("Nhận từ Nhân viên: " + message + "\n");
                        } else if (inputObject instanceof byte[]) {
                            byte[] fileData = (byte[]) inputObject;
                            // Save the received file
                            FileOutputStream fileOut = new FileOutputStream("received_file_from_nhanvien");
                            fileOut.write(fileData);
                            fileOut.close();
                            jTextArea1.append("Đã nhận file từ Nhân viên.\n");
                        }
                    }
                } catch (IOException | ClassNotFoundException e) {
                    jTextArea1.append("Lỗi: " + e.getMessage() + "\n");
                }
            }).start();
        } catch (IOException e) {
            jTextArea1.append("Lỗi khi khởi động Admin: " + e.getMessage() + "\n");
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Gửi");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setText("Gửi file");
        jButton2.addActionListener(evt -> jButton2ActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String message = jTextField1.getText();
        if (message != null && !message.isEmpty() && out != null) {
            try {
                out.writeObject(message);
                jTextArea1.append("Gửi tới Nhân viên: " + message + "\n");
                jTextField1.setText("");
            } catch (IOException e) {
                jTextArea1.append("Lỗi khi gửi tin nhắn: " + e.getMessage() + "\n");
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (FileInputStream fileIn = new FileInputStream(file)) {
                byte[] fileData = fileIn.readAllBytes();
                out.writeObject(fileData);
                jTextArea1.append("Đã gửi file tới Nhân viên.\n");
            } catch (IOException e) {
                jTextArea1.append("Lỗi khi gửi file: " + e.getMessage() + "\n");
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AdminChat().setVisible(true));
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
}