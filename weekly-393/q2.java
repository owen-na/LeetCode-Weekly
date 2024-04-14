class Solution {
    public int maximumPrimeDifference(int[] nums) {
        boolean start = true;
        int begin = 0;
        int end = 0;
        // for loop n <= square root of n and modoolo 
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i]) == true && start == true) {
                begin = i;
                start = false;
            } else if (isPrime(nums[i]) == true && start == false) {
                end = i;
            } 
        }
        if (start == false && end == 0) {
            return 0;
        }
        return end - begin;
    }
    
    private boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // not prime
            } 
        }
        return true; // is prime
    }
}