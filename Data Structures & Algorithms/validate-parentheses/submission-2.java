class Solution {
    public boolean isValid(String s) {
        Stack<Character> st1 = new Stack<>();
        for(char ch:s.toCharArray()) {
            if(ch=='('||ch=='['||ch=='{') {
                st1.add(ch);
            }else if(st1.isEmpty()) return false;
            else if(ch=='}' && st1.peek()!='{') return false;
            else if(ch==')' && st1.peek()!='(') return false;
            else if(ch==']' && st1.peek()!='[') return false;
            else st1.pop();
        }
        return st1.isEmpty();
    }
}
