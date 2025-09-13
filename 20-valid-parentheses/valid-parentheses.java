class Solution {
    public boolean isValid(String s) {
     /*   String prev="";
        while(!s.equals(prev)){
            prev=s;
          s=  s.replace("()","");
          s=  s.replace("[]","");
           s= s.replace("{}","");
        }
        return s.isEmpty();*/
        Stack<Character>para=new Stack<>();
        boolean isvalid=true;
        char[]paran=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch=paran[i];
            if(ch=='['||ch=='{'||ch=='('){
                para.push(ch);
            }
            else if(ch==']'||ch=='}'||ch==')'){
                if(para.isEmpty()){
                    isvalid=false;
                    break;
                 } char last=para.pop();
                if(ch==')'&& last=='('|| ch==']' && last=='[' || ch=='}'&& last=='{'){
                  isvalid=true;
                }else{
                    isvalid=false;
                    break;
                }
            }
        }
        return isvalid && para.isEmpty();
    }
}

