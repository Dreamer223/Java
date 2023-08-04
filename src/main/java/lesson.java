import java.util.*;

public class lesson {
    public static void main(String[] args) {
        countAndPrint(List.of( "1", "2", "2", "4", "3", "1", "4", "5", "2"));
        System.out.println(isIsomorph("abc","abc"));
    }
    private static void countAndPrint(List<String> values)
    {
        Map<String, Integer> stats = new HashMap<>();
        for (String value : values) {
            if (stats.containsKey(value)) {
                Integer oldValue = stats.get(value);
                stats.put(value, oldValue + 1);
            }
            else
            {
                stats.put(value,1);
            }
        }
        System.out.println(stats);
    }
    private static boolean isIsomorph(String first, String second)
    {
        Map<Character,Character> mapping = new HashMap<>();
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        if (firstChars.length != secondChars.length) {
            return false;
        }
        for (int i = 0; i < firstChars.length; i++) {
            char firstChar = firstChars[i];
            char secondChar = secondChars[i];

            if (mapping.containsKey(firstChar))
            {
                Character prevChar = mapping.get(firstChar);
                if (prevChar != secondChar)
                {
                    return false;
                }

            }else
            {
                mapping.put(firstChar,secondChar);
            }
        }
        return true;
    }
}
