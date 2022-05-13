package ucenie.kniha;



public interface Minmax <T extends Comparable<T>>{
    T min();
    T max();
}
class MyClass<T extends Comparable<T>>implements Minmax<T>{
    T[]vals;
  MyClass(T[]o ){
      vals=o;
  }

   public T min(){
      T v =vals[0];
      for(int i =1;i< vals.length;i++){
          if(vals[i].compareTo(v)<0){
              v=vals[i];
          }
      }
      return v;
   }
   public T max(){
      T v =vals[0];
      for(int i =1;i< vals.length;i++){
          if(vals[i].compareTo(v)>0){
              v=vals[i];
          }
      }
      return v;
   }
}
class GenIfDemo{
    public static void main(String[] args) {
        Integer inums[]={7,4,5,1,7,6,8};
        Character chs[]= {'j', 'e', 'i', 'p'};
        MyClass<Integer>iob=new MyClass<>(inums);
        MyClass<Character>cob=new MyClass<>(chs);
        System.out.println("Maximalna hodnota pola inums je "+iob.max());
        System.out.println("Minimalna hodnota pola inums je "+iob.min());
        System.out.println("Maximalna hodnota pola chs je "+cob.max());
        System.out.println("Minimalna hodnota pola chs je "+cob.min());
    }
}
