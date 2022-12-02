import java.util.*;
import java.util.stream.IntStream;

public class AppleBox {

    public int solution(int k, int m, int[] score) {
        int[] ints = Arrays.stream(score).sorted().toArray();
        int chk=1;
        int count = 0;
        int sum = 0;
        for(int i = ints.length-1; i>=0;i--){
            System.out.println(ints[i]);
            if(count == 0 ){
                chk = ints[i];
                System.out.println("count 0일때");
                System.out.println("ㅁㅁㅁ" + chk);
                count++;
                continue;
            }

            count++;
            if(chk>ints[i]){
                chk=ints[i];
            }

            if(count == m){
                count = 0;

                System.out.println("count 0 일때");
                System.out.println("chk : " + chk + " , i : " + i);

                if(chk > k){
                    sum += k*m;
                    System.out.println("k*m : " + k*m);
                }else{
                    sum += chk*m;
                    System.out.println("chk*m : " + chk*m);
                }
                chk = 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        AppleBox appleBox = new AppleBox();
        int[] score = {7, 7, 6, 5, 2};
        System.out.println(appleBox.solution(9, 2,score ));
    }

}


