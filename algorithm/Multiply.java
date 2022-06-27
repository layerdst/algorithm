package algorithm;

public class Multiply {
    static void multiply(){
        for(int i=1;i<=9;i++){
            System.out.println();
            for(int j=1;j<=9;j++){

                if(i==0 && j==0 ){
                    System.out.print(" |");
                }
                System.out.print( i*j + " ");

            }
        }
    }

    static void plus(){
        for(int i=1;i<=9;i++){
            System.out.println();
            for(int j=1;j<=9;j++){

                if(i==0 && j==0 ){
                    System.out.print(" |");
                }
                System.out.print( i+j + " ");

            }
        }
    }

    public static void main(String[] args) {
        multiply();
        plus();
    }
}
