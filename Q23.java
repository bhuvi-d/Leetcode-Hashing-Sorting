class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         boolean x=false;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i),0)+1);
        }
        for (int k=0;k<ransomNote.length();k++){
            if (map.containsKey(ransomNote.charAt(k))){
                if(map.get(ransomNote.charAt(k))<=0){
                    return false;
                }
                else{
                    x=true;
                    map.put(ransomNote.charAt(k), map.get(ransomNote.charAt(k))-1);
                }
            }
            else{
                return false;
            }
            
        }
        return x;
    }
}
