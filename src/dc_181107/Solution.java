package dc_181107;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int h = triangle.length;
        int[][] memory = new int[h][h];

        int i = 0;
        for (int[] layer : triangle) {
            int j = 0;
            for (int num : layer) {
                if (i == 0) memory[i][j] = num;
                else {
                    if (j == 0)
                        memory[i][j] = memory[i - 1][j] + num;
                    else {
                        int tmp_left = memory[i - 1][j - 1] + num;
                        int tmp_right = memory[i - 1][j] + num;
                        memory[i][j] = tmp_left > tmp_right ? tmp_left : tmp_right;
                    }
                    j++;
                }
            }
            i++;
        }
        for (int idx = 0; idx < h; idx++) {
            int tmp = memory[h - 1][idx];
            answer = tmp > answer ? tmp : answer;
        }
        return answer;
    }
}