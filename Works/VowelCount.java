import java.util.Scanner;
public class VowelCount {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter");
        String num =sc.next();
        sc.close();
        char lowest='u';
        int v =0,c =0;
        String n =num.toLowerCase();

        for (int i =0;i <n.length();i++) {
            if (Character.isLetter(n.charAt(i))) {
                if (n.charAt(i) =='a' ||n.charAt(i) =='e' ||n.charAt(i) =='i' ||n.charAt(i)=='o' ||n.charAt(i) =='u') {
                    v++;
                    if((int)n.charAt(i)<(int)lowest){
                        lowest=n.charAt(i);
                    }
                }
                else {
                    c++;
                    System.out.print(n.charAt(i));

                }
            }
        }if (v >0 ||c >0) {
            System.out.println();
            System.out.println("Number of Vowels: " +v);
            System.out.println("Number of Consonants: " +c);
        }
        else {System.out.println("NA");
        }

        System.out.println("Lowest : "+lowest);
    }
}


