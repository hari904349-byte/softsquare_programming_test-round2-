
// the left top element are 0 to anti diagonal shift the value to


public class program1 {

    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]={{0, 0, 0, 2}, {0, 0, 1, 2}, {0, 1, 2, 3},{1, 2, 3, 4}};

        display(arr);
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                arr[i][j]=arr[n-i-1][n-j-1];
            }

        }
        display(arr);
    }
}
