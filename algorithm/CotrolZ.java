import java.util.*;

class Solution {
    public int solution(String s) {
        String[] temp = s.split(" ");
        
        int preTemp = 0;
        int sum = 0;
        for(String sd : temp){
            if(sd.equals("Z")){
                sum = sum - preTemp;
                continue;
            }
            preTemp = Integer.parseInt(sd);
            sum = sum+preTemp;
        }
        
        return sum;
    }
}
