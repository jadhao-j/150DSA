import java.util.Scanner;
class pelindrome{
    public static void main(String[] args) {
        Scanner str= new Scanner(System.in);
        System.out.print("enter the String ");
        String x =str.next();
        String org=x;
        String rev="";
        for(int i=x.length()-1;i>=0;--i){
            rev=rev+x.charAt(i);
        }if(org.equals(rev)){
        System.out.println(rev+" pelinderome");
        }
        else{
            System.out.println(rev+" Not pelindrome");
        }
    }
}

// class pelindrome{
//     public static void main(String[] args) {
        
//     String x="RADAR";
//     int i=0;
//     int j=x.length()-1;
//     while(i>j){
//         if(x.charAt(i)!=x.charAt(j)){
//             System.out.println("Not Pelindrome");
//             System.exit(0);
//         }
//         i++;
//         j--;
//     }
//     System.out.println("Pelindrome");
// }
// }