package thread.deadlock;

public class ErrorMain {
    public static void main(String[] args) {

        ErrorRunnable run = new ErrorRunnable();

        ErrorThread th = ErrorThread.createErrorThread(run, "쓰레드1");
        ErrorThread th1 = ErrorThread.createErrorThread(run, "쓰레드2");

        System.out.println(th.getName());
        th.start();


        th1.start();



        // 데드락

    }
}
