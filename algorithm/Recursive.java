import java.util.*;

class Recursive{
  
  static void recur(int n){
    if(n>0){
      recur(n-1);
      System.out.println(n);
      recur(n-2);
    }
  }
  
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.println("정수입력");
    int x = stdIn.nextInt();
    recur(x);
  }
}

숫자 4 입력시
recur(4) 실행

1--phase
recur(3)
4
recur(2)
  
2--phase
recur(2)
3
recur(1)
4
recur(1)
2
recur(0) -> del

  
3--phase
recur(1)
2
recur(0) -> del
3
recur(0) -> del
1
recur(-1) -> del
4
recur(1)-> del
1
2  

4--phase
recur(0) -> del
1
recur(-1) -> del
2
3
1
4
1
2
  

