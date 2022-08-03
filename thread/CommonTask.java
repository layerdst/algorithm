package thread;

public class CommonTask implements Runnable{
    boolean stop = false;
    boolean work = true;

    @Override
    public void run() {
        while(!stop){
            if(work){
                System.out.println(Thread.currentThread().getName() + " 작업내용");
            }else{
                Thread.yield();
            }
        }
    }
}
