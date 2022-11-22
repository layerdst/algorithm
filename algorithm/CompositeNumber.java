public class CompositeNumber {

    public int solution(int n) {
        int check  = 0;
        int temp = 0;
        for (int i=2; i<=n; i++) {
            System.out.println("i== " + i);
            temp = 0;
            for(int j=2;j<=i;j++){
                if(i%j == 0){
                    System.out.println("j == " + j);
                    temp ++;
                    System.out.println(temp);
                }
            }
            if(temp >=2 ){
                check++;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        CompositeNumber cn = new CompositeNumber();
        System.out.println(cn.solution(15));
    }

}

