package ucenie.kniha;

public class NewThread extends Thread{
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb){
        super((Runnable) tgOb,threadname);
        System.out.println("Nove vlakno: "+this);
        suspendFlag=false;
        start();
    }
    public  void run(){
        try{
            for(int i =5;i>0;i--){
                System.out.println(getName()+" : "+i);
                Thread.sleep(1000);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }

            }
        }
        catch (InterruptedException e ){
            System.out.println("Vynimka "+getName()+" ukoncenie behu");
        }

    }
    synchronized void mysuspend(){
        suspendFlag=true;
    }
        synchronized void myresume(){
        suspendFlag=false;
        notify();
        }
}
class ThreadGroup{

    public static void main(String[] args) {
        ThreadGroup groupA=new ThreadGroup();
        ThreadGroup groupB=new ThreadGroup();
        NewThread ob1=new NewThread("Vlakno jedna ",groupA);
        NewThread ob2=new NewThread("Vlakno dva ",groupA);
        NewThread ob3=new NewThread("Vlakno tri ",groupB);
        NewThread ob4=new NewThread("Vlakno styri ",groupB);
    }
}
