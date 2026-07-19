package basics.f_basic_math;

public class CountNumberOfOddDigits {
    public static void main(String[] args) {
        CountNumberOfOddDigits countNumberOfOddDigits = new CountNumberOfOddDigits();
        int oddDigits = countNumberOfOddDigits.countOddDigit(123475);
        System.out.println("Total Odd Digits: " + oddDigits);
    }

    public int countOddDigit(int n) {
        int countOdd = 0;
        while(n>0){
            int lastDigit = n%10;
            if(lastDigit % 2 == 1){
                countOdd++;
            }
            n = n/10;
        }
        return countOdd;
    }
}
