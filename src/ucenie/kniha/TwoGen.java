package ucenie.kniha;

public class TwoGen <T,V>{
    T ob1;
    V ob2;
    TwoGen(T o1,V o2){
        ob1=o1;
        ob2=o2;
    }
    void showType(){
        System.out.println("Hodnota T je "+ob1.getClass().getName());
        System.out.println("Hodnota V je "+ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
class SimGen{
    public static void main(String[] args) {
        TwoGen<Integer ,String>tgObj=new TwoGen<>(88,"Test pre pracu s generickou triedou ");
        tgObj.showType();
        int iob= tgObj.getOb1();
        System.out.println("Hodnota ob1 je "+iob);
        String strob= tgObj.getOb2();
        System.out.println("Hodnota ob2 je "+strob);
    }
}
