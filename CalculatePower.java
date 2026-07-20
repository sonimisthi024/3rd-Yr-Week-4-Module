import java.util.Scanner;
public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the two numbers with space between them:");
        int x=sc.nextInt();
        int y=sc.nextInt();

        long result=1;

        for(int i=1;i<=y;i++){
            result*=x;
        }
        System.out.println(result);
        sc.close();
    }
}
