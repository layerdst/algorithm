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
	
	static class IntStack{
		int capacity;
		int ptr;
		int [] stack;
		
		public IntStack(int len) {
			this.capacity = len;
			ptr = 0;
			stack = new int[len];
		}
		
		public void push(int x) {
			stack[ptr++] = x;
		}
		
		public int pop() {
			if(--ptr<0) {
				return 0;
			}
			return stack[ptr];
		}
		
		public boolean isEmpty() {
			return ptr<=0 ? false : true;
		}
		
	}
	
	static class Recur{
		static void recur(int n) {
			IntStack s = new IntStack(n);
			
			while(true) {
				if(n>0) {
					s.push(n);
					n = n-1;
					continue;
				}
				
				if(s.isEmpty()!= true) {
					n = s.pop();
					System.out.println(n);
					n = n-2;
					continue;
				}
				break;
			
			}
		}
		
	}
	
	static class RecurMemo{
		static String[] memo;
		
		static void recur(int n) {
			if(memo[n+1] != null) {
				System.out.println(memo[n+1]);
			}else {
				if(n>0) {
					recur(n-1);
					System.out.println(n);
					recur(n-2);
					memo[n+1] = memo[n] + "\n" + memo[n-1];
				}else {
					memo[n+1] = "";
				}
			}
		}
	}
	
	static class Hanoi{
		static void move(int no, int x, int y) {
			if(no > 1) {
				move(no - 1, x,6 -x -y);
			}
			
			System.out.printf("원반 [%d] 를 %d번 기둥에서 %d 번 기둥으로 옮김 \n", no, x, y);
			
			if(no > 1) {
				move(no - 1, 6-x-y, y);
			}
			
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
	
	
	static class Recur3 {

	//--- 메서드 recur의 비재귀적 구현 ---//
		static void recur3(int n) {
			int[] nstk = new int[100];
			int[] sstk = new int[100];
			int ptr = -1;
			int sw = 0;

			while (true) {
				if (n > 0) {
					ptr++;
					nstk[ptr] = n;
					sstk[ptr] = sw;

					if (sw == 0)
						n = n - 1;
					else if (sw == 1) {
						n = n - 2;
						sw = 0;
					}
					continue;
				}
				do {
					n  = nstk[ptr];
					sw = sstk[ptr--] + 1;

					if (sw == 2) {
						System.out.println(n);
						if (ptr < 0)
							return;
					}
				} while (sw == 2);
			}
		}


	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 ");
//		
//		int x = stdIn.nextInt();
//		
//		System.out.println(x + "팩토리얼은 " +Factorial.notRecursiveFactorial(x) + "입니다 ");
		
		
//		System.out.println("두 정수 입력");
//		int x = stdIn.nextInt();
//		int y = stdIn.nextInt();
//		
//		System.out.println(Euclid.notRecursive(x,y));
//		
//		
		System.out.println("하노이의 탑");
		System.out.print("원반의 개수 : ");
		int n = stdIn.nextInt();
		
		Hanoi.move(n, 1, 3);
		
		
	}
	
	
}
