package basics.c_patterns;

/*
     *****
     *****
     *****
     *****
     *****
*/
public class Pattern1 {
    public static void main(String[] args) {
        Pattern1 pattern = new Pattern1();
        pattern.pattern1(5);
    }

    public void pattern1(int n) {
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
