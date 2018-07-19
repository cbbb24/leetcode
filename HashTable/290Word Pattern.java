class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] word= str.split(" ");
        if(word.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(word[i]))
                    continue;
                else
                    return false;
            }else{
                if(!map.containsValue(word[i]))
                    map.put(pattern.charAt(i), word[i]);
                else
                    return false;
            }
        }
        return true;
    }
}
