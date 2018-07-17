class Solution {
/**    public String countAndSay(int n) {
        String last = "1";
        for(int i = 1; i < n; i++){
            int count = 1;
            String str = "";
            for(int j = 0; j < last.length(); j++){
                if(j != last.length() - 1 && last.charAt(j) == last.charAt(j + 1)){
                    count++;
                }else{
                    str = str + count + last.charAt(j);
                    count = 1;
                }
            }
            last = str;
        }
        return last;
    }
*/
    public String countAndSay(int n) {
        StringBuilder last = new StringBuilder().append("1");
        for(int i = 1; i < n; i++){
            int count = 1;
            StringBuilder str = new StringBuilder();
            for(int j = 0; j < last.length(); j++){
                if(j != last.length() - 1 && last.charAt(j) == last.charAt(j + 1)){
                    count++;
                }else{
                    str = str.append(count).append(last.charAt(j));
                    count = 1;
                }
            }
            last = str;
        }
        return last.toString();
    }
}
