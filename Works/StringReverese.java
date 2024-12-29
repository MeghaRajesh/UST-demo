import java.util.Stack;

public class StringReverese {

    public static String reverse(String str){
        char[] reverseStr=new char[str.length()];
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        int j=0;
        while(!stack.isEmpty()){
            reverseStr[j]=stack.pop();
            j++;
        }
        return new String(reverseStr);
    }

    public static void main(String[] args) {
        String str="welcome";
        // StringBuffer sb=new StringBuffer(str);
        // String result=new String(sb.reverse());
        String result=reverse(str);
        System.out.println(result);

    }
}
