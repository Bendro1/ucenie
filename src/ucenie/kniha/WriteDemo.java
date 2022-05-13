package ucenie.kniha;

import java.io.PrintWriter;

public class WriteDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 15;
        String str = "Toto je retezec";
        String str1;
        double d = 7.15e-4;
        pw.println(i);
        pw.println(str);
        pw.println(str1="Test");
        pw.println(d);
            }

}
