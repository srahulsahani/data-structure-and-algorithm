package basics.f_basic_math;

public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        int oddDigits = reverseNumber.reverseNumber(123475);
        System.out.println("Reverse of given number : " + oddDigits);
    }

    public int reverseNumber(int n) {
        int reversedNumber = 0;
        while(n>0){
            int lastDigit = n%10;
            reversedNumber = reversedNumber*10 + lastDigit;
            n = n/10;
        }
        return reversedNumber;
    }
}
