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
