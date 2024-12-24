
import java.util.*;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in array : ");
        int x=sc.nextInt();
        int[] arr = new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(x%2!=0){
            int index = x/2;
            System.out.println("median is : "+arr[index]); 
        }
        else{
            int index = x/2;
            double num = (arr[index]+arr[index-1])/2;
            System.out.println("median is : " +num);
        }
    }
    
}
