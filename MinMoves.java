import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMoves {

    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        int ar1[] = arr1.stream().mapToInt(Integer::intValue).toArray();
        int ar2[] = arr2.stream().mapToInt(Integer::intValue).toArray();
        
        int aLength = ar1.length;
		int result = 0;
		for (int i = 0; i < aLength; i++) {
			String arr1Str = String.valueOf(ar1[i]);
			String arr2Str = String.valueOf(ar2[i]);
			for (int j = 0; j < arr1Str.length(); j++) {
				int aValue = Integer.parseInt(Character.toString(arr1Str.charAt(j)));
				int bValue = Integer.parseInt(Character.toString(arr2Str.charAt(j)));
				if (aValue > bValue) {
					result += aValue - bValue;
				} else {
					result += bValue - aValue;
				}
			}
		}
		return result;
    }

    

    public static void main(String[] args) {

    }
}