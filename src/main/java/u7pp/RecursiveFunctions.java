package u7pp;

public class RecursiveFunctions {
    
    public static double factorial(int n){
        double d = n;
        if (d == 0.0 || d == 1.0){
            return 1.0;
        }
        return n * factorial(n - 1);
    }

    public static double pow (double b, int p){
        if (p == 0){
            return 1;
        }
        if (p == 1){
            return b;
        }
        return b * pow(b, p-1);
    }    

    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }  
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static boolean isPalindrome(String s){
        if (s.length() == 1 || s.length() == 0){
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length()-1)){
            String temp = s.substring(1,s.length()-1);
            return isPalindrome(temp);
        }
        else{
            return false;
        }
    }

    public static int nextIsDouble(int[] data, int n){
        if (n == data.length-1 || n == data.length){
            return n;
        }
        if (data[n] * 2 == data[n+1]){
            ;
        }
        return nextIsDouble(data, n+1);
    }


    public static String getBinary(int num){
        if(num == 0){
            return "0";
        }
        if(num == 1){
            return "1";
        }
        else{
            return(getBinary(num / 2) + Integer.toString(num % 2));
        }    
    }

    public static int binarySearch(int arr[], int n, int l, int r){

        //check if boundaries even in bounds
        if (r >= l && l <= arr.length - 1) {
 
            int mid = l + (r - l) / 2;
 
            if (arr[mid] == n){
                return mid;
            }
            if (arr[mid] > n){
                return binarySearch(arr, n, l, mid - 1);
            }
            return binarySearch(arr, n, mid + 1, r);
        }

        return -1;
    }
 



    public static void main(String[] args) {
        System.out.println(isPalindrome("abBa"));
    }

}