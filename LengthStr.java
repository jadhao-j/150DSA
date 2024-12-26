
// import java.util.Scanner;

// public class LengthStr {
//     int solution(String str){
//         int len=0;
//         for(int i=0; i<str.toCharArray().length;i++){
//             len++;
//         }
//         return len;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String");
//         String x = sc.next();
//         LengthStr s1 = new LengthStr();
//         System.out.println("Length of String is : "+s1.solution(x));
//     }
    


import com.sun.jdi.event.StepEvent;
import java.util.Scanner;

public class LengthStr {
    int solution(String str){
        int i=0;
        try{
        
        while(true){
            str.charAt(i);
            i++;
        }
    }catch(IndexOutOfBoundsException e){
        return i;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String x = sc.next();
        LengthStr s1 = new LengthStr();
        System.out.println("Length of String is : "+s1.solution(x));
    }
    
}
