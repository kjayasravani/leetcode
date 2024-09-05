class Solution {
    public String reverseWords(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= ' '){
                stack.push(s.charAt(i));
            }
            else{
                while(!stack.isEmpty()){
                    result.append(stack.pop());
                }
                result.append(' ');
            }

        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
}