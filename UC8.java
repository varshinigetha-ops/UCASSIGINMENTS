import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Method to build and return character pattern map
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for 'O'
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for 'P'
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for 'S'
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    // Method to render banner message
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int height = 5; // each character has 5 rows

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                if (patternMap.containsKey(ch)) {
                    line.append(patternMap.get(ch)[row]);
                    line.append("  "); // space between letters
                }
            }

            System.out.println(line.toString());
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, String[]> characterPatterns = buildCharacterPatterns();

        String word = "OOPS";

        renderBanner(word, characterPatterns);
    }
}