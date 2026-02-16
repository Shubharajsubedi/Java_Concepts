package labEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {

    LoginForm() {
        JFrame f = new JFrame("Login Form");
        f.setSize(600, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(100, 50, 100, 25);

        JTextField nameField = new JTextField();
        nameField.setBounds(250, 50, 150, 25);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(100, 100, 100, 25);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(250, 100, 150, 25);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(250, 150, 100, 30);

        f.add(nameLabel);
        f.add(nameField);
        f.add(passwordLabel);
        f.add(passwordField);
        f.add(loginButton);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());
                if(name.equals("admin") && password.equals("123"))
                {
                    JOptionPane.showMessageDialog(null, "Login Successful");

                }else{
                    JOptionPane.showMessageDialog(null, "Invalide username and password");

                }
            }});

        f.setVisible(true);
    }

    public static void main(String[] args) {
        LoginForm form = new LoginForm();
    }
}
