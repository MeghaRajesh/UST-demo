import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int re=num%10;
            sum+=re;
            num=num/10;
        }
        if(sum%3==0){
           System.out.println("Truw");

        }
        else{
            System.out.println("False");
        }
    }
}
