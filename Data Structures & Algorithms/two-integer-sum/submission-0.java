class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            int reamining = target - nums[i];

            if(map.containsKey(reamining)){
                return new int[]{map.get(reamining) , i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{};



        
    }
}
