// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int digits = 0;
        int sum = 0;
        
        while(temp != 0){
            digits++;
            temp = temp/10;
        }
        temp = n;
        
        while(temp != 0){
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp/10;
        }
        return sum == n;
    }
}