import java.util.Scanner;

class Binary{
    void display(int n, int arr[], int item){
        int pos=-1;
        int beg = 0, end = n-1,mid;
    
        while(beg<=end){
            mid = (beg+end)/2;
            if(arr[mid]==item){
                pos = mid;
                System.out.println("Enter the position is:   "+pos+1);
                break;
            }
            else if(item>mid){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
    }
}



public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//create obj input from user.
        int arr[] = new int[100];
        System.out.println("Enter the size of an array:   ");
        int n = in.nextInt();
        System.out.println("Enter all array elements:   ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter search item:   ");
        int item = in.nextInt();
        in.close();
        Binary obj = new Binary();
        obj.display(n,arr, item);
    }
}
