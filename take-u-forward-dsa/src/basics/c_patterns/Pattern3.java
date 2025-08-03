package basics.c_patterns;

/*
    1
    12
    123
    1234
    12345
*/
public class Pattern3 {
    public static void main(String[] args) {
        Pattern3 pattern = new Pattern3();
        pattern.pattern3(5);
    }

    public void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
