package basics.patterns_3;

/*
    1
    22
    333
    4444
    55555
*/
public class Pattern4 {
    public static void main(String[] args) {
        Pattern4 pattern = new Pattern4();
        pattern.pattern4(5);
    }

    public void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
