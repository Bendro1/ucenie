package ucenie.kniha;

public class ClassDemo {
    public static void main(String[] args) {
      Runtime r=Runtime.getRuntime();
      long mem1,mem2;
      Integer someints[]=new Integer[1000];

        System.out.println("Celkova pamat je "+r.totalMemory());
        mem1=r.freeMemory();
        System.out.println("Volna pamat na zaciatku "+mem1);
        r.gc();
        mem1=r.freeMemory();
        System.out.println("Volna pamat po garbage collection "+mem1);
        for(int i =0;i<100;i++){
            someints[i]=new Integer(i);
        }
        mem2= r.freeMemory();
        System.out.println("Volna pamat po alokacii pamati mem2 "+mem2);
        System.out.println("Pamat pouzita pro alokaci "+(mem1-mem2));
        for(int i=0;i<1000;i++){
            someints[i]=null;
        }
        r.gc();
        mem2=r.freeMemory();
        System.out.println("Volna pamat po vymazani objektu Integer "+mem2);
    }
}
