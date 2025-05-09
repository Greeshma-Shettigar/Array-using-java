
import java.util.Scanner;

public class linearSearch{
   public static void print(int arr[],int n){
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();
   }
   public static int linearsearch(int arr[],int n,int key){
for(int i=0;i<n;i++){
        if(key==arr[i]){
            return i;
        }
    }
    return -1;
   }
    public static void main(String args[]){
        int key;
        int arr[]=new int[100];
        System.out.println("Enter the array size");
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("Enter elements to array");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
      print(arr,n);
      System.out.println("Enter the element to search");
      key=sc.nextInt();
      int index=linearsearch(arr,n,key);
      if(index==-1){
        System.out.println("Key not found");
      }else{
        System.out.println("Element found at index"+index);
      }

}
}