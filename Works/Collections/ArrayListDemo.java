import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo{
    public static void main(String [] args){
        List<String> allCities=new ArrayList<>();
        allCities.add("Chennai");
        allCities.add("Mumbai");
        allCities.add("Pune");
        allCities.add("Kolkata");
        //Read
        for (int i = 0; i < allCities.size(); i++) {
            System.out.println(allCities.get(i));
        }
        System.err.println("-------------------------");
        //Update
        int index=allCities.indexOf("Kolkata");
        allCities.set(index, "Kochi");
        for (int i = 0; i < allCities.size(); i++) {
            System.out.println(allCities.get(i));
        }
        System.out.println("-------------------------");
        //Delete
        allCities.remove("Pune");
        allCities.forEach((eachCity)->System.err.println(eachCity));
    }
}