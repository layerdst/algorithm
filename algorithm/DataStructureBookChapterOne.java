import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleChapterOne {
    int b;
    int a;
    public void minusTwoFactor(){
        Scanner std = new Scanner(System.in);


        try{
            do {
                System.out.println("a 값입력");
                a=std.nextInt();
                System.out.println("b 값입력");
                b=std.nextInt();
            }while (a>b);

            System.out.println("b-a");
            System.out.println(b-a);
        }catch (InputMismatchException e){
            System.out.println("숫자만 입력가능");
        }

    }

    public void positiveNumDigit(){
        Scanner std = new Scanner(System.in);
        System.out.println("숫자입력");
        int temp = std.nextInt();
        int digit = 0;

        System.out.println("자리수");

        while (temp>0){
            temp = temp/10;
            System.out.println(temp);
            ++digit;
        }

        System.out.println(digit);
    }


    public void printStart(){
        Scanner std = new Scanner(System.in);
        System.out.println("count");

        int n = std.nextInt();

        System.out.println("split");
        int w = std.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("*");
            if(i % w== w-1){
                System.out.println();
            }
        }
    }

    public void printStarUpgrade(){
        Scanner std = new Scanner(System.in);
        System.out.println("count");

        int n = std.nextInt();

        System.out.println("split");
        int w = std.nextInt();

        for(int i =0;i<n/w;i++){
            System.out.println("*".repeat(w));
        }

    }

    public static void main(String[] args) {

        ExampleChapterOne exampleChapterOne = new ExampleChapterOne();
        exampleChapterOne.printStart();

    }

}
