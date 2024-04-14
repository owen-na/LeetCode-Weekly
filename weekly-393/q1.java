class Solution {
    public String findLatestTime(String s) {
        int pointer = s.length();
        StringBuilder output = new StringBuilder();
        int counter = 0;
        int parser = 0;
        while (counter < pointer) {  
            if (s.charAt(counter) != '?' && counter != 2) {
                output.append(s.charAt(counter));
            } else if (counter == 2) {
                output.append(":");
                parser = Integer.parseInt(new Character(output.charAt(counter - 1)).toString());
                if (parser >= 2) {
                    output.replace(0,1,"0");
                } 
            } else if (s.charAt(counter) == '?' && counter == 0) {
                output.append("1");
            } else if (s.charAt(counter) == '?' && counter == 1) { // second
                if (s.charAt(counter - 1) == '0') {
                    output.append("9");
                } else {
                    output.append("1");
                }
            } else if (s.charAt(counter) == '?' && counter == 3) {
                output.append("5");
            } else if (s.charAt(counter) == '?' && counter == 4) {
                output.append("9");
            }
            counter++;
        }
        return output.toString();
    }
}
