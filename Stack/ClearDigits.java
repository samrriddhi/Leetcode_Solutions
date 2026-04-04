class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        for(char ch:st){
            result.append(ch);
        }
        return result.toString();
    }
}