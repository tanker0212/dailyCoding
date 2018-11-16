package dc_181116;

import java.util.Arrays;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;

        // n > total works
        int sum = 0;
        for(int work : works) sum += work;
        if(n >= sum) return 0;

        Arrays.sort(works);
        int len = works.length;
        int max_val = works[len - 1];
        for (int idx = len - 2; idx >= 0; idx--) {
            int cur_val = works[idx];
            if (max_val > cur_val){
                int tmp_mi = (max_val - cur_val) * (len - idx - 1);
                max_val = cur_val;
                if (tmp_mi >= n){
                    for (int jdx = len - 1; jdx > idx; jdx--) {
                        works[jdx] -= 1;
                        n--;
                        if (n == 0) break;
                        if (jdx == idx + 1 && n > 0) jdx = len;
                    }
                    break;
                }
                else {
                    n -= tmp_mi;
                    for (int jdx = len - 1; jdx > idx; jdx--) works[jdx] = cur_val;
                }
            }
            else if (idx == 0){
                int div = n/len, rest = n%len;
                for (int i = 0; i < len; i++) {
                    works[i] -= div;
                    if (rest-- > 0) works[i]--;
                }
            }
        }
        for (int work : works) answer += work * work;
        return answer;
    }
}