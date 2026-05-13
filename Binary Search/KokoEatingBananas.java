class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=0;
        
        for(int pile : piles){
            high =Math.max(high,pile);
        }
        while(low<high){
            int totalhrs=0;
            int mid = low + (high - low)/2;
            for(int pile : piles){
                
                totalhrs += (int)(Math.ceil((double)pile/mid));
            }
            if(totalhrs<=h){
                high = mid;
            }
            else{
                low = mid+ 1;
            }
        }
        return low;
    }
}