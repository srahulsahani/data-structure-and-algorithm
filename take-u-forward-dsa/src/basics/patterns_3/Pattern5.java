package basics.patterns_3;

/*
     *****
     ****
     ***
     **
     *
*/
public class Pattern5 {
    public static void main(String[] args) {
        Pattern5 pattern = new Pattern5();
        pattern.pattern5(5);
    }

    public void pattern5(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
