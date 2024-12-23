class Solution {
    public int findNumbers(int[] nums) {
        int r = 0;
        for(int n : nums){
            int digits = 0;
            while(n >0){
               n = n/10;
                digits ++;
            }
            if(digits % 2 == 0){
                r++;
                }
        }
        return r;
    }
}