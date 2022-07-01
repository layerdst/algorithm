package algorithm;

public class Reverse {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx2] = a[idx1];
        a[idx2] = t;
    }

    static void reverse(int [] a){
        for(int i=0; i<a.length/2; i++){
            swap(a, i, a.length - i - 1);
        }
    }

    static int sum(int [] a){
        int s = 0;
        for(int i = 0; i<a.length;i++){
            s += a[i];
        }
        return s;
    }

    static void copy(int[] a, int[] b) {
        a = new int[b.length];
        for(int i = 0; i<b.length;i++){
            a[i] = b[i];
        }
    }

    static void rcopy(int [] a, int [] b){
        reverse(b);
        a = new int[b.length];
        for(int i = 0; i<b.length;i++){
            a[i] = b[i];
        }
    }


}
