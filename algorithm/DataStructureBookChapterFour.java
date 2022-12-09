import java.util.Scanner;

public class ExampleChapterFour {

    static class IntStack{
        private int[] stk;
        private int capacity;
        private int ptr;

        public class EmptyIntStackException extends RuntimeException{
            public EmptyIntStackException(){}
        }

        public class OverflowStackException extends RuntimeException{
            public OverflowStackException(){}
        }

        public IntStack(int maxlen){
            ptr = 0;
            capacity = maxlen;
            try{
                stk = new int[capacity];
            }catch (OutOfMemoryError e){
                capacity =0;
            }
        }

        public int push(int input){
            if(ptr>=capacity){
                throw new OverflowStackException();
            }
            return stk[ptr++] = input;
        }

        public int pop(){
            if(ptr<=0){
                throw new EmptyIntStackException();
            }
            return stk[--ptr];
        }

        public int peek(){
            if(ptr<=0){
                throw new EmptyIntStackException();
            }
            return stk[ptr-1];
        }

        public boolean isFull(){
            return capacity <= ptr;
        }

        public void clear(){
            ptr = 0;
        }

        public int indexOf(int x){
            for(int i = ptr -1; i>=0;i--){
                if(stk[i] == x ){
                    return i;
                }
            }
            return -1;
        }

        public int getCapacity(){
            return capacity;
        }

        public int size(){
            return ptr;
        }

        public boolean isEmpty(){
            return ptr<=0;
        }


        public void dump(){
            if(ptr <= 0){
                System.out.println("스택이 비엇음");
            }else{
                for (int i = 0; i <ptr ; i++) {
                    System.out.print(stk[i]+", ");
                }
                System.out.println();
            }
        }
    }

    static class Stack<E> {
        private E[] stk;
        private int capacity;
        private int ptr;

        public Stack(int maxlen) {
            this.ptr = 0;
            this.capacity = maxlen;

            try {
                this.stk = (E[]) new Object[capacity];
            } catch (OutOfMemoryError e) {
                capacity = 0;
            }


        }

        public E push(E e) {
            return stk[ptr++] = e;
        }

        public E pop() {
            return stk[--ptr];
        }

        public void dump() {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ,");
            }
        }
    }

    static class Que<E> {
        private int startIdx;
        private int lastIdx;
        private int capacity;
        private int ptr;
        private E[] que;

      
        public Que(int capacity) {
            this.startIdx = 0;
            this.lastIdx = 0;
            this.ptr = 0;
            this.capacity = capacity;
            try {
                this.que = (E[]) new Object[capacity];
            } catch (OutOfMemoryError e) {
                System.out.println("메모리 에러");
            }
        }

        public E enqueue(E e) {
            lastIdx++;
            return que[ptr++] = e;
        }

        public E deque() {
            if (startIdx >= lastIdx) {
            }
            return que[startIdx++];
        }

        public void dump() {
            for (int i = startIdx; i < lastIdx; i++) {
                System.out.print(que[i] + ",");
            }
        }
    }
    
    static class IntQueue{
    	
    	private int[] que;
    	private int capacity;
    	private int front;
    	private int rear;
    	private int num;
    	
    	
    	public IntQueue(int maxlen) {
    		num = front = rear = 0;
    		capacity=maxlen;
    		que= new int[capacity];
    	}
    	
    	public int enque(int x) {
    		if(num>=capacity) {
    			System.out.println("오버플로우");
    		}
    		que[rear++] = x;
    		num++;
    		if(rear== capacity){
    			rear = 0;
    		}
    		return x;
    	}
    	
    	public int deque() {
    		if(num<=0) {
    			System.out.println("비었음");
    		}
    		int x = que[front++];
    		num --;
    		if(front == capacity) {
    			front = 0;
    		}
    		return x;
    	}
    	
    	public void dump() {
    		if(num<=0) {
    			System.out.println("비었음 ");
    		}
    		
    		for(int i = 0 ; i<num; i++) {
    			System.out.println(que[(i+front)/capacity] + ", ");
    		}
    		
    	}
    	
    	
  
		// TODO Auto-generated constructor stub
	}


    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        IntStack s = new IntStack(64);
//
//        while(true){
//            System.out.println();
//            System.out.printf("현재데이터개수 : %d / %d\n", s.size(), s.getCapacity());
//            System.out.println("1 푸시, 2 팝, 3 피크, 4 덤프, 0 종료");
//
//            int menu = stdIn.nextInt();
//            if(menu == 0) break;
//
//            int x;
//            switch (menu){
//                case 1 :
//                    System.out.print("데이터 푸시값 : ");
//                    x = stdIn.nextInt();
//                    try{
//                        s.push(x);
//                    }catch (IntStack.OverflowStackException e){
//                        System.out.println("스택이 가득참");
//                    }
//                    break;
//
//                case 2 :
//
//                    try{
//                        x=s.pop();
//                        System.out.println("팝한 데이터는 " + x +"입니다");
//
//                    }catch (IntStack.EmptyIntStackException e){
//                        System.out.println("스택이 비어있습니다.");
//                    }
//                    break;
//
//
//                case 3 :
//                    try{
//                        x = s.peek();
//                        System.out.println("피크한 데이터는 " + x +"입니다");
//                    }catch (IntStack.EmptyIntStackException e){
//                        System.out.println("스택이 비어있습니다");
//                    }
//                    break;
//
//                case 4 :
//                    try {
//                        s.dump();
//                        break;
//                    }catch (IntStack.EmptyIntStackException e){
//                        System.out.println("없음");
//                    }
//            }
//
//        }

//        Stack<String> stk = new Stack<>( 64);
//        stk.push("aa");
//        stk.push("bb");
//        stk.push("cc");
//        stk.push("dd");
//
//        stk.pop();
//
//        stk.dump();

        Que<String> stringQue = new Que<>(64);
        stringQue.enqueue("a");
        stringQue.enqueue("b");
        stringQue.enqueue("c");
        stringQue.enqueue("d");
        stringQue.enqueue("e");
        stringQue.enqueue("f");


        stringQue.dump();

        stringQue.deque();
        stringQue.deque();
        stringQue.deque();
        stringQue.deque();

        System.out.println();

        stringQue.dump();


    }
}
