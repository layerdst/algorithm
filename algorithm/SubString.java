class Solution {
    public int solution(String t, String p) {
        int temp = p.length();
        long ch = Long.parseLong(p);
        
        int answer = 0;
        for(int i = 0 ; i+ temp <= t.length();i++){
            long s = Long.parseLong(t.substring(i, i+temp)); 
            if(ch>=s){              
                answer++;   
            }
            
        }
        
        return answer;
    }
}
