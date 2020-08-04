import java.util.regex.Pattern;

/**
 * StrngWords
 */
public class StrngWords {

    static String reverseWords(String inputWords) 
    { 
  
        Pattern pattern = Pattern.compile("\\s"); 
        String[] temp = pattern.split(inputWords); 
        String result = "";  
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
    public static void main(String[] args) {
        
    }
}