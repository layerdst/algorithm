public class Max {
    public int solution(int[] numbers) {

        int[] temp = Arrays.stream(numbers).sorted().toArray();
        int len = temp.length;

        return temp[len-1]*temp[len-2];
    }
}
