class Solution {
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(String str : ops){
            char score = str.charAt(0);
            if(score == 'C'){
                sum -= stack.pop();
            }else if(score == '+'){
                int temp = stack.pop();
                int plus = temp + stack.peek();
                stack.push(temp);
                stack.push(plus);
                sum += plus;
            }else if(score == 'D'){
                stack.push(2 * stack.peek());
                sum += stack.peek();
            }else{
                int k = Integer.parseInt(str);
                stack.push(k);
                sum += stack.peek();
            }
        }
        return sum;
    }
}
