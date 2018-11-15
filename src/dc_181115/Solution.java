package dc_181115;

class Solution {
    public int solution(int n) {
        int answer = 0, a1 = 1, a2 = 2;
        if(n < 3) answer = n;
        else{
            for(int i = 2; i < n; i++){
                answer = a1 + a2;
                if(answer > 1000000007) answer %= 1000000007;
                a1 = a2;
                a2 = answer;
            }
        }
        return answer;
    }
}