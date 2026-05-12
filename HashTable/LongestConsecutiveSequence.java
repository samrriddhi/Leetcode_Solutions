class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int length = 0;
        for(int num : nums){
            set.add(num);
        }
        for( int num : set){
            if(!set.contains(num-1)){
                int chainLength=1;
                int x = num+1;
            
                while(set.contains(x)){
                 chainLength++;
                 x++;
                }
            
                if(length<chainLength){
                 length=chainLength;
                }
            }
        }
        return length;
    }
}