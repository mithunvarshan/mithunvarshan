class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String st[]=s.split(" ");
       for(int i=0;i<st.length;i++){
          String m=st[i];
          for(int j=m.length()-1;j>=0;j--){
            sb.append(m.charAt(j));
          }
          sb.append(" ");
       }

       return sb.toString().trim();
    }
}