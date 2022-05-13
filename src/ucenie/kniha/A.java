package ucenie.kniha;

public class A {
    int i , j;
}
class B{
    int i,j;
}
class C extends A{
    int k ;
}
class D extends A{
    int k;
}
class Instanceof {

    public static void main(String[] args) {


        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A) {
            System.out.println("a je instance typu A");
        }
        if (b instanceof B ){
            System.out.println("b je instance typu B");
        }
        if(c instanceof A){
            System.out.println("c moze pretypovat na typ A");
        }
        if (c instanceof C){
            System.out.println("c je instance typu C");
        }
        if(a instanceof C ){
            System.out.println("a mozeme pretypovat na typ c ");
        }
        A ob;
        ob=d;
        System.out.println("ob sa odkazuje na D");
        if(ob instanceof D){
            System.out.println("ob je instancia typu D");
        }
        ob=c;
        System.out.println("ob sa odkazuje na c");
        if(ob instanceof C){
            System.out.println("ob je instancia typu C");
        }
        if(a instanceof Object){
            System.out.println("a mozeme pretypovat na objekt");
        }
        if(b instanceof Object){
            System.out.println("b mozeme pretypovat na objekt");
        }
        if(c instanceof Object){
            System.out.println("c mozeme pretypovat na objekt");
        }
        if(d instanceof Object){
            System.out.println("d mozeme pretypovat na objekt");
        }
    }
}