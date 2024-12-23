class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int maxCount = 0;
        int currentCount = 0;
        
        for (int i : nums){
            if(i ==1){
                currentCount ++;
                maxCount = Math.max(currentCount, maxCount);
            } else {
            currentCount =0;    
            }

           
            
        }
 return maxCount;
    }
}