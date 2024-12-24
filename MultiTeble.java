import java.util.Scanner;

public class MultiTeble {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the Table Digit :");
    int x=sc.nextInt();
    for(int i=1;i<=5;i++){
    int mul=x*i;
    System.out.println(x+"X"+i+"="+mul);
}
}
    
}
