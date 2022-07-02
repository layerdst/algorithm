package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CardConv {
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dChar = "01236456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dChar.charAt(x % r);
            x /= r;
        }while(x!=0);

        for(int i = 0; i<digits/2 ;i++){
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int cd;
        int digits;
        char[] cno = new char[32];

        do {
            System.out.println("양의 정수 입력");
            num = sc.nextInt();
        } while (num < 0);

        do {
            System.out.println("원하는 진수");
            cd = sc.nextInt();
        } while (cd < 2 || cd > 36);

        digits = cardConv(num, cd, cno);
        for(int i = 0;i<digits;i++){
            System.out.print(cno[i]+ " ");
        }
    }
}
