import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] letters = new int[26];
        Arrays.fill(letters, -1);
    
        
        for(int i = 0 ; i<s.length(); i++){
            int idx = s.charAt(i)-97;
            if(letters[idx]== -1){
                answer[i] = -1;
            }else{
                answer[i]= i - letters[idx]; 
            }
            letters[idx] = i;
        }
        
        //for(int i = 0; i<s.length(); i++){
            
            // int tempx = s.indexOf(s.charAt(i));
            // System.out.println(tempx();
            //System.out.println(s.charAt(i));
        //}
    
        return answer;
    }
}
