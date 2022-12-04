import java.util.Scanner;

public class ExampleChapterThree {

    static int seqSearchSen(int [] a, int n, int key){
        int i = 0;
        a[n] = key;

        while(true){
            if(a[i] == key){
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

    static int binaryWhileSearch(int [] arr, int n , int key){
        int startIdx = 0;
        int lastIdx= n-1;

        do{
            int centerIdx = (startIdx + lastIdx)/2;
            if(arr[centerIdx] == key){
                return centerIdx;
            }else if(arr[centerIdx] < key){
                startIdx = centerIdx +1;
            }else {
                lastIdx = centerIdx - 1;
            }
        }while (startIdx <= lastIdx);
        return -1;
    }

    static int seqSearchSenFor(int [] arr , int n ,int key){
        arr[n] = key;
        int i;
        for( i = 0; i<arr.length;i++){

            System.out.println( "   | "+ "  ".repeat(i)+"*");
            System.out.print(   i + "  | ");
            for(int j = 0; j<arr.length;j++){
                System.out.print(arr[j]+ " ");
            }
            if(arr[i] == key){
                break;
            }
            System.out.println();

        }

        return i == n ? -1 : i;
    }
    
      static int searchIdx(int [] arr, int n, int key){
        int count = 0;
        int[] temp = new int[n];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==key){
                temp[count++]=i;
            }
        }
        for(int a : temp){
            if(a==0){
                continue;
            }
            System.out.print(a+" ");
        }
        return temp.length;
    }

    static int binarySearchGraph(int [] arr, int key){
        int startIdx = 0;
        int lastIdx = arr.length - 1;

        while (startIdx<=lastIdx){
            int centerIdx = (startIdx + lastIdx)/2;

            if(arr[centerIdx] == key){
                System.out.println(key + "는 arr["+centerIdx+"] 에 있습니다.");
                return centerIdx;
            } else if (arr[centerIdx]>key) {

                System.out.println("  "+"  ".repeat(startIdx)+"<-"+"  ".repeat(centerIdx-startIdx)+"+"+"  ".repeat(lastIdx-centerIdx)+"->");
                System.out.print(centerIdx + "|");
                lastIdx = centerIdx - 1;

            }else{

                System.out.println("  "+"  ".repeat(startIdx)+"<-"+"  ".repeat(centerIdx-startIdx)+"+"+"  ".repeat(lastIdx-centerIdx)+"->");
                System.out.print(centerIdx + "|");
                startIdx = centerIdx +1;
            }

            for(int a : arr){
                System.out.print(" " + a + "  ");
            }
            System.out.println();
        }
        
        return -1;

    }



    public static void main(String[] args) {
//        Scanner stdn = new Scanner(System.in);
//
//        System.out.println("요소수");
//
//        int num = stdn.nextInt();
//        int [] x = new int[num-1];
//
//        for(int i = 0; i<num; i++){
//            System.out.println("x[" + i +"] : ");
//            x[i] = stdn.nextInt();
//        }
//
//        System.out.println("검색할값");
//
//        int key = stdn.nextInt();
//
//        int idx = seqSearchSen(x, num, key);
//
//        if(idx == -1){
//            System.out.println("찾을 수 없음");
//        }else{
//            System.out.println("값은 " + idx + "번 째에 있다.");
//        }

//        int[] arr = {1,2,4,4,5,3,0};
//        System.out.println(seqSearchSen(arr, 7, 3));


        int[] arrA = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearchGraph(arrA, 3));

    }

    
    

    public static void main(String[] args) {
//        Scanner stdn = new Scanner(System.in);
//
//        System.out.println("요소수");
//
//        int num = stdn.nextInt();
//        int [] x = new int[num-1];
//
//        for(int i = 0; i<num; i++){
//            System.out.println("x[" + i +"] : ");
//            x[i] = stdn.nextInt();
//        }
//
//        System.out.println("검색할값");
//
//        int key = stdn.nextInt();
//
//        int idx = seqSearchSen(x, num, key);
//
//        if(idx == -1){
//            System.out.println("찾을 수 없음");
//        }else{
//            System.out.println("값은 " + idx + "번 째에 있다.");
//        }

        int[] arr = {1,2,3,4,5,6, 0};
        seqSearchSenFor(arr, 6, 3);

    }

}
