package labEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JTextField txtNum1, txtNum2, txtResult;
    JButton btnAdd, btnSub, btnMul, btnDiv;

    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        JLabel lblNum1 = new JLabel("First Number:");
        txtNum1 = new JTextField();
        JLabel lblNum2 = new JLabel("Second Number:");
        txtNum2 = new JTextField();
        JLabel lblResult = new JLabel("Result:");
        txtResult = new JTextField();
        txtResult.setEditable(false);

        btnAdd = new JButton("Add");
        btnSub = new JButton("Subtract");
        btnMul = new JButton("Multiply");
        btnDiv = new JButton("Divide");


        panel.add(lblNum1);
        panel.add(txtNum1);
        panel.add(lblNum2);
        panel.add(txtNum2);
        panel.add(lblResult);
        panel.add(txtResult);
        panel.add(btnAdd);
        panel.add(btnSub);
        panel.add(btnMul);
        panel.add(btnDiv);

        add(panel);

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        double result = 0;

        if (e.getSource() == btnAdd) {
            result = num1 + num2;
        } else if (e.getSource() == btnSub) {
            result = num1 - num2;
        } else if (e.getSource() == btnMul) {
            result = num1 * num2;
        } else if (e.getSource() == btnDiv) {
            if (num2 == 0) {
                JOptionPane.showMessageDialog(this,
                        "Cannot divide by zero",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            result = num1 / num2;
        }
        txtResult.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new CalculatorGUI().setVisible(true);
    }
}