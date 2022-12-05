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



    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return(d1.height>d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }

        public static class VisionOrderComparator implements Comparator<PhyscData>{

            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.vision>o2.vision) ? 1 : (o1.vision<o2.vision) ? -1 : 0;
            }
        }
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

        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("강", 135, 0.3 ),
                new PhyscData("김", 152, 0.4 ),
                new PhyscData("이", 180, 0.5 ),
                new PhyscData("최", 190, 0.7 ),
                new PhyscData("백", 170, 1.0 ),
        };

        System.out.println("키가 몇이 사람");
        int height = stdIn.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if(idx < 0) {
            System.out.println("그 값의 요소가 없습니다");
        }else{
            System.out.println("그 값은 " + idx + " 에 있음");
        }

    }


}
