package ucenie.kniha;

public class Stats <T extends Number>{
    T []nums;
    Stats(T[] o){
        nums=o;
    }
    double average(){
        double sum=0.0;
        for(int i=0;i< nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum/ nums.length;
    }
    boolean sameavg(Stats<?>ob){
        if(average()== ob.average()){
            return true;
        }
        return false;
    }

}
class WildcardDemo{
    public static void main(String[] args) {
        Integer inums[]={1,2,3,4,5};
        Stats<Integer>iob=new Stats<>(inums);
        double v= iob.average();
        System.out.println("Hodnota iob je "+v);
        Double dnums[]={1.1,2.2,3.3,4.4,5.5};
        Stats<Double>dob=new Stats<>(dnums);
        double w = dob.average();
        System.out.println("Hodnota dob je "+w );
        Float fnums[]={1.0f,2.0f,3.0f,4.0f,5.0f};
        Stats<Float>fob=new Stats<>(fnums);
        double x = fob.average();
        System.out.println("Hodnota fob je "+x);
        if(iob.sameavg(dob)){
            System.out.println("Iob a dob maju rovnaky priemer ");
        }
        if(dob.sameavg(fob)){
            System.out.println("Dob a fob maju rovnaky priemer ");
        }
        if(fob.sameavg(iob)){
            System.out.println("Fob a iob maju rovnaky priemer ");
        }
    }
}