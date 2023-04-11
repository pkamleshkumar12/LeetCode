class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        total = sum(nums[:k])
        max_total = total
        l = 0
        for i in range(k, len(nums)):
            total = total + nums[i] - nums[l]
            max_total = max(total, max_total)
            l +=1
        return max_total/k