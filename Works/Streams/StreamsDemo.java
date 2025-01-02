
import java.util.ArrayList;
import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(25);
        numbers.add(2);
        numbers.add(10);
        numbers.add(15);

        numbers.stream().forEach((eachNum -> System.out.println(eachNum)));
        numbers
            .stream()
            .map((eachNum)->eachNum*2)
            .forEach((eachNum)->System.out.println(eachNum));
    }
    
}
