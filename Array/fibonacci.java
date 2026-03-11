// Iterative
class Solution 
{
    public int fib(int n) {
        int a=0,b=1;
        for(int i =0;i<n;i++)
        {
            int temp = b ;
            b = a+b;
            a = temp;
        }
        return a;

    }
}

// Recursion
class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
