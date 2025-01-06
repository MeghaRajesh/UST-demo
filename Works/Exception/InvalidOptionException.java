
public class InvalidOptionException extends Exception{
    int option;
    public InvalidOptionException(int option){
        this.option=option;
    }
    @Override
    public String getMessage(){
        return "Option "+ option +" is an invalid option";
    }
}
