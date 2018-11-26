package dc_181126;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 4;
        //int[][] costs = new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        int[][] costs = new int[][]{{0,1,1},{0,2,12},{1,3,10},{2,3,1}};
        int[] done = new  int[n];
        // 1. 가장 싼거 하나 연결하고
        // 2. 그 연결된곳에서 다른곳으로 가는 가장 싼거 하나 연결하고
        // 3. 다 연결될때까지 2를 반복
        for (int i = 0; i < n; i++) {
            int min_cost = Integer.MAX_VALUE;
            int[] tmp = new int[3];
            for (int[] cost : costs) {
                if (cost[0] == i || cost[1] == i){
                    if (cost[2] < min_cost){
                        min_cost = cost[2];
                        tmp = cost;
                    }
                }
            }
            System.out.println(Arrays.toString(tmp));
        }
    }
}
