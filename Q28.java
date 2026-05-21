
class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {

    map.put(nums[i],
            map.getOrDefault(nums[i],0) + 1);
}

// 0s
int ci = 0;

if (map.containsKey(0)) {

    for (int i0 = 0; i0 < map.get(0); i0++) {

        nums[i0] = 0;
        ci++;
    }
}
int c2=ci;
if (map.containsKey(1)) {

    for (int i1 = ci; i1 < (ci + map.get(1)); i1++) {

        nums[i1] = 1;
        c2++;
    }
}
int c3=c2;

if (map.containsKey(2)) {

    for (int i2 = c2; i2 < (c2 + map.get(2)); i2++) {

        nums[i2] = 2;
    }
}
    }
}
