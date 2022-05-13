package ucenie.kniha;

import java.util.Scanner;
import java.util.Random;

public class HangMan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String slova[]={"facebook","monitor","obrazovka","internet","pocitac","vyznanie","tvar"};
        boolean hrame=true;
        while(hrame){
            System.out.println("Podme si zahrat obesenca");
            int randomCislo=rand.nextInt(slova.length);
            char randomSlovo[]=slova[randomCislo].toCharArray();
            int ammountGueses=randomSlovo.length;
            char playerGuess[]=new char[ammountGueses];

            for(int i =0;i< playerGuess.length;i++){
                playerGuess[i]='_';
            }
            boolean hadaneSlovo=false;
            int pokusy =0;
            while(!hadaneSlovo && pokusy!=ammountGueses){
                System.out.println("Práve hadané : ");
                System.out.print(playerGuess);
                System.out.println("Máš "+ammountGueses+" pokusov ostávajú ti  "+pokusy);
                System.out.println("Napíš znak");
                char input=sc.nextLine().charAt(0);

                if(input=='-'){
                     hadaneSlovo=true;
                     hrame =false;

                } else{
                    for(int i =0;i<randomSlovo.length;i++){
                        if(randomSlovo[i]==input){
                            playerGuess[i]=input;
                        }
                    }
                    if(isGuessedWord(playerGuess)){
                        hadaneSlovo=true;
                        System.out.println("Gratulujem");

                    }

                }


            }
            if (!hadaneSlovo) {
                System.out.println("Nesprávne");

            }


            System.out.println("Chceš hrať znovu ? ano/nie");
            String choice=sc.nextLine();
            if(choice.equals("nie")){
                hrame=false;
            }
            else{
                hrame=true;
            }
        }
        System.out.println("Koniec hry");
    }


    public static void print(char array[]){
    for(int i =0;i< array.length;i++){
        System.out.println(array[i]+" ");

    }
        System.out.println();
    }
    public static boolean isGuessedWord(char [] array){
        boolean condition=true;
        for(int i =0;i< array.length;i++){
            if(array[i]=='_'){

                condition=false;
            }
        }
        return condition;
    }

}
