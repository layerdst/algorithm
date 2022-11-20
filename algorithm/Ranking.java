import java.util.Arrays;
import java.util.stream.IntStream;

public class Ranking {

    public int[] solution(int[][] score){
        IntStream intStream = Arrays.stream(score).mapToInt(v -> Arrays.stream(v).sum());
        int []scores = Arrays.stream(score).mapToInt(v -> Arrays.stream(v).sum()).toArray();
        int []tempScores = Arrays.stream(score).mapToInt(v -> Arrays.stream(v).sum()).sorted().toArray();
        int length = score.length;
        int[] solution = new int[length];

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(scores[i]==tempScores[j]){
                    solution[i] = j+1;
                }
            }
        }

        return solution;
    }

    public static void main(String[] args) {
        int score[][] = {{80, 60}, {90, 50}, {40, 70}, {50, 80}};
        Ranking p = new Ranking();
        for (int i : p.solution(score)) {
            System.out.println(i);
        }
    }
}
