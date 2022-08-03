package thread;


public class Auto extends Thread{
    public void save(){
        System.out.println("Auto.save");
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }

    }
}
