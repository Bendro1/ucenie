package ucenie.kniha;

public class Gen <T>{
    T ob;
    Gen(T o){
        ob=o;
    }
    T getOb(){
        return ob;
    }
}
class Gen2 extends Gen<String>{
    Gen2(String o){
       super(o);
    }
    String getob(){
        System.out.print("Volali ste metodu getob() ,specificku pre string: ");
        return ob;
    }
}
class BridgeDemo{
    public static void main(String[] args) {
        Gen<Integer>iob=new Gen<>(74);
        Gen2 str=new Gen2("Test prace s generickou triedou");
        System.out.println(iob.getOb());
        System.out.println(str.getob());

    }
}
