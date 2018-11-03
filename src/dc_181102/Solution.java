package dc_181102;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] tmp_arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(tmp_arr);
            answer[i] = tmp_arr[commands[i][2] - 1];
        }

        System.out.println(Arrays.toString(answer));
    }
}
