package algorithm;

import java.util.Scanner;

public class PrimeNum {
    int count;
    static void primeNumPrint(int n){
        for(int i = 2; i<n ;i++){
            int j;
            for ( j = 2; j < n; j++) {
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.println(i);
            }
        }
    }

    static void newPrimeNumber(int n){
        int[] tempArr = new int[200];
        int idx = 0;
        tempArr[idx++] = 2;

        if(n==2){
            System.out.println("2");
            return;
        }

        for(int i =3 ;i<=n;i+=2){
            int j;
            for (j = 1; j < idx; j++) {
                if(i%tempArr[idx]==0){
                    break;
                }
            }
            if(idx==j){
                tempArr[idx++] = i;
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 해당 범위 까지 나열할 소수를 나열하시오");
        int num;

        do {
            num = sc.nextInt();
        } while (num < 2);

        newPrimeNumber(num);


    }
}
