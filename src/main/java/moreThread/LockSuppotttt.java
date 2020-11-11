package moreThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class LockSuppotttt {
    public static void main(String[] args) throws Exception{
        Thread t1=new Thread("t1"){
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                if(i>5){
                    LockSupport.park(this);
                }
                    System.out.println(i);
                }
            }
        };
        t1.start();
        TimeUnit.SECONDS.sleep(5);
        LockSupport.unpark(t1);
        TimeUnit.SECONDS.sleep(5);
        LockSupport.unpark(t1);
    }
}
