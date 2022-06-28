package algorithm;

public class Triangle {
    static void triangleLB(int a){
        for(int i=0;i<a;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        }
    }

    static void triangleLU(int a){
        for(int i = a; i>0;i-- ){
            System.out.println();
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
        }
    }

    static void triangleRU(int a ){
        for(int i = 0; i<a;i++ ){
            System.out.println();
            for(int j=0;j<a;j++){
                if(i>j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
        }
    }

    static void triangleRB(int a ){
        for(int i = 0; i<a;i++ ){
            System.out.println();
            for(int j=0;j<a;j++){
                if(a-i-1>j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
        }
    }

    static void pyramid(int a){
        for(int i = 0 ; i<a;i++){
            System.out.println();
            for(int j=1;j<=2*a-1;j++){
                System.out.print(" ");
                if(j>=a-i && j<=a+i){
                    System.out.print("*");
                }
            }
        }
    }

    public static void main(String[] args) {
        triangleLB(5);
        triangleLU(5);
        triangleRU(5);
        triangleRB(5);
        pyramid(5);
    }
}
