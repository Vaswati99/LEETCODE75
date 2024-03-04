class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int i=0;
        int j=0;
        while(i<word1.length() & j<word2.length())
        {
            str=str+word1.charAt(i);
            str=str+word2.charAt(j);
            i++;
            j++;
        }
        if(word1.length()>word2.length())
        {
            str=str+word1.substring(i);
        }
        else
        {
            str=str+word2.substring(i);
        }

        return str;
    }
}
