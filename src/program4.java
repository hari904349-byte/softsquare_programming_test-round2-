import java.util.Arrays;

// swap greatest odd and smallest even number in array
public class program4 {
    public static void main(String[] args) {
        int arr[]={-12, 89, 33, 9, 2, 4, 6};

        int oddMax=Integer.MIN_VALUE;
        int evenMin=Integer.MAX_VALUE;

        int oddIndex=0, evenIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                if(arr[i]<evenMin){
                    evenMin=arr[i];
                    evenIndex=i;
                }
            }else{
                if(arr[i]>oddMax){
                    oddMax=arr[i];
                    oddIndex=i;
                }
            }
        }

        int temp=arr[evenIndex];
        arr[evenIndex]=arr[oddIndex];
        arr[oddIndex]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
