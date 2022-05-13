package ucenie.kniha;

public class Y {
    int a;
    float b;
}
class X extends Y{
    double c;

}
class RTII{
    public static void main(String[] args) {
        Y y =new Y();
        X x =new X();
        Class<?>clobj;
        clobj=y.getClass();
        System.out.println("y je objektom typu: "+clobj.getName());
        clobj=x.getClass();
        System.out.println("x je objektom typu: "+clobj.getName());
        clobj=clobj.getSuperclass();
        System.out.println("nadtriedou y je "+clobj.getName());

    }
}
