class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else 
                map.put(s.charAt(i), 1);
        }
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i)))
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            else
                return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) != 0)
                return false;
        }
        return true;
    }
/**
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] tab = new int[26];
        for(int i = 0; i < s.length(); i++){
            tab[s.charAt(i) - 'a']++;
            tab[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
           if(tab[i] != 0)
               return false;
        }
        return true;
    }
*/
}
