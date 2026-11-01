class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int number: nums){
            if(!seen.add(number)){
                return true;
            }
        }
        return false;
    }
}