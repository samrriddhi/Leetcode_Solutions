class Solution {
    public int smallestEvenMultiple(int n) {
        int mul=2*n;
        if(n%n==0 && n%2==0){
            return n;
        }
        else{
            return mul;
        }
    }
}