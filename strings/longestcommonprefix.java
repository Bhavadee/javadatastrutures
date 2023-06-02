class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[n-1];
       int x = a.length();
       
        String ou = "";
        
        for(int i = 0;i < x;i++)
        {
            if(a.charAt(i) == b.charAt(i))
            {
                ou = ou + a.charAt(i);
            }
            else
            {
                break;
            }
        }
        return ou;
        
    }
}