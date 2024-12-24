import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x =s1.nextInt();
        int sum =1 ;
        int i=x;
        while(i>0){
            sum= sum*i;
            --i;
        }
        System.out.println("sum of factorial: "+sum);
    }
    
}
