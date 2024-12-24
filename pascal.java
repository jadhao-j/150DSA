import java.util.Scanner;
public class pascal{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number of Row : ");
    int r =sc.nextInt();
    
    for(int i =0 ;  i<=r ; i++){
        int num=1;
        for(int j=0;j<=i;j++){
            System.out.print(num+" ");
            num=num*(i-j)/(j+1);
        }
        System.out.println();
    }  
}

}
