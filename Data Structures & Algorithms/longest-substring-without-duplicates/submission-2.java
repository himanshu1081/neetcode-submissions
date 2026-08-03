class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() < 2) {
            return s.length();
        }
        HashSet<Character> character = new HashSet<>();
        int length=0;
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            if (!character.contains(s.charAt(right))) {
                character.add(s.charAt(right));
                right++;

            } else {
                maxLength = Math.max(character.size(), maxLength);
                character.remove(s.charAt(left));
                left++;
            }
        }

        return Math.max(character.size(), maxLength);
    }
}
