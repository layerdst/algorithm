import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Weapon {
    public int solution(int number, int limit, int power) {

        List<Integer> temp = new ArrayList<>();
        int sum = 0;

        for ( int i = 1 ; i<=number; i++){
            int count = 0;
            int j;
            for(j = 1; j*j<=i; j++){
                if(i%j==0){
                    if(i/j == j ){
                        count++;
                        continue;
                    }
                    count+=2;
                }
            }

            temp.add(count);
        }

        for (int t : temp){
            if(t>limit){
                sum+=power;
                continue;
            }
            sum+=t;
        }

        return sum;
    }

    public static void main(String[] args) {


        Weapon weapon = new Weapon();
        System.out.println(weapon.solution(10, 3, 2));

    }
}
