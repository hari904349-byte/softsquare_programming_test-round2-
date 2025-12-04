// convert the interger to array
// print mid value when it is odd else print mid+mid-1

import java.util.Arrays;

public class program7 {

    public static void main(String[] args) {
        int n=123892;
        int temp=n;
        int size=0;
        while (n>0){
            size++;
            n/=10;
        }
        int length=size;
        n=temp;
        int arr[]=new int[size];
        while (n>0){
            arr[size-1]=n%10;
            size--;
            n/=10;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(length%2==0?arr[length/2]+arr[length/2-1]:arr[length/2]);
    }
}
