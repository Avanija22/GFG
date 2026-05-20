class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum = 0;
        while(n != 0){
            int digits = n % 10;
            sum = sum + digits;
            n = n/10;
        }
        return sum;
    }
}
