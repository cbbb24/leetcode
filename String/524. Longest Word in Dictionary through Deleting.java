class Solution {
    public String findLongestWord(String s, List<String> d) {
        String max = "";
        for(String temp : d){
            if(isSub(s, temp)){
                if(max.length() < temp.length())
                    max = temp;
                else if(max.length() == temp.length() && temp.compareTo(max) < 0){
                    max = temp;
                }
            }
        }
        return max;
    }
    public boolean isSub(String s, String temp){
        int j = 0;
        for(int i = 0; i < s.length() && j < temp.length(); i++){
            if(temp.charAt(j) == s.charAt(i))
                j++;
        }
        return j == temp.length();
    }
}
