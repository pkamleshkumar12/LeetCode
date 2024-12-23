class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++; // Increment count for consecutive 1s
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0; // Reset count when a 0 is encountered
            }
        }

        return maxCount;

    }
}