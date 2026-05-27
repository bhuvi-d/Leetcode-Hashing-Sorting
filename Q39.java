class Solution {
    public int missingNumber(int[] nums) {
        int count=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            if ((nums[i]^i)!=0){
                return i ; 
            }
        }

        return count;
    }
}
