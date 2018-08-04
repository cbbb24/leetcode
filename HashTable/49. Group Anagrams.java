class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
                map.get(key).add(s);
            
        }
        
        for(List a : map.values()){
            result.add(a);
        }
        return result;
    }
}
