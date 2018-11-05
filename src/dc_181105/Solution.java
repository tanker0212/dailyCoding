package dc_181105;

class Solution {
    public long solution(int N) {
        long answer = 0;
        long[] arr = new long[N + 1];
        arr[0] = 1; arr[1] = 1;
        for(int i = 2; i <= N; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
        answer = 2 * (arr[N] + arr[N - 1]);
        return answer;
    }
}
