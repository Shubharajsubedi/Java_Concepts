package labEight;

import javax.swing.*;
import java.awt.*;

public class ColorRadioButton extends JFrame {
    public ColorRadioButton() {
        setTitle("Background Color Selector");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,50));


        JRadioButton redBtn = new JRadioButton("Red");

        JRadioButton yellowBtn = new JRadioButton("Yellow");

        JRadioButton whiteBtn = new JRadioButton("White");

        JRadioButton grayBtn = new JRadioButton("Gray",true);

        JRadioButton greenBtn = new JRadioButton("Green");


        ButtonGroup bg = new ButtonGroup();
        bg.add(redBtn);
        bg.add(yellowBtn);
        bg.add(whiteBtn);
        bg.add(grayBtn);
        bg.add(greenBtn);


        panel.add(redBtn);
        panel.add(yellowBtn);
        panel.add(whiteBtn);
        panel.add(grayBtn);
        panel.add(greenBtn);

        redBtn.setOpaque(false);
        yellowBtn.setOpaque(false);
        add(panel);
        setVisible(true);

// redBtn.addActionListener(new ActionListener() {
// public void actionPerformed(ActionEvent e) {
// getContentPane().setBackground(Color.RED);
// }
// });

        redBtn.addActionListener(e -> panel.setBackground(Color.RED));
        yellowBtn.addActionListener(e -> panel.setBackground(Color.YELLOW));
        whiteBtn.addActionListener(e -> panel.setBackground(Color.WHITE));
        grayBtn.addActionListener(e -> panel.setBackground(Color.GRAY));
        greenBtn.addActionListener(e -> panel.setBackground(Color.GREEN));

    }

    public static void main(String[] args) {
        new ColorRadioButton();
    }
}