public class PrintEvenWords {
    public static void main(String[] args) {
        String sentence="This is a wonderful day";
        String[] splitStr=sentence.split(" ");
        for(String el:splitStr){
            if(el.length()%2==0){
                System.out.println(el);
            }
        }
    }
}
