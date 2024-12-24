
import java.util.Scanner;

class SequenceMiss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an array element : ");
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int sum1=0;
        for(int i=0;i<x;i++){
            sum1=sum1+arr[i];
            }
            int sum2=0;
        for(int i=1;i<=x+1;i++) {
            sum2=sum2+i;
        }
        int miss=sum2-sum1;
        System.out.println("Missing Numbers in a Sequence "+miss);
        }
    }

