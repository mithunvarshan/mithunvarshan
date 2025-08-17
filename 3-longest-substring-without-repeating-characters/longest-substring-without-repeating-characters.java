class Solution {
    public int lengthOfLongestSubstring(String s) {
      /*   int left=0,maxlen=0;
         HashSet<Character>set=new HashSet<>();
          int n=s.length();
          for(int right=0;right<n;right++){
            char c=s.charAt(right);
                    while(set.contains(c)){
                        set.remove(s.charAt(left));
                        left++;
                    }
                    set.add(c);
                    maxlen=Math.max(maxlen,right-left+1);
          }
          return maxlen;
    }*/
    int left=0,maxlen=0;
    HashSet<Character>list=new HashSet<>();
    for(int right=0;right<s.length();right++){
        char ch=s.charAt(right);
        while(list.contains(ch)){
            list.remove(s.charAt(left));
            left++;
        }
        list.add(ch);
        maxlen=Math.max(maxlen,right-left+1);
    }
    return maxlen;
}
}