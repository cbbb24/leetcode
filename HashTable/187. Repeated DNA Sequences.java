class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();
        for(int i = 0; i + 9 < s.length(); i++){
            String ten = s.substring(i, i + 10);
            if(!set.add(ten)){
                result.add(ten);
            }
        }
        List<String> dna = new ArrayList<>(result);
        return dna;
    }
}
