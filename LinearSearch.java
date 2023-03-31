import java.util.Scanner;
class Linear{
    void display(int n, int arr[],int item){
        int pos = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==item){
                pos = i+1;
                break;

            }
        }
        if(pos==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Enter the position: "+pos);
        }
    }
}

public class LinearSearch{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[45];
        System.out.println("Enter the size of an array:  ");
        int n = in.nextInt();
        System.out.println("Enter all array elements:  ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the search item:   ");
        int item = in.nextInt();
        in.close();
        Linear obj = new Linear();
        obj.display(n, arr,item);


    }
}

