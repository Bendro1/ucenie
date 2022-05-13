package ucenie.kniha;

public class Krabica {
    double sirka,vyska,hlbka;
    Krabica(double s,double v ,double h){
        sirka=s;
        vyska=v;
        hlbka=h;
    }
    public String tostring(){
        return "Rozmery su "+sirka+" krat "+vyska+ " krat "+hlbka;
    }

    public static void main(String[] args) {
        Krabica k1=new Krabica(10,12,14);
        String b= "Krabica 2 "+k1.tostring();

        System.out.println(k1.tostring());
        System.out.println(b);
    }
}
