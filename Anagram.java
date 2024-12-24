
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First String : ");
        String S1 = sc.next();
        System.out.print("Enter a Second String : ");
        String S2 = sc.next();
        char c1[] = S1.toCharArray();
        char c2[] = S2.toCharArray();
        if(c1.length != c2.length){
            System.out.println("Not Anagram");
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
            System.out.println("Not Anagram");
             }
        }
        System.out.println("Anagram ");
    
    }
    
}
