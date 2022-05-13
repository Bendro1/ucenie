package ucenie.kniha;

public class GenMathDemo  {
    static <T ,V extends T> boolean isin(T x,V[]y){
        for(int i =0;i<y.length;i++){
            if(x.equals(y[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer inums[]={1,2,3,4,5};
        if(isin(2,inums)){
            System.out.println("Cislo 2 je v poli inums");
        }
        if(!isin(7,inums)){
            System.out.println("Cislo 7 nieje v poli inums");
        }
        String str[]={"jedna","dva","tri","styri","pat"};
        if(isin("dva",str)){
            System.out.println("Retazec dva je v poli str");
        }
        if(!isin("sedem",str)){
            System.out.println("Retazec sedem nieje v poli str");
        }
    }
}
