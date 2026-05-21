class Solution {

    public int sum(int no) {

        int sumx = 0;

        while (no != 0) {

            int x = no % 10;

            sumx += x * x;

            no = no / 10;
        }

        return sumx;
    }

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            if (set.contains(n)) {
                return false;
            }

            set.add(n);

            n = sum(n);
        }

        return true;
    }
}
