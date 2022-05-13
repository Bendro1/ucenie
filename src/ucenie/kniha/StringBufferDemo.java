package ucenie.kniha;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferDemo {
    public static void main(String[] args) throws IOException {
    int num=19648;
        System.out.println(num+" V binarnej podobe "+Integer.toBinaryString(num));
        System.out.println(num+" V osmickovej podobe "+Integer.toOctalString(num));
        System.out.println(num+" V hexadecimalnej podobe "+Integer.toHexString(num));


    }
}
