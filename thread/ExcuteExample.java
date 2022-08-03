package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteExample{
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(2);

        for(int i = 0; i<10 ; i++){
            Runnable runnable = new Runnable(){
                @Override
                public void run(){
                    ThreadPoolExecutor threadPolExecutor = (ThreadPoolExecutor) service;
                    int poolSize = threadPolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("총스레드 개수 : " + poolSize + " / " + "작업스레드 이름" + threadName);
                    int value = Integer.parseInt("삼");
                }
            };
//            service.execute(runnable);
            service.submit(runnable);

            Thread.sleep(10);
        }
        service.shutdown();
    }
}