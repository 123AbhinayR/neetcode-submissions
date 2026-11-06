class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> output = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length - 2; i++){
            int target1 = 0 - nums[i];

            for(int j = i + 1; j < nums.length - 1; j++){
                int target2 = target1 - nums[j];

                if(map.containsKey(target2)){
                    int k = map.get(target2);
                    if(k > i && k > j){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        output.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(output);

        
    }
}
