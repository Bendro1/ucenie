package ucenie.kniha;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {

    public static  void main(String[] args) {
        JFrame frame=new JFrame("JFrame Example");
        JLabel label=new JLabel("Toto je text ");
        JPanel panel=new JPanel();
        JButton button =new JButton("Button");


        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(500,500);


        frame.setVisible(true);
    }


}
