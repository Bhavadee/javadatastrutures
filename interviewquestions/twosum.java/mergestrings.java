//mergingstring
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String newword = "";
        int min=Math.min(word1.length(),word2.length());
        if(min == word1.length()){
        for(int i = 0;i< min;i++)
        {
            newword += word1.charAt(i);
            newword +=  word2.charAt(i);
        }
         newword +=  word2.substring(word1.length());
        }
        else{
             for(int i = 0;i< min;i++)
        {
            newword += word1.charAt(i);
            newword +=  word2.charAt(i);
        }
         newword +=  word1.substring(word2.length());
        }
        return newword;

    }
}