class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = 0;
        if (x == 100) {
            temp = 1; 
        }
        int single = x % 10; // single 
        int tens = (x % 100 - single) / 10;
        if (x % (temp + tens + single) == 0) {
            return temp + tens + single;
        } else {
            return -1;
        }
    } // 22 % 10 = 2 
}