
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String inEmail;
        
    }

    /**
     *
     * @param inString
     * @return
     */
    public static boolean emailCheck(String inEmail) {
        Pattern p = Pattern.compile("[a-z] | 0-9][@] [a-z | 0-9] [.]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("inEmail");
        boolean valid = m.find();
        
        return valid;
       


    }
}
