class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int h=0;

        for(int i=0;i<citations.length;i++){

            int papers =
                citations.length-i;

            if(citations[i]>=papers){

                h=papers;

                break;
            }
            
}
return h ;
}
}
