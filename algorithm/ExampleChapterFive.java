import java.util.Scanner;

class ExampleChapterFive{
	
	static class Factorial{
		static int factorial(int n) {
//			if(n>0) {
//				return n * factorial(n-1);
//			}else {
//				return 1;
//			}			
			return n > 0 ? n*factorial(n-1) : 1;
			
		}
		
		static int notRecursiveFactorial(int n) {
			
			int temp = 1;
			
			for(int i = n ; i>1 ; i--) {
				temp = temp*i;
			}
			
			return temp;
		}
	}
	
	static class Euclid{
		static int gcd(int x, int y) {
			return y==0 ? x : gcd(y, x%y);
		}
		
		static int notRecursive(int x, int y) {
			
			int tempX = x;
			int tempY = y;
			
			while(tempY!=0) {
				tempX=tempY;
				System.out.println("x : " + tempX);
				tempY=tempX%tempY; // 오류!!
				System.out.println("y : " + tempY);
				
				System.out.println();
				
			}
			
			return tempX;
		}
		
		static int gcdA(int x, int y){
			while(y!=0) {
				int temp = y;
				y=x%y;
				x=temp;
			}
			return x;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 ");
//		
//		int x = stdIn.nextInt();
//		
//		System.out.println(x + "팩토리얼은 " +Factorial.notRecursiveFactorial(x) + "입니다 ");
		
		
		System.out.println("두 정수 입력");
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		System.out.println(Euclid.notRecursive(x,y));
		
		
		
	}
	
}
