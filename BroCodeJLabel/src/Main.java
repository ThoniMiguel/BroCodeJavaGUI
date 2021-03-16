import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("dude.png");
        imageIcon = getImageIcon(imageIcon);
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of a label
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER,RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER,BOTTOM of imageicon
        label.setForeground(new Color(250, 50, 150)); //set font color of text
        label.setFont(new Font("TimesRoman", Font.PLAIN, 50)); //set font of text
        label.setIconTextGap(25); //set gap of text to image
        label.setBackground(Color.BLACK); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set Horizontal position of icon+text within label
//        label.setBounds(100, 0, 350, 350); //set x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }

    private static ImageIcon getImageIcon(ImageIcon imageIcon) {
        Image  image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(255, 255, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImg);
        return imageIcon;
    }
}
