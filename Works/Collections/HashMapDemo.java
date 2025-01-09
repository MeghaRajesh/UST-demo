import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> phnbk=new HashMap<>();
         phnbk.put("Ram",222222);
         phnbk.put("Priya",155433);

         Set<String> allkeys=phnbk.keySet();
         Iterator<String> itr=allkeys.iterator();
         while(itr.hasNext()){
            String key=itr.next();
            System.out.println(key+" : "+phnbk.get(key));
         }
         //update
         System.out.println("-----------------------");
         phnbk.put("Priya",845568);
         phnbk.forEach((key,value)->System.out.println(key+" : "+phnbk.get(key)));
         System.out.println("-----------------------");
         
         //delete
         phnbk.remove("Priya");
         phnbk.forEach((key,value)->System.out.println(key+" : "+phnbk.get(key)));

    }
    
}
