package thread;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Set;

public class AutoMain {
    public static void main(String[] args) {
        Auto at = new Auto();
        at.setName("autoSaveThread");
        at.setDaemon(true);
        at.start();

        Map<Thread, StackTraceElement[]> getInfo = Thread.getAllStackTraces();
        Set<Thread> getKey = getInfo.keySet();

        getKey.stream().forEach(a ->{
            System.out.print("[" + a.getThreadGroup().getName() + "]");
            System.out.print(a.getName() + " : ");
            System.out.println(a.isDaemon() ? "데몬" : "");
        });

    }
}
