package Assignment5;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class question4a {

    public static void main(String[] args) {
        
            HashMap<String, String> Obj = new HashMap<>();

            Obj.put("Soumyadeep","SDE1");
            Obj.put("Subham","Cloud");
            Obj.put("Arijeet","Tester");
            Obj.put("Prasanjit","SDE2");

           
            for (Map.Entry<String, String> e :Obj.entrySet())
                System.out.println("Key: as NAME:--> " + e.getKey()+" /" + " Value: as dept:--> " + e.getValue());
        }
    }


