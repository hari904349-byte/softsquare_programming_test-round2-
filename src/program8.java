
// print pattern
/*
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25

*/
public class program8 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2!=0){
                    System.out.print(++count+" ");

                }else{
                    System.out.print(count+" ");
                    count--;
                }
            }
            count+=n;
            System.out.println();
        }
    }
}
