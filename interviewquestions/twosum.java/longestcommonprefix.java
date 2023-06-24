class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);  
        String a = strs[0];
        String b = strs[n-1];
        String oe = "";
        for(int i = 0;i < a.length();i++)
        {
           if(a.charAt(i) == b.charAt(i))
           {
              oe += a.charAt(i);
           }
           else
           {
               break;
           }
        }
        return oe;
    }
}