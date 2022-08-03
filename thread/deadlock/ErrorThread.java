package thread.deadlock;

public class ErrorThread extends Thread {

    private static ErrorThread threadInstance;

    private ErrorThread(Runnable target) {
        super(target);
    }

    public static ErrorThread createErrorThread(Runnable target, String name) {
        if(threadInstance == null){
            threadInstance = new ErrorThread(target);
        }

        ErrorThread th = threadInstance;
        th.setName(name);
        return th;
    }

    @Override
    public void start(){
        State state = this.getState();
        while(state==State.BLOCKED) {
            this.start();
        }
        System.out.println(this.getName());
        this.run();
    }
}
