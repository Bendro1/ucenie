package ucenie.kniha;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualsDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Program ukoncite napisanim stop");
        System.out.println("Napiste stat");
        do{

            str=br.readLine();
            str=str.trim();
            if(str.equals("slovensko")){
                System.out.println("Bratislava");
            }
            else if(str.equals("rusko")){
                System.out.println("Moskva");
            }
            else if(str.equals("cina")){
                System.out.println("Peking");
            }

        }while(!str.equals("stop"));

    }
    }

