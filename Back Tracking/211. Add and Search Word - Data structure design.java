class WordDictionary {
    Map<Integer, List<String>> map = new HashMap<>();
    /** Initialize your data structure here. */
    public WordDictionary() {
        
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        if(word == null || word.length() == 0) return;
        int key = word.length();
        if(map.containsKey(key))
            map.get(key).add(word);
        else{
            List<String> temp = new ArrayList<>();
            temp.add(word);
            map.put(key, temp);
        }
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        if(!map.containsKey(word.length()))
            return false;
        List<String> list = new ArrayList<>();
        list = map.get(word.length());
        for(String s : list) { 
            if(isSame(s, word)) { // when word has '.'
                return true;
            }
        }
        return false;
    }
    public boolean isSame(String s, String word) { // word has '.'
        for (int i = 0; i < s.length(); i++) {
         if (word.charAt(i) != '.' && s.charAt(i) != word.charAt(i)) {
            return false;
            }
        }
        return true;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
