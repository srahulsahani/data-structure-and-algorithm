package basics.f_basic_math;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindromeResult = palindromeNumber.isPalindrome(12321);
        System.out.println("Is the given number Palindrome: " + isPalindromeResult);
    }

    public boolean isPalindrome(int n) {
        int reverseNum = reverseNumber(n);
        return (reverseNum == n);

    }

    //Reverse number program
    public int reverseNumber(int n){
        int reversedNumber = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n = n/10;
        }
        return reversedNumber;
    }
}
