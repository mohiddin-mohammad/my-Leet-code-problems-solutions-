class Solution {
    public String longestCommonPrefix(String[] strs) {
        
      StringBuilder CommonPrefix = new StringBuilder();
        Arrays.sort(strs);
        String First=strs[0];
        String Last=strs[strs.length-1];
        System.out.println(First+" "+Last);
        int min=Math.min(First.length(),Last.length());
        for(int i=0;i<min;i++)
        {
            if(First.charAt(i)!= Last.charAt(i))
                break;
            else
                CommonPrefix.append(First.charAt(i));
        }
        if(!CommonPrefix.isEmpty())
            return CommonPrefix.toString();
        else
            return "";
    }
}
