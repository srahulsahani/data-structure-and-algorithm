package basics.f_basic_math;

public class CountAllDigitsOfNumber {

    public static void main(String[] args) {
        CountAllDigitsOfNumber countAllDigitsOfNumber = new CountAllDigitsOfNumber();
        int num = countAllDigitsOfNumber.countDigit(1234567);
        System.out.println("Total Digits : " + num);
    }

    public int countDigit(int n) {
        if(n==0) return 1;
        int digitCount = 0;
        while(n>0){
            n = n/10;
            digitCount++;
        }
        return digitCount;
    }
}
