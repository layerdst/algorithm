package algorithm;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int [] arr, int num){
        int start = 0;
        int last = arr.length -1;

        do {
            int center = (start + last) / 2;
            if (arr[center] == num) {
                return center;
            } else if (arr[center] > num) {
                last = center - 1;
            } else {
                start = center +
                        1;
            }
        } while (start <= last);
        return -1;

    }

    static int binarySearchReview(int[] arr, int num){
        int start = 0;
        int last = arr.length -1;
        int mid = 0;

        do {
            mid = (start+last)/2;
            if(arr[mid]>num){
                last = mid +1;
            }else if(arr[mid]<num){
                start = mid -1;
            }else{
                return mid;
            }

        } while (start <= last);

        return 0;
    }

    static int binarySearchX(int [] arr, int num){
        int start = 0;
        int last = arr.length-1;
        int mid = 0;
        int count = 0;
        int chk = 0;

        if(arr.length == 1){
            return 0;
        }
        do {
            mid = (start + last)/2;
            if(arr[mid] < num){
                start = mid+1;
                count++;
            }else if(arr[mid]> num){
                last = mid-1;
                count++;
            }else{
                System.out.println("찾기");
                System.out.println(mid);
                while (arr[mid] == arr[mid - 1]){
                    mid--;
                    System.out.println("while");
                    System.out.println(mid);
                };
                return mid;
            }
        } while (start <= last);
        return -1;
    }

    static int searchIdx(int[] a, int idx) {
        int temp[] = new int[100];
        int size = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == idx){
                temp[size] = i;
                size++;
            }
        }
        return size;

    }

    public static void main(String[] args) {
        Scanner idx = new Scanner(System.in);
        System.out.println("배열크기");
        int len = idx.nextInt();

        int arr[] = new int[len];

        System.out.println("배열 입력");
        int temp = 0;
        do {
            arr[temp] = idx.nextInt();
            temp ++;
        } while (temp < len);

        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" , ");
        }

        int key = idx.nextInt();

        System.out.println(binarySearchX(arr, key));
    }
}


