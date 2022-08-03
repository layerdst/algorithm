package thread;

public class WorkThreadMain {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("myGroup");
        WorkThread a = new WorkThread(group, "a");
        WorkThread b = new WorkThread(group, "b");

        a.start();
        b.start();

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        threadGroup.list();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            group.interrupt();
        }

    }
}
