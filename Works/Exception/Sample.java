public class Sample {
    public static void main(String[] args) {
        
        // ArithmeticException ae= new ArithmeticException();
        // throw ae;
        int option=8;
        try{
            if(option<1 || option>5){
                InvalidOptionException ioe=new InvalidOptionException(option);
                throw ioe;
                
            }
        }catch(InvalidOptionException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println("Over");
    }
    
}
