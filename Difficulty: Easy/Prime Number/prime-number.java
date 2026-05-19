class Solution {
    static boolean isPrime(int n) {
        // code here
        int flag = 1;
        for(int i=2;  i<= n/2; i++){
            if(n % i == 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1 && n > 1 ){
            return true;
        }else{
            return false;
        }
    }
}