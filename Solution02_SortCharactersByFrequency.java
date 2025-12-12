import java.util.*;

public class Solution02_SortCharactersByFrequency {

    public String solve(String s) {
        if (s == null || s.isEmpty()) return s;

        // Count char frequencies
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Sort by frequency (descending)
        List<Character> chars = new ArrayList<>(counts.keySet());
        chars.sort((a, b) -> counts.get(b) - counts.get(a));

        // Reconstruct string
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int count = counts.get(c);
            sb.append(String.valueOf(c).repeat(count));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution02_SortCharactersByFrequency solution = new Solution02_SortCharactersByFrequency();
        
        System.out.println(solution.solve("tree"));   // eert
        System.out.println(solution.solve("cccaaa")); // aaaccc
        System.out.println(solution.solve("Aabb"));   // bbAa
    }
}