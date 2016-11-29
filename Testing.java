import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;


public class Testing {

    final private static String public_url = "http://lyle.smu.edu/~prestont/" +
            "3342/dataService.php";
    private static String setIdKeyVal(String id, String key, String val) {
        return readFromUrl(public_url + "?id=" + id + "&key=" + key +
                "&val=" + val);
    }
    private static String getIdKey(String id, String key) {
        return readFromUrl(public_url + "?id=" + id + "&key=" + key);
    }
    private static String getId(String id) {
        return readFromUrl(public_url + "?id=" + id);
    }
    private static String getDatabase() {
        return readFromUrl(public_url);
    }
    private static String readFromUrl(String url) {
        try {
            InputStream is = new URL(url).openStream();
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(is, Charset.forName("UTF-8")));
            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = rd.read()) != -1) {
                sb.append((char) cp);
            }
            return sb.toString();
        }catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
            return "";
        }
    }
    public static void main(String[] args) {
        String json;

        json = setIdKeyVal("r2d2","name","rollo");
        System.out.println(json);

        json = getIdKey("r2d2","name");
        System.out.println(json);

        json = getId("r2d2");
        System.out.println(json);

        json = getDatabase();
        System.out.println(json);
    }
}