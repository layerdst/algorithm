public class Max {
    public int GreateMultiply(int[] numbers) {

        int[] temp = Arrays.stream(numbers).sorted().toArray();
        int len = temp.length;

        return temp[len-1]*temp[len-2];
    }
    
    public int maxValue(int a, int b, int c, int d){
        int max=a;
        if(max<b){max=b;}
        if(max<c){max=c;}
        if(max<d){max=d;}
        return max;
    }
    
    
}
