import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LargestMagical {

    public static String largestMagical(String binString) {
        int count = 0, i = 0;
        List<String> result = new ArrayList<String>();
        for (int j = 0; j < binString.length(); ++j) {
          if (binString.charAt(j) == '1') count++;
          else count--;
          if (count == 0) {
            result.add('1' + largestMagical(binString.substring(i + 1, j)) + '0');
            i = j + 1;
          }
        }
        Collections.sort(result, Collections.reverseOrder());
        return String.join("", result);
    }

    public static void main(String[] args) {

    }

}