import java.util.Scanner;
class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String : ");
        String x = sc.next();
        String rev="";
        for (int i = x.length()-1;i>=0;--i){
            rev=rev+x.charAt(i);
        }
        System.out.println(rev);
    }
}