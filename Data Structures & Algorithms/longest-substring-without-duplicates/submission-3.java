class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() < 2) {
            return s.length();
        }
        HashSet<Character> window = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            if (!window.contains(s.charAt(right))) {
                window.add(s.charAt(right));
                maxLength = Math.max(maxLength, window.size());
                right++;

            } else {
                window.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
