class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){

            return 0;
        }
        Arrays.sort(nums);
        int outcount=1;
        int incount=1;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i+1]==nums[i]+1){
                incount++;
                outcount=Math.max(incount,outcount);
            }
            else if (nums[i+1]==nums[i]){
                continue;
            }
            else{
            incount=1;
            }
        }
        return outcount;
    

    

    }
    }
