class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        List<Character>list=new ArrayList<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
              list.add(ch);
              sb.append(' ');  
            }else{
                sb.append(ch);
            }
        }
        Collections.sort(list);
        int k=0;
           for(int i=0;i<s.length();i++){
             if(sb.charAt(i)==' '){
                sb.setCharAt(i,list.get(k++));
             }
        }
        return sb.toString();
    }
}