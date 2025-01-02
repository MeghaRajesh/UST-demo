
import java.util.List;

public class StreamsDemo2 {
    public static void main(String[] args) {
        List<String> cities =List.of("Chennai","Mumbai","Pune","Kolkata");

        //convert to uppercase and store in another collection
        List<String> transformedCities=cities
                                        .stream()
                                        .map((eachCity)->eachCity.toUpperCase())
                                        .toList();
        transformedCities.stream()
        .forEach((city)->System.out.println(city));
        System.out.println("--------------------------------");
        //filter cities starting with 'c'
        cities
            .stream()
            .filter((eachCity)->eachCity.startsWith("c") || eachCity.startsWith("C"))
            .forEach((city)->System.out.println(city));

        System.out.println("--------------------------------");

        //sort
        cities.stream().sorted().forEach((city)->System.out.println(city));
        System.out.println("--------------------------------");

        //count of cities

        long noOfCities=cities.stream().count();
        System.out.println(noOfCities);

    }
    
}
