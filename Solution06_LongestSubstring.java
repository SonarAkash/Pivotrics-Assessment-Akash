import java.util.HashMap;

public class Solution06_LongestSubstring {
    public int solve(String s){
        HashMap<Character, Integer> lastIndex = new HashMap<>();
        int start = -1;
        int res = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // if character seen before, move start forward
            if(lastIndex.containsKey(ch)){
                start = Math.max(start, lastIndex.get(ch));
            }

            lastIndex.put(ch, i);
            res = Math.max(res, i - start);
        }

        return res;
    }

    public static void main(String[] args) {
        Solution06_LongestSubstring solution = new Solution06_LongestSubstring();
        System.out.println(solution.solve("xxxx"));     // 1
        System.out.println(solution.solve("zxyzxyz"));  // 3
    }
}
