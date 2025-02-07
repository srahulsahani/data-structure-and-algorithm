package basics.patterns_3;

/*
    12345
    1234
    123
    12
    1
*/
public class Pattern6 {
    public static void main(String[] args) {
        Pattern6 pattern = new Pattern6();
        pattern.pattern6(5);
    }

    public void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
