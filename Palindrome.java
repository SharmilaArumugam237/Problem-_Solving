//to find whether a number is palindrome or not
public class Palindrome{
    public static void main(String argms[]){
        int x=111;
        System.out.println(isPalindrome(x));
    }
    //function to check whethe a num is palindrome or not
    static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        String num = x + " ";
        return checkPalindrome(num);
    }
    
    static boolean checkPalindrome(String num){
        int left=0;
        int right = num.length() -1;
        while(left < right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}