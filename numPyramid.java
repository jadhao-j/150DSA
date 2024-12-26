import java.util.Scanner;

public class numPyramid {
    void solution(int row ){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter Row :");
        r=sc.nextInt();
        numPyramid s1 = new numPyramid();
        s1.solution(r);
        
    }
    
}
