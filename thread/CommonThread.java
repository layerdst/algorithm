package thread;

public class CommonThread{

    private Thread th;
    private CommonTask task;

    public CommonThread(String name, CommonTask task){
        this.task = task;
        th = new Thread(this.task);
        th.setName(name);
    }

    public void start(){
        th.start();
    }

    public void setWork(boolean t){
        task.work = t;
    }

    public void getWork(boolean t){
        task.work = t;
    }






}
