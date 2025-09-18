class Solution {
    public String discountPrices(String sentence, int discount) {
        StringBuilder sb=new StringBuilder();
        String []w=sentence.split(" ");
        for(int i=0;i<w.length;i++){
            String s=w[i];
            if(s.charAt(0)=='$'&&s.length()>1){
                boolean number=true;
                for(int j=1;j<s.length();j++){
                    if(!Character.isDigit(s.charAt(j))){
                        number=false;
                        break;
                    }
                }
                if(number){
                    double num=Double.parseDouble(s.substring(1));
                    num=num*(100-discount)/100.0;
                     sb.append("$").append(String.format("%.2f", num));
                }else{
                    sb.append(s);
                }
            }else{
                sb.append(s);
            }
            if(i<w.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}