package ucenie.kniha;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrReadline  {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=new String[100];
        System.out.println("Zadajte riadky textu");
        System.out.println("Program skoncite napisanim stop");
        for(int i =0;i<100;i++){
            str[i]= br.readLine();
            if(str[i].equals("stop")){
                break;
            }
        }
        for(int i =0;i<100;i++){
            if(str[i].equals("stop")){
                break;
            }
            System.out.println(str[i]);
        }
    }
}
