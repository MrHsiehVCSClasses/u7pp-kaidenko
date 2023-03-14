package u7pp;

public class RecursiveFunctions {
    
    public static double factorial(int n){
        //change int to double
        double d = n;
        if (d == 0.0 || d == 1.0){
            return 1.0;
        }
        return n * factorial(n - 1);
    }

    public static double pow (double b, int p){
        //power of 0 = 1
        if (p == 0){
            return 1;
        }
        // power of 1 returns number as is
        if (p == 1){
            return b;
        }
        return b * pow(b, p-1);
    }    

    public static int fibonacci(int n){
        //0 and 1 are the first number in the fibonacci sequence
        if (n <= 1){
            return n;
        }  
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static boolean isPalindrome(String s){
        //if only 1 or 0 string left then it is a palindrome
        if (s.length() == 1 || s.length() == 0){
            return true;
        }
        //create new string without the first and last term
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
            return 0;
        }
        if (data[n] * 2 == data[n+1]){
            return (nextIsDouble(data, n + 1) +1);
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
 
    public static boolean canFlowOffMap(int[][] map, int row, int col){

        //if can go out of bounds return true
        if(row == map.length-1 || col == map[0].length-1 || row == 0 || col == 0){
            return true;
        }
        //recursion with changed location

        boolean upResult = false;
        boolean downResult = false;
        boolean leftResult = false; 
        boolean rightResult = false;

        //left
        if (map[row][col] > map[row][col-1]){
            leftResult = canFlowOffMap(map, row, col - 1);
        }

        //right
        if (map[row][col] > map[row][col+1]){
            rightResult = canFlowOffMap(map, row, col + 1);
        }

        //up
        if (map[row][col] > map[row-1][col]){
            upResult = canFlowOffMap(map, row - 1, col);
        }

        //down
        if (map[row][col] > map[row+1][col]){
            downResult = canFlowOffMap(map, row + 1, col);
        }

        if (upResult == true || downResult == true || leftResult == true || rightResult == true){
            return true;
        }
        else{
            return false;
        }
    }

}