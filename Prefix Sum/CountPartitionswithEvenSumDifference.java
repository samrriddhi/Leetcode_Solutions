class Solution {
    public int countPartitions(int[] nums) {
        int total =0;
        for(int num : nums){
            total += num;
        }
        int leftSum=0;
        int count=0;
        for(int i = 1;i<nums.length;i++){
            leftSum+=nums[i];
            int rightSum=total-leftSum;
            if((leftSum-rightSum)%2==0){
                count++;
            }
        }
        return count;
    }
}