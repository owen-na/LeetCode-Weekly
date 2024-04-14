class Solution {
    public long countSubstrings(String s, char c) {
        long result = 0;
        if (s.length() == 1 && s.charAt(0) == c) {return 1;}
        else if (s.length() == 1 && s.charAt(0) != c) {return 0;}
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result++;
            }
        }
        return ((result * (result + 1))/2);
    }
}