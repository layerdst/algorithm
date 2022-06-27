package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class GaussSum {
    //가우스 덧셈
    static int gaussSum(int a, int b){
        int tempA;
        int tempB;
        if(a>b){
            tempA =b;
            tempB =a;
        }else if (a==b){
            return a;
        }else{
            tempA=a;
            tempB=b;
        }
        return (tempA + tempB) * (tempB - tempA + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        System.out.println("a부터 b까지 합");
        System.out.println("a");
        int a = stdin.nextInt();
        System.out.println("b");
        int b = stdin.nextInt();


        System.out.println("합은 " + gaussSum(a, b));

    }
}
