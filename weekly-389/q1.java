class Solution {
    public boolean isSubstringPresent(String s) {
        if (s.length() == 1) {return false;}
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return true;
            } else if (i > 0 && s.charAt(i + 1) == s.charAt(i - 1)) {
                return true;
            } 
        } 
        return false;
    }
}