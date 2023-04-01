class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        total, count= sum(nums), 0
        
        for i in range(len(nums)):
            count += nums[i]
            if count == total:
                return i
            total -= nums[i]
            
        return -1
            
        