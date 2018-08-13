class Solution {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0) return path;
        Stack<String> result = new Stack<>();
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == '/')
                continue;
            StringBuilder s = new StringBuilder();
            while(i < path.length() && path.charAt(i) != '/'){
                s.append(path.charAt(i));
                i++;
            }
            if(s.toString().equals("..") && !result.isEmpty()){
                result.pop();
            }else if(!s.toString().equals("") && !s.toString().equals(".") && !s.toString().equals("..")){
                result.push(s.toString());
            }
        }
        if(result.isEmpty()){
            return "/";
        }
        String a = "";
        while(!result.isEmpty()){
            a = "/" + result.pop() + a;
        }
        return a;
    }
}
