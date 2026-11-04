class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int second = target - nums[i];
            if(map.containsKey(second)){
                index1 = map.get(second); //Larger index has to come second
                index2 = i;
                break;
            }
            map.put(nums[i], i);
        }
        int[] answer = new int[]{index1, index2};
        return answer;
    }
}
