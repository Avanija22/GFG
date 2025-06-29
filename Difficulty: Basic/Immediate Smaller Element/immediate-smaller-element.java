//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().immediateSmaller(arr);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        // code here
        Stack<Integer>s=new Stack<>();
        s.push(-1);
        for(int i=arr.length -1; i>=0;i--){
            if(s.peek()<arr[i]){
                int temp=s.peek();
                s.push(arr[i]);
                arr[i]=temp;
            }else{
                s.push(arr[i]);
                arr[i]=-1;
            }
        }
        
    }
}