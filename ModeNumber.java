import java.util.Arrays;
import java.util.Scanner;

public class ModeNumber {
    int solution(int arr[]){
        Arrays.sort(arr);
        int count=1;
        int maxcount=1;
        int mostfreq=arr[0];
        for( int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else {
                count = 1;
            }
            if(count>maxcount){
                maxcount=count;
                mostfreq=arr[i];
            
            }  
        }
        return mostfreq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int x = sc.nextInt();
        System.out.println("enter a Array element : ");
        int  a[]= new int[x];
        for(int i = 0; i<x ; i++){
            a[i]=sc.nextInt();

        }
        ModeNumber s1 = new ModeNumber();
        System.out.println("most Frequent number is : "+s1.solution(a));

        
    }
    
}
