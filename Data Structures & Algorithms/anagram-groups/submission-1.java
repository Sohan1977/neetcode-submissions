class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap <String,List<String>> map=new HashMap<>();

        for(int i=0; i<strs.length;i++)
        {
            char [] chararr=strs[i].toCharArray();
            Arrays.sort(chararr);
            String tempS= new String(chararr);

            if(!map.containsKey(tempS))
            {
                map.put(tempS,new ArrayList<>());
            }
            map.get(tempS).add(strs[i]);



        }
        return new ArrayList<>(map.values());
        
    }
}
