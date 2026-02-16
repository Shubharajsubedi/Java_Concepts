package FirstGuiApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FirstGuiAPP {

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("First GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // center window

        // Main Panel (Card style)
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel title = new JLabel("Login");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(title, gbc);

        gbc.gridwidth = 1;

        // Username Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Username:"), gbc);

        // Username Field
        JTextField usernameField = new JTextField(15);
        gbc.gridx = 1;
        panel.add(usernameField, gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Password:"), gbc);

        // Password Field
        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        // Login Button
        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, gbc);

        // Message Label
        JLabel messageLabel = new JLabel("");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 4;
        panel.add(messageLabel, gbc);

        // Button Action
        loginButton.addActionListener((ActionEvent e) -> {
            String username = usernameField.getText();
            messageLabel.setText("Welcome, " + username + "!");
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
