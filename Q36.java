class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

if (nums[0] > 1){
    return 1;
}

if (nums[nums.length-1] <= 0){
    return 1;
}

// 1) create hashset
HashSet<Integer> set = new HashSet<>();

// 2) find first positive element
int start = 0;

for(int i=0;i<nums.length;i++){

    if(nums[i] > 0){

        if(nums[i] > 1){
            return 1;
        }

        start = i;
        break;
    }
}

// 3) populate hashset from first positive element
for(int i=start;i<nums.length;i++){

    set.add(nums[i]);
}

// 4) tracker initialized
int tracker = 1;

// 5) loop till last element
while(tracker < nums[nums.length-1]){

    // 6) missing in hashset
    if(!set.contains(tracker)){

        return tracker;
    }

    tracker++;
}

return tracker+1;



    }
}
