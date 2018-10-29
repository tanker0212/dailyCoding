package dc_181029;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        String answer = "";

        HashMap<String, Integer> compare_map = new HashMap<>();
        for (String name : participant)
            compare_map.put(name, compare_map.getOrDefault(name,0) + 1);
        for (String name : completion)
            compare_map.put(name, compare_map.get(name) - 1);

        for (String key : compare_map.keySet())
            if (compare_map.get(key) != 0){
                answer = key;
                break;
            }
        System.out.println(answer);
    }
}
