class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        if (numBottles == 0) return 0;
        int result = numBottles; // drank
        int counter = 0;
        // int tracker = numBottles;
        while (numBottles >= numExchange) {
            if (numBottles - numExchange < 0) {
                return result;
            } else {
            while (numBottles - numExchange >= 0) {
                result++;
                numBottles = numBottles - numExchange;
                numExchange++;
                counter++;
            }
            numBottles = numBottles + counter; 
            counter = 0;
            }
        }
        return result;
    }
}