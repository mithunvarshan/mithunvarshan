class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
     Set<Character>map=new HashSet<>();
     for(int i=0;i<brokenLetters.length();i++){
        map.add(brokenLetters.charAt(i));
     }
     int count=0,con=1;
     String []words=text.split(" ");
     for(int i=0;i<words.length;i++){
        String word=words[i];
        for(int j=0;j<word.length();j++){
            if(map.contains(word.charAt(j))){
                con=1;
                break;
            }else{
                con=0;
            }
        }
        if(con==0)count+=1;
     }
     return count;
    }
}