package dc_181029;

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
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
        return answer;
    }
}