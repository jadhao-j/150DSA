import java.util.Scanner;

public class LCM { public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a first number: ");
    int x=sc.nextInt();
    System.out.print("enter a second number: ");
    int y=sc.nextInt();
    int h=1;
    for (int i =2; i < x && i < y; i++) {
        if(x%i==0 && y%i==0){
            h=i;
        }
    }
    int lcm=x*y/h;
    System.out.println("least common multiplier  " +lcm);
}
}
    

