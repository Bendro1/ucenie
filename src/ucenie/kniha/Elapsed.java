package ucenie.kniha;

public class Elapsed {
    static byte a[]={65,66,67,68,69,70,71,72,73,74};
    static byte b[]={77,77,77,77,77,77,77,77,77,77};
    public static void main(String[] args) {
        System.out.println("Prvky pola a "+new String(a));
        System.out.println("Prvky pola b "+new String(b));
        System.arraycopy(a,0,b,0,a.length);
        System.out.println("Prvky pola a "+new String(a));
        System.out.println("Prvky pola b "+new String(b));
        System.arraycopy(a,0,a,1,a.length -1);
        System.out.println("Prvky pola a "+new String(a));
        System.arraycopy(b,1,b,0,b.length -1);
        System.out.println("Prvky pola b "+new String(b));

    }
}
