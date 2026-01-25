class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<numRows){
            return s;
        }
        StringBuilder []row=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            row[i]=new StringBuilder();
        }
        int cur=0;
        boolean isgd=false;
        for(Character c:s.toCharArray()){
            row[cur].append(c);
            if(cur==0 || cur==numRows-1){
                isgd=!isgd;
            }
            cur+=isgd ? 1:-1;

        }
        StringBuilder sb=new StringBuilder();
        for(StringBuilder  c: row){
            sb.append(c);
        }
      return sb.toString();
        
    }
}