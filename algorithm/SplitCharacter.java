public class SplitCharacter {
    public int solution(String s) {
        int answer = 0;
        int count=0;
        char temp=0;
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1){
                answer++;
                continue;
            }
            if(count ==0){
                temp = s.charAt(i);
                count++;

            }else{
                if(temp==s.charAt(i)){
                    count++;
                }else{
                    count--;
                    if(count==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SplitCharacter splitCharacter = new SplitCharacter();
        System.out.println(splitCharacter.solution("abracadabra"));
    }

}
