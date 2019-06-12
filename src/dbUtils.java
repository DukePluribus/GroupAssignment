import java.io.InputStream;

import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.*;

public class dbUtils {
   /* public static String getJSONStringFromFile(String path){
        Scanner scanner;
        InputStream in=inputStreamFromFile(path);
        scanner=new Scanner(in);
        String json=scanner.useDelimiter("\\Z").next();
        scanner.close();
        return json;
    }
    public static JSONObject getJSONObjectFromFile(String path){
        return new JSONObject(getJSONStringFromFile(path);
    }
    public static boolean objectExists(JSONObject jsonObjects, String key){
        Object o;
        try{
            o= jsonObjects.get(key);
        }
        catch(Exception e){
            return false;
        }
        return o!=null;
    }*/
}
