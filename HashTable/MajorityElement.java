class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int freq=map.getOrDefault(num,0);
            map.put(num,freq+1);
            freq++;
            if(freq>(nums.length)/2){
                return num;
            }
        }
        return -1;
    }
}