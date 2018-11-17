package dc_181117;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n]; k--;
        List<Integer> list = new ArrayList<>();
        long[] fac = new long[n];
        fac[0] = 1;
        for(int i = 1; i < n; i++) fac[i] = i * fac[i - 1];
        for(int i = 1; i <= n; i++) list.add(i);
        for(int i = n; i > 0; i--){
            answer[n - i] = list.remove((int)(k/fac[i-1]));
            k %= fac[i-1];
        }
        return answer;
    }
}
