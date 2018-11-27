package dc_181126;

import java.util.HashSet;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;

        int costs_len = costs.length;
        int[] check = new int[costs_len];
        HashSet<Integer> Island_set = new HashSet<>();

        int idx = 0;
        int min_cost = Integer.MAX_VALUE;
        for (int i = 0; i < costs_len; i++)
            if (costs[i][2] < min_cost){
                min_cost = costs[i][2];
                idx = i;
            }
        answer += build(check, Island_set, costs[idx], idx);

        while(Island_set.size() < n) {
            min_cost = Integer.MAX_VALUE;
            for (int i = 0; i < costs_len; i++)
                if (check[i] == 0)
                    if (Island_set.contains(costs[i][0]) || Island_set.contains(costs[i][1]))
                        if (!Island_set.contains(costs[i][0]) || !Island_set.contains(costs[i][1]))
                            if (costs[i][2] < min_cost){
                                min_cost = costs[i][2];
                                idx = i;
                            }

            answer += build(check, Island_set, costs[idx], idx);
        }
        return answer;
    }

    private int build(int[] check, HashSet<Integer> Island_set, int[] cost, int idx){
        check[idx] = 1;
        Island_set.add(cost[0]);
        Island_set.add(cost[1]);
        return cost[2];
    }
}