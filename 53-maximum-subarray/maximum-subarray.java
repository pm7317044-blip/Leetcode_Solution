class Solution {
    public int maxSubArray(int[] nums) {
        int total_sum=0;
        int max_sum=nums[0];
    for(int i=0;i<nums.length;i++){
total_sum+=nums[i];
if(total_sum>max_sum){
    max_sum=total_sum;
}
if(total_sum<0){
    total_sum=0;
}
    }
    return max_sum;
        }
}