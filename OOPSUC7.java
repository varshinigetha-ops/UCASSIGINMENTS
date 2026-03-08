class CharacterPatternMap  {
    Character character;
    String[] pattern;

    public CharacterPatternMap(Character character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public Character getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OOPSUC7{

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
            "     ",
            "     ",
            "     ",
            "     ",
            "     "
        });

        return maps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int height = charMaps[0].getPattern().length;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}