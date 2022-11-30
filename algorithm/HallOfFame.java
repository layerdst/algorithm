public class HallOfFame {

    public int [] solution(int k, int[] score){
        int [] answer = new int[score.length];
        List<Integer> temp = new ArrayList<>();

        for(int i = 0 ; i<score.length;i++){
            if(i>k-1){
                if(score[i]>temp.get(0)){
                    temp.set(0,score[i]);
                }
            }else{
                temp.add(score[i]);
            }
            Collections.sort(temp);
            answer[i] = temp.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {

        HallOfFame hallOfFame = new HallOfFame();
        int [] list = {10, 100, 20, 150, 1, 100, 200};
        int[] solution = hallOfFame.solution(3, list);

        for(int i : solution){
            System.out.print(i + ", ");
        }

    }
}
