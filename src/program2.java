
// print pattern in the format

/*
$
X$
X$X
$X$X
$X$X$

*/
public class program2 {

    public static void main(String[] args) {
        int n=5;
        char a='$';
        char b='X';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a);

                char temp=a;
                a=b;
                b=temp;
            }
            System.out.println();
        }
    }
}
