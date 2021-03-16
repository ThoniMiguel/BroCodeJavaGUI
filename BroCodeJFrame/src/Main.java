import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevents frame from being resized
        frame.setSize(420, 420);    // sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); //make frame visible


        ImageIcon img = new ImageIcon("logo-13.svg"); //create an ImageIcon but this didnt work on linux
        frame.setIconImage(img.getImage()); //change icon of frame

        frame.getContentPane().setBackground(new Color(123,50,250));
        */
        new MyFrame();
    }
}
