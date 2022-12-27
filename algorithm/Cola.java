class Solution {
    public int solution(int a, int b, int n) {
        
        int answer = 0;
        int temp = n;
        while(temp>=a){
            int glass = temp/a;
            temp = glass * b + temp%a;
            answer += glass * b;
        }
        return answer;
    }
}
