class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1)
            return s;
        StringBuilder strBuilder = new StringBuilder();
        int borderRowStep=2*numRows-2;
        for(int i=0;i<numRows;i++){
            if(i==0 || i==numRows-1){
                for(int j=i;j<s.length();j=j+borderRowStep){
                    strBuilder.append(s.charAt(j));
                }
            }
            else{
                int j=i;
                boolean flag=true;
                int insideRowLargeStep=2*(numRows -1 -i);
                int insideRowSmallStep=borderRowStep-insideRowLargeStep;
                while(j<s.length()){
                    strBuilder.append(s.charAt(j));
                    if(flag)
                        j=j+insideRowLargeStep;
                    else
                        j=j+insideRowSmallStep;
                    flag=!flag;
                }
            }
        }
        return strBuilder.toString();
    }
}