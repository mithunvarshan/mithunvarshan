class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        StringBuilder alter=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='-'){
                sb.append(Character.toUpperCase(s.charAt(i)));
        }
        }
        System.out.print(sb.toString());
        int count=0;
        for(int i=sb.length()-1;i>=0;i--){
            alter.append(sb.charAt(i));
            count++;
            if(count==k&&i!=0){
                alter.append('-');
                count=0;
            }
            
        }
        return alter.reverse().toString();
    }
}