import java.util.Scanner;
public class vyanjan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String x=sc.nextLine();
        int swar=0;
        int vyanjan=0;
        for(int i=0;i<=x.length()-1;i++){
            char ch=x.charAt(i);
            if (ch>='a' && ch<='z') {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    swar++;
                }else{
                    vyanjan++;
                }
                
            }
           
        }
        System.out.println("vowels:"+swar);
        System.out.println("Consonants: " +vyanjan);

    }
}
