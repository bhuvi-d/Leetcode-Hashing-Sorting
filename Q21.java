class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] ret = new int[2];
    HashMap<Integer,Integer> map = new HashMap<>();
    for (int i =0 ;i<nums.length;i++){
        if (map.containsKey(target-nums[i])){
            ret[0]=map.get(target-nums[i]);
            ret[1]=i;
        }
        else{
            map.put(nums[i],i);
        }
    }
    return ret;
    }
}
