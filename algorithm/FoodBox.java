public class FoodBox {
    public String solution(int[] food) {

        StringBuffer temp  = new StringBuffer();
        for(int i =1 ; i<food.length;i++){
            for(int j =0;j<food[i]/2;j++){
                temp.append(i);
            }
        }

        StringBuffer reversTemp = new StringBuffer(temp).reverse();
        return temp.append(0).append(reversTemp).toString();
    }

    public static void main(String[] args) {

        FoodBox foodBox = new FoodBox();
        int[] temp = {1, 3, 4, 6};
        String solution = foodBox.solution(temp);
        System.out.println(solution);

    }
}
