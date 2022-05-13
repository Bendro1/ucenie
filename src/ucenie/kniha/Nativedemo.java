package ucenie.kniha;

public class Nativedemo {
    int i ;

    public static void main(String[] args) {
        Nativedemo ob =new Nativedemo();
        ob.i=10;
        System.out.println("Hodnota ob.1 na zaciatku "+ob.i);
    }
    native static int test();
    static {
        System.loadLibrary("Nativedemo");
    }
}

