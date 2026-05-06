class Solution {
    public boolean isPalindrome(String s) {
        String res=s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]","");
        char[] arr=res.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
                
            }
            start++;
            end--;
    
        }
        return true;
    }
}