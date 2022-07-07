package algorithm;

public class SeqSearch {

    public int seqSeacch(int[] arr , int num){
        int len = arr.length;
        int result = 0;
        arr[len] = num;

        for(int i=0;i<=arr.length;i++){
            if(arr[i]==num){
                result = i;
            }
        }
        return result == arr.length ? -1 : result;
    }
}
