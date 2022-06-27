package algorithm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Star {
    static void pick(int a, int b){
        for(int i = 1; i<=a;i++){

            if(i%b==0){
                System.out.print("*");
                System.out.println();
            }else {
                System.out.print("*");
            }
        }
    }


    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("별개수");
        int a = st.nextInt();

        System.out.println("나누기");
        int b = st.nextInt();

        pick(a, b);
    }
}
