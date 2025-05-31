//valid palindrome

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = s.toCharArray();
        int end = charArray.length-1;
        boolean isPalindrome=true;
        for(int i=0;i<charArray.length/2;i++)
        {
            if(charArray[i]!=charArray[end])
            {
                isPalindrome=false;
                break;
            }
            end--;
        }
    return isPalindrome;
        
    }
}
