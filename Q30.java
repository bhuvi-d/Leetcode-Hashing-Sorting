class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    HashMap<Integer,Integer> map = new HashMap<>();

    for (int j : nums) {

        map.put(j,
                map.getOrDefault(j,0)+1);
    }

    List<Map.Entry<Integer,Integer>> list =
            new ArrayList<>(map.entrySet());

    list.sort((a,b) ->
            Integer.compare(a.getValue(),
                            b.getValue()));

    int[] pop = new int[k];

    for (int u = 0; u < k; u++) {

        pop[u] =
            list.get(list.size()-1-u)
                .getKey();
    }

    return pop;
}
}
