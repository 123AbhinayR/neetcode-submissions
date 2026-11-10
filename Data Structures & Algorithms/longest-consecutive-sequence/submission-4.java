class Solution {
    public int longestConsecutive(int[] nums) {
        int greatestCount = 1;
        int count = 1;
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] == nums[i]){
                continue;
            }
            
            if(nums[i + 1] == nums[i] + 1){
                count++;
            }
            
            else{
                count = 1;
            }

            greatestCount = Math.max(greatestCount, count);
        }
        return greatestCount;
        
    }
}
