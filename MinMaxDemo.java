import java.io.*;
import java.util.*;
public class MinMaxDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n(size) :");
        int n=sc.nextInt();
        int arr[];
        arr = new int[n];
        System.out.print("Enter " +n+ " values in the array:");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0],max=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max = "+max+"and min = "+min);
    }
}
