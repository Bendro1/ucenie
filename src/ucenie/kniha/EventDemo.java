package ucenie.kniha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel jlab;
    EventDemo(){
        JFrame jfrm=new JFrame("Ukazka spracovani udalosti");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500,300);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton but1=new JButton("Tlacitko 1 ");
        JButton but2=new JButton("Tlacitko 2 ");
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Tlacitko 1 bolo stlacene ");
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("Tlacitko 2 bolo stlacene ");
            }
        });
        jfrm.add(but1);
        jfrm.add(but2);
        jlab=new JLabel("Stlac hocijake tlacitko");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}
