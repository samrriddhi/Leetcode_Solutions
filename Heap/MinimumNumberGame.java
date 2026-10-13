class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : nums){
            pq.add(num);
        }

        while(!pq.isEmpty()){
            int first = pq.poll();
            int second = pq.poll();

            arr.add(second);
            arr.add(first);
        }
        int[] result = new int[arr.size()];
        for(int i = 0;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;

    }
}