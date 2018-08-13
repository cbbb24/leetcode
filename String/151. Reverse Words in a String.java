public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) return "";
        Stack<String> result = new Stack<>();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')
                continue;
            String a = "";
            while(i < s.length() && s.charAt(i) != ' '){
                a += s.charAt(i);
                i++;
            }
            result.push(a);
        }
        if(!result.isEmpty()){
            output.append(result.pop());
        }
        while(!result.isEmpty()){
            output.append(" " + result.pop());
        }
        return output.toString();
    }
}
