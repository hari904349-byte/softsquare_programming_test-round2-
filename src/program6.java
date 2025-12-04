// in 2 d matrix outer sum and inner sum

public class program6 {

    public static void main(String[] args) {
        int arr[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int innersum=0, outersum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0 || j==0 || i==arr.length-1 || j==arr[i].length-1){
                    outersum+=arr[i][j];
                }else{
                    innersum+=arr[i][j];
                }
            }
        }
        System.out.println("Inner sum "+innersum);
        System.out.println("Outer sum "+outersum);
    }
}
