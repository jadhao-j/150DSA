import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class PerfectSquares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x = sc.nextInt();
        int i=1;
        int com=1;
        while(i<x){
            com=i*i;
            if(com==x){
                System.err.print("True");
                System.exit(0);
            }
            i++;
        }
        System.out.println("False");
    
    }
}
