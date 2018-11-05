package dc_181104;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        final int len = citations.length;
        if (len <= citations[0]) answer = len;
        else{
            int candi_ans = citations[len - 1], idx = len - 1;
            for (int i = 1; i < len; i++)
                if (len < citations[i]) {
                    candi_ans = citations[i];
                    idx = i;
                    break;
                }
            for (int i = candi_ans; i > 0 ; i--) {
                if(i <= citations[idx-1]) idx -= 1;
                if(i <= len - idx){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}