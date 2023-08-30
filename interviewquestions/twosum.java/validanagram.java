class Solution {
    public boolean isAnagram(String s, String t) {
         char[] sC = s.toCharArray();
        char[] tC = t.toCharArray();

        Arrays.sort(sC);
        Arrays.sort(tC);
        return Arrays.equals(sC,tC);
    }
}