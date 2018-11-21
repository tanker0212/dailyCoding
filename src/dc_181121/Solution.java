package dc_181121;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        //int m = 6, n = 4;
        //int[][] picture = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {3, 0, 0, 3}, {3, 3, 3, 3}};
        //int[][] picture = new int[][]{{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 0, 0, 1}};

        int m = 13, n = 16;
        int[][]picture = new int[][]{
                {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},
                {0,1,1,1,1,2,1,1,1,1,2,1,1,1,1,0},
                {0,1,1,1,2,1,2,1,1,2,1,2,1,1,1,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,1,3,3,3,1,1,1,1,1,1,3,3,3,1,0},
                {0,1,1,1,1,1,2,1,1,2,1,1,1,1,1,0},
                {0,0,1,1,1,1,1,2,2,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0}
        };
        System.out.println(Arrays.toString(s.solution(m, n, picture)));
    }

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                int color = picture[i][j];
                if (color > 0){
                    numberOfArea += 1;
                    int tmp = color_counter(picture, i, j, color, m, n);
                    maxSizeOfOneArea = tmp > maxSizeOfOneArea ? tmp : maxSizeOfOneArea;
                }
            }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private int color_counter(int[][] picture, int i, int j, int color, int m ,int n){
        picture[i][j] = 0;
        boolean[] path = next_step(picture, i, j, color, m, n);
        int counter = 1;
        if (Arrays.equals(path, new boolean[]{false, false, false, false}))
            return counter;
        else{
            if (path[0] && picture[i][j+1] == color)
                counter += color_counter(picture, i, j+1, color, m, n);
            if (path[1] && picture[i][j-1] == color)
                counter += color_counter(picture, i, j-1, color, m, n);
            if (path[2] && picture[i+1][j] == color)
                counter += color_counter(picture, i+1, j, color, m, n);
            if (path[3] && picture[i-1][j] == color)
                counter += color_counter(picture, i-1, j, color, m, n);
        }
        return counter;
    }

    private boolean[] next_step(int[][] picture, int i, int j, int color, int m, int n){
        boolean[] path = new boolean[4]; //[0: 동] [1: 서] [2: 남] [3: 북]
        Arrays.fill(path, true);
        if(j == n - 1 || picture[i][j + 1] != color) path[0] = false;
        if(j == 0     || picture[i][j - 1] != color) path[1] = false;
        if(i == m - 1 || picture[i + 1][j] != color) path[2] = false;
        if(i == 0     || picture[i - 1][j] != color) path[3] = false;
        return path;
    }
}