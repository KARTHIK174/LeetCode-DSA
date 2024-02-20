class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        int n=nums.length;
        int sum=0;
        int actsum = (n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return actsum-sum;
    }
}
