class Solution {

    public List<Integer> findAnagrams(String s, String p) {
       

        List<Integer> list = new ArrayList<>();
         if(s.length() < p.length()){
                return list;
    }

        HashMap<Character,Integer> mapp = new HashMap<>();

        for(int k=0; k<p.length(); k++){

            mapp.put(
                p.charAt(k),
                mapp.getOrDefault(
                    p.charAt(k),0)+1);
        }

        HashMap<Character,Integer> maps =
                new HashMap<>();

        for(int j=0; j<p.length(); j++){

            maps.put(
                s.charAt(j),
                maps.getOrDefault(
                    s.charAt(j),0)+1);
        }

        if(mapp.equals(maps)){

            list.add(0);
        }

        for(int i=1;
            i<=s.length()-p.length();
            i++){

            char remove =
                    s.charAt(i-1);

            maps.put(
                remove,
                maps.get(remove)-1);

            if(maps.get(remove)==0){

                maps.remove(remove);
            }

            char add =
                    s.charAt(
                        i+p.length()-1);

            maps.put(
                add,
                maps.getOrDefault(
                    add,0)+1);

            if(mapp.equals(maps)){

                list.add(i);
            }
        }

        return list;
    }
}
