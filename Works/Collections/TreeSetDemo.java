
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<String> allCountries=new TreeSet<>();
        allCountries.add("India");
        allCountries.add("SriLanka");
        allCountries.add("China");
        allCountries.add("Pakisthan");
        allCountries.add("India");

        allCountries.forEach((country)->System.out.println(country));
        System.out.println("-----------------------");
        SortedSet<String> allColors=new TreeSet<>((c1,c2)->c2.compareTo(c1));
        allColors.add("Red");
        allColors.add("Blue");
        allColors.add("Yellow");
        allColors.add("Green");
        
        allColors.forEach((color)->System.out.println(color));
        
    }
    
}
