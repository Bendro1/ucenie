package ucenie.kniha;

public class Assertdemo {
   static int val=5;

    static int getnum(){
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for(int i =0; i<10;i++){
            n=getnum();
            assert n>0:"Hodnota n je nula";
            System.out.println("Hodnota n je "+n);
        }
    }
}
