package algorithm;

import java.util.Arrays;

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
        System.out.println(gaussSum(2,10));
    }
}
