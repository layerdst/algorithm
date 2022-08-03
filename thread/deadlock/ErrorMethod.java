package thread.deadlock;

public interface ErrorMethod{
    default  void endlessMethod() throws InterruptedException {
        while(true){
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
        }
    };

    default int sumMethod() throws InterruptedException{
        int sum = 0;
        for(int i = 0 ; i <= 10 ; i ++){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
