package thread;

import java.util.concurrent.*;
import java.util.function.Function;

public class CompletionServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

        System.out.println("작업처리요청");

        for(int i = 0; i< 3 ; i++){
            completionService.submit(new Callable<Integer>(){
                @Override
                public Integer call() throws Exception {
                    int sum = 0;
                    for(int i = 0;i<=100;i++){
                        sum+=i;
                    }
                    return sum;
                }
            });
        }


        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {

                        Future<Integer> future = completionService.take();
                        int value = future.get();
                        System.out.println("처리결과" + value);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){}
        executorService.shutdownNow();
    }
}
