
import java.util.Scanner;

public class countOfSpecificDigit {
    int count(int num,int digit){
        int count=0;
        while(num>0){
            int rem = num%10;
            if(rem==digit){
                count++;
            }
            num=num/10;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter digit for counting : ");
        int y = sc.nextInt();
        countOfSpecificDigit s1 = new countOfSpecificDigit();
        int result = s1.count(x,y);
        System.out.println(result);

    }
}
