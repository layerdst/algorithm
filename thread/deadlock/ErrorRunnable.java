package thread.deadlock;

public class ErrorRunnable implements Runnable, ErrorMethod{

    @Override
    public void run() {
        synchronized (this) {
            try {


                sumMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
