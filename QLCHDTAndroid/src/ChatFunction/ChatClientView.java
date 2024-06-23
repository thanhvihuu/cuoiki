/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatFunction;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author THANH
 */
public class ChatClientView extends JFrame {
    private JTextField accountField = new JTextField(20);
    private JPasswordField passwordField = new JPasswordField(20);
    private JButton loginButton = new JButton("Login");
    private JTextField messageField = new JTextField(40);
    private JButton sendButton = new JButton("Send");
    private JTextArea chatArea = new JTextArea(10, 40);

    private ChatClientController controller;

    public ChatClientView(ChatClientController controller) {
        this.controller = controller;

        JPanel loginPanel = new JPanel(new GridLayout(3, 2));
        loginPanel.add(new JLabel("Account:"));
        loginPanel.add(accountField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);

        JPanel chatPanel = new JPanel(new BorderLayout());
        chatPanel.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        JPanel messagePanel = new JPanel();
        messagePanel.add(messageField);
        messagePanel.add(sendButton);
        chatPanel.add(messagePanel, BorderLayout.SOUTH);

        add(loginPanel, BorderLayout.NORTH);
        add(chatPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Chat Client");
        pack();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String account = accountField.getText();
                String password = new String(passwordField.getPassword());
                controller.login(account, password);
            }
        });

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = messageField.getText();
                controller.sendMessage(message);
            }
        });
    }

    public void displayMessage(String message) {
        chatArea.append(message + "\n");
    }

    public void clearMessageField() {
        messageField.setText("");
    }

    public void enableChat(boolean enabled) {
        messageField.setEditable(enabled);
        sendButton.setEnabled(enabled);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChatClientController controller = new ChatClientController();
            ChatClientView view = new ChatClientView(controller);
            controller.setView(view);
            view.setVisible(true);
        });
    }
}
