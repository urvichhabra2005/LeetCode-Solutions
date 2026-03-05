// Brute force 
// t - O(n), s - O(1)
class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
         String clear="";
         for(int i =0;i<s.length();i++)
         {
            char ch = s.charAt(i);
            if(Character.isDigit(ch) || Character.isLetter(ch))
            {
               clear = clear+ch;
            }
         }
         String str="";
         for(int i =0;i<clear.length();i++)
         {
            char ch = clear.charAt(i);
            str=ch+str;
         }
         return clear.equals(str);
         
    }
}


// 2-pointer approach -optimal
// t - O(n), s - O(1)
  class Solution {
    public boolean isPalindrome(String s) {
         int left=0, right = s.length()-1;
         s=s.toLowerCase();
         while(left<right)
         {

            while(!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while(!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;    
        }         
        return true;
    }
}
