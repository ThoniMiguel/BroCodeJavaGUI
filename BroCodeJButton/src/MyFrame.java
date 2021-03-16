import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{

    JButton button;
    JLabel label;
    public MyFrame(){

        button = new JButton();

        label = new JLabel();
        label.setText(":()");
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
        button.setBounds(150, 100, 150, 50);
//        button.addActionListener(this);  //used when implementing ActionListener

        button.addActionListener(e -> {
            System.out.println("Poo");

            if(label.isVisible()){
                label.setVisible(false);
            }else{
                label.setVisible(true);
            }
        }); //lambda expression
        button.setText("Click Me");
        button.setFocusable(false); //get rid of the text border when clicked... switch to true to test for yourself

        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.setForeground(Color.PINK);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder()); //bunch of different button borders
//        button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==button){
//            System.out.println("POO");
//        }
//    }
}
