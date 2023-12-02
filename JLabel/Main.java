import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args){
        // JLabel = a GUI display area for a string of text, an image, or both

        // JLabel label = new JLabel("Bro, do you even code?");

        ImageIcon image = new ImageIcon("dude.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTON of imageicon
        label.setForeground(new Color(0x00FF00)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // set font of text
        label.setIconTextGap(-65); // set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label 

        // label.setBounds(100, 100, 350, 350); // set x, y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // By default, it uses Border Layout
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
