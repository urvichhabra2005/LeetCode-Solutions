// optimal palindrome number check
// reverse only half the number and check with the remaining number.
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0|| (x%10==0 & x!=0))  //a number ending with 0 is never a palindrome.
            return false;
        int rev =0;
        while(x>rev)
        {
            rev = (rev*10)+(x%10);
            x/=10;
        }
      // x==rev/10 for a number having odd digits
        return x==rev|| x== rev/10;
    }
}
