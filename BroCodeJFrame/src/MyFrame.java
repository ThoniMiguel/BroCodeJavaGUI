import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevents frame from being resized
        this.setSize(420, 420);    // sets the x-dimension, and y-dimension of frame
        this.setLocationRelativeTo(null); //center new windows

        this.setVisible(true); //make frame visible

        /*
        ImageIcon img = new ImageIcon("logo-13.svg"); //create an ImageIcon but this didnt work on linux
        frame.setIconImage(img.getImage()); //change icon of frame
         */
        this.getContentPane().setBackground(new Color(123,50,250));
    }
}
