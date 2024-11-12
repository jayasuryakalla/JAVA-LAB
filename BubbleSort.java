public class BubbleSort {
    public static void main(String []args){
        int arr[]={32,43,12,2,4,12,49,27,7,0};
        System.out.print("Befor sorting: ");
        for (int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nAfter sorting: ");
        for (int i=0;i<10;i++){
            for (int j=0;j<10-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
