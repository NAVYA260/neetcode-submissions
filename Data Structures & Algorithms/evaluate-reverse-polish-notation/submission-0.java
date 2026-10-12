class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s:tokens) {
            if (!s.equals("+") && !s.equals("-") &&
                !s.equals("*") && !s.equals("/")) {
                st.push(Integer.parseInt(s));
            } else{
                int ele1 = st.pop();
                int ele2 = st.pop();
                if(s.equals("+")) st.push(ele2+ele1);
                else if(s.equals("-")) st.push(ele2-ele1);
                else if(s.equals("*")) st.push(ele2*ele1);
                else st.push(ele2/ele1);
            }
        }
        return st.peek();
    }
}
