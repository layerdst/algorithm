package algorithm;

import java.util.Scanner;

/*
* 소수 구하기
* 2부터 입력한 값을 포함한 수까지 나눈다.
* */
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


/*
* Development 1 소수구하기
* 2부터 소수를 구한다.
* 단, 2 부터 소수는 홀수에 존재하므로 +=2 씩 값을 증가시킨다.
* 소수는 배열에 저장하고, 저장된 소수로 나눗셈을 진행한다.
*/

    static void newPrimeNumber(int n){
        int[] tempArr = new int[200];
        int idx = 0;
        tempArr[idx++] = 2;

        if(n%2==0){
            System.out.println("2");
        }

        for(int i =3 ;i<=n;i+=2){
            int j;
            for (j = 1; j < idx; j++) {
                if(i%tempArr[j]==0){
                    break;
                }
            }
            if(idx==j){
                tempArr[idx++] = i;
                System.out.println(i);
            }

        }
    }

    /*
     * Development 2 소수구하기
     * 모든 수는 제곱근을 기준으로 작은수와 큰수의 곱으로 이루어진다
     * 나누는 수의 제곱이 입력값을 넘지 않을때 까지 나눗셈을 반복한다.
     * 소수는 배열에 저장하고, 저장된 소수로 나눗셈을 진행한다.
     */

    static void squareRootPrimeNum(int n){
        int tempArr[] = new int[100];
        int idx = 0;

        tempArr[idx++] = 2;
        tempArr[idx++] = 3;

        for (int i = 5; i < n; i += 2) {
           boolean flag = false;
           for(int j =1; tempArr[j] * tempArr[j]<=i;j++){
               if(i%tempArr[j]==0){
                   flag = true;
                   break;
               }
               if(!flag){
                   tempArr[idx++] = i;
               }
           }
        }

    }

    static void squareRootPrimeNumber(int n){
        int[] tempArr = new int[500];
        int idx = 0;

        tempArr[idx++] =2;
        tempArr[idx++]= 3;

        for (int i = 5; i < n; i += 2) {
            boolean flag = false;
            for (int j = 1; tempArr[j] * tempArr[j] <= i; j++) {
                if (i % tempArr[j]==0) {
                    flag=true;
                    break;
                }
            }
            if(!flag){
                tempArr[idx++] = i;
                System.out.println(i);
            }
        }

    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1부터 해당 범위 까지 나열할 소수를 나열하시오");
//        int num;
//
//        do {
//            num = sc.nextInt();
//        } while (num < 2);

        squareRootPrimeNumber(100);


    }
}
