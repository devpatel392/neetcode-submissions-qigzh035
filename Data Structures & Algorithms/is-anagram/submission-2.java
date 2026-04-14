class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: If lengths are different → cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a HashMap to count characters in s
        Map<Character, Integer> map = new HashMap<>();

        // Count characters in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 3: Decrease counts using characters in t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false; // character in t not found in s
            }
            
            map.put(c, map.get(c) - 1);

            if (map.get(c) < 0) {
                return false; // t has more of a char than s
            }
        }

        // Step 4: All counts matched → anagram
        return true;
    }
}

