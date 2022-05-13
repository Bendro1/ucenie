package ucenie.kniha;

import javax.swing.*;

public class SwingDemo {
    SwingDemo(){
        JFrame jfrm=new JFrame("Jednodchá aplikácia swing");
        jfrm.setSize(335,100);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jlab=new JLabel("Swing umoznuje vytvorenie vykonnych GUI");
        jfrm.add(jlab);
        jfrm.setVisible(true);

    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
