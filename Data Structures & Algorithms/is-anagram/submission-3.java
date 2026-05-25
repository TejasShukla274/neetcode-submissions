class Solution {
    public boolean isAnagram(String s, String t) {
         boolean aa= true;
         if(s.length() != t.length()){  //checked when string are not of the same size
            return false;
         }
        char[] a = new char[s.length()];
        char[] b = new char[t.length()];
         
         for(int i = 0 ; i <s.length();i++){
           a[i]= s.charAt(i);
            b[i]=t.charAt(i);
         }
         Arrays.sort(a);
         Arrays.sort(b);
         for(int i = 0;i<s.length();i++){
           if(a[i]!=b[i]){
            aa= false;
           }
         }
         return aa;


}
}
