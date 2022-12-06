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
}
