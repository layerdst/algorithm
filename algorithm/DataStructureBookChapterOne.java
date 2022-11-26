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
    
    ublic void doubleFor(){
        System.out.println("  | 1 2 3 4 5 6 7 8 9");
        System.out.println("---+-------------------");
        for(int i = 1; i<10;i++){
            System.out.print(i + " |" );
            for(int j = 1 ;j<10 ; j++){
                System.out.print(" "+ i*j);
            }
            System.out.println();
        }
    }

    public void square(){

        Scanner std = new Scanner(System.in);
        System.out.print("변의 길이 : ");

        int x = 0;

        x = std.nextInt();

        for(int i =0;i<x;i++){
            System.out.println("*".repeat(x));
        }
    }

    public void rightTriangle(){
        int x = 0;
        Scanner std = new Scanner(System.in);
        System.out.print("변의 길이 : ");

        x=std.nextInt();

        for(int i =1;i<=x;i++){
            System.out.println("*".repeat(i));
        }
    }

    public void triangleLU(){

        Scanner std = new Scanner(System.in);
        System.out.print("변의 길이 : ");

        int x = 0;

        x=std.nextInt();
        for(int i =x;i>0;i--){
            System.out.println("*".repeat(i));
        }

    }

    public void triangleRU(){

        Scanner std = new Scanner(System.in);
        System.out.print("변의 길이 : ");

        int x = 0;
        x=std.nextInt();

        for(int i =x;i>0;i--){
            for(int j = 1;j<=x;j++){
                if(i+j>x){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public void triangleRB(){

        Scanner std = new Scanner(System.in);
        System.out.print("변의 길이 : ");

        int x = 0;
        x=std.nextInt();

        for(int i =x;i>0;i--){
            for(int j = 1;j<=x;j++){
                if(i<=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pyramid(int n){
        for(int i=1 ; i<=n; i++){
            for(int j=0;j<2*n+1;j++) {
                if((2*n+1)/2-i<j && (2*n+1)/2+i>j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pyramidNum(int n){
        for(int i=1 ; i<=n; i++){
            for(int j=0;j<2*n+1;j++) {
                if((2*n+1)/2-i<j && (2*n+1)/2+i>j){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

public void swap(int[] a, int b, int c){
        int t = a[b];
        a[b] = a[c];
        a[c] = t;
    }

    public int[] reversArray(int [] arr){
        int[] temp = arr;
        for(int i = 0;i< temp.length/2;i++){
            swap(temp,i, temp.length-1-i);
        }
        return temp;
    }

    public int [] reverseTest(int [] arr){
        int temp [] = arr;
        for(int i = 0; i<arr.length/2;i++){
            swap(temp, i, temp.length-1-i);
            System.out.println("a["+i+"]"+"과"+"a["+(temp.length-1-i)+"]을 교환합니다");
        }
        return temp;
    }

    public int sum(int [] arr){
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public int[] copy(int [] arr) {
        int[] temp = new int[arr.length];
        for(int i = 0 ;i<arr.length;i++){
            temp[i] = arr[i];
        }
        return temp;
    }

    public int[] reversCopy(int[] arr){
        int [] temp = new int[arr.length];
        for(int i = 0 ; i<arr.length;i++){
            temp[i] = arr[arr.length-i-1];
        }
        return temp;
    }


    public static void main(String[] args) {

        ExampleChapterOne exampleChapterOne = new ExampleChapterOne();
        int [] temp = {1,2,3,4,5};

//        int [] reverseTemp = exampleChapterOne.reversArray(temp);
//            int [] reversTemp = exampleChapterOne.reverseTest(temp);

        Arrays.stream(exampleChapterOne.reversCopy(temp)).forEach(System.out::print);
    }

}
