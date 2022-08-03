package thread;

public class Main {
    public static void main(String[] args) {

        CommonTask run1 = new CommonTask();
        CommonTask run2 = new CommonTask();



        CommonThread th1 = new CommonThread("1t", run1);
        CommonThread th2 = new CommonThread("2t", run2);

        th1.setWork(false);

        th1.start();
        th2.start();

    }
}
