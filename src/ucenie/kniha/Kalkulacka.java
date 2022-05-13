package ucenie.kniha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kalkulacka {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Zadajte prve cislo: ");
        float cislo1=Float.parseFloat(br.readLine());
        System.out.println("Zadaj druhe cislo: ");
        float cislo2= Float.parseFloat(br.readLine());
        System.out.println("Zadaj operand + - * /");
        String operand=br.readLine();
        switch (operand){
            case "+":{
                System.out.println(cislo1+" + "+cislo2+" = "+(cislo1+cislo2));
                break;
            }
            case "-":{
                System.out.println(cislo1+" - "+cislo2+" = "+(cislo1-cislo2));
                break;
            }
            case "*":{
                System.out.println(cislo1+" * "+cislo2+" = "+(cislo1*cislo2));
                break;
            }
            case "/":{
                System.out.println(cislo1+" / "+cislo2+" = "+(cislo1/cislo2));
                break;
            }
        }
    }


}
