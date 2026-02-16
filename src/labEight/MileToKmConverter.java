package labEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MileToKmConverter extends JFrame implements ActionListener {

    JTextField txtMiles, txtKm;
    JButton btnConvert;

    public MileToKmConverter() {
        setTitle("Mile to Kilometer Converter");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblMiles = new JLabel("Miles:");
        txtMiles = new JTextField();
        JLabel lblKm = new JLabel("Kilometers:");
        txtKm = new JTextField();
        txtKm.setEditable(false);

        btnConvert = new JButton("Convert");

        panel.add(lblMiles);
        panel.add(txtMiles);
        panel.add(lblKm);
        panel.add(txtKm);
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(btnConvert);

        add(panel);

        btnConvert.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConvert) {
            try {
                double miles = Double.parseDouble(txtMiles.getText());
                double km = miles * 1.60934;
                txtKm.setText(String.format("%.2f", km));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Please enter a valid number for miles.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new MileToKmConverter();
    }
}