class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
           return false;
        }

         HashMap <Character,Integer> scnt= new HashMap<>();
         HashMap <Character,Integer> tcnt= new HashMap<>();

         for(int i=0;i<s.length();i++)
         {
            scnt.put(s.charAt(i),scnt.getOrDefault(s.charAt(i),0)+1);
            tcnt.put(t.charAt(i),tcnt.getOrDefault(t.charAt(i),0)+1);


         }

         return scnt.equals(tcnt);
         





        


    }
}
