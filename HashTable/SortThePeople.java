class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map= new HashMap<>();
        for(int i = 0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Integer[] newHeights = new Integer[heights.length];
        for(int i = 0 ; i<heights.length;i++){
            newHeights[i]=heights[i];
        }
        Arrays.sort(newHeights,Collections.reverseOrder());
        String[] ans = new String[names.length];
        for(int i = 0 ; i<names.length;i++){
            ans[i]=map.get(newHeights[i]);
        }
        return ans;
    }
}