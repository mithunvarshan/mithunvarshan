class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>st=new Stack<>();
        StringBuilder sb =new StringBuilder();
         int right=0;
        for(int i=0;i<word.length();i++){
             if(word.charAt(i)==ch){
                    right=i;
                    break;
             }
        }
        sb.append(word.substring(0,right+1));
        sb.reverse();
        sb.append(word.substring(right+1,word.length()));
        return sb.toString();
    }
}