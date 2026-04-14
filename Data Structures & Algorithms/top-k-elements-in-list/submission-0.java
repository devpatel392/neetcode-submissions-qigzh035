class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int n : nums){
            freq.put(n , freq.getOrDefault(n ,0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int key : freq.keySet()){
            int count = freq.get(key);
            if(bucket[count] == null){
                bucket[count] = new ArrayList<>();

            }
            bucket[count].add(key);

        }
        int [] result = new int[k];
        int idx = 0;
        for(int i = bucket.length - 1 ; i>=0 && idx < k ; i--){
            if(bucket[i] != null){
                for(int n : bucket[i] ){
                    if(idx<k){
                      result[idx++] = n;

                    }
                }
            }
        }
        return result;
    }
}
