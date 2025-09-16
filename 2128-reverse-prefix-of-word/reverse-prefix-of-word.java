class Solution {
    public String reversePrefix(String word, char ch) {
       StringBuilder sb=new StringBuilder();
        Stack<Character>st=new Stack<>();
        boolean con=false;
        for(int i=0;i<word.length();i++){
            char w=word.charAt(i);
        if(!con){
               st.push(w);
               if(w==ch){
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                con=true;
               }
        }else{
            sb.append(w);
        }
    }
    if(!con)return word;
    return sb.toString();
}
}