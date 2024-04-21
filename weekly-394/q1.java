import java.util.HashMap;

class Solution {
    public int numberOfSpecialChars(String word) {
        if (word.length() == 1) {return 0;}
        int counter = 0;
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            // if (map.containsKey(Character.toUpperCase(word.charAt(i)))) {
            //     if (map.get(Character.toUpperCase(word.charAt(i))) == false && Character.toUpperCase(word.charAt(i)) != word.charAt(i)) {
            //         map.replace(Character.toUpperCase(word.charAt(i)), false, true);
            //         map.replace(Character.toLowerCase(word.charAt(i)), false, true);
            //         counter++;
            //     }
            // } else if (map.containsKey(Character.toLowerCase(word.charAt(i)))) {
            //     if (map.get(Character.toLowerCase(word.charAt(i))) == false && Character.toLowerCase(word.charAt(i)) != word.charAt(i)) {
            //         map.replace(Character.toUpperCase(word.charAt(i)), false, true);
            //         map.replace(Character.toLowerCase(word.charAt(i)), false, true);
            //         counter++;
            //         }
            //     } 
            // }
            map.put(word.charAt(i), true);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            if (map.containsKey(c) && map.containsKey(Character.toUpperCase(c))) {
                counter++;
            }
        }
        
        return counter;
        }
    }
