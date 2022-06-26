import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void print(String str){
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍", "신", "김");

        list.stream().forEach(s->StreamEx.print(s));
        list.stream().forEach(StreamEx::print);

        list.parallelStream().forEach(s -> StreamEx.print(s));
        list.parallelStream().forEach(StreamEx::print);
    }
}
