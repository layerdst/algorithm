package algorithm;

public class BinarySearch {
    static int binarySearch(int [] arr, int num){
        int start = 0;
        int last = arr.length -1;

        do {
            int center = (start + last) / 2;
            if (arr[center] == num) {
                return center;
            } else if (arr[center] > num) {
                last = center + 1;
            } else {
                start = center - 1;
            }
        } while (start <= last);
        return -1;

    }

}
