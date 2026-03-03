public class PatternBannerApp {

    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap getCharacterPattern(char ch) {

        switch (ch) {

            case 'O':
                return new CharacterPatternMap('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                });

            case 'P':
                return new CharacterPatternMap('P', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        "*      ",
                        "*      ",
                        "*      "
                });

            case 'S':
                return new CharacterPatternMap('S', new String[]{
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                });

            default:
                return null;
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        CharacterPatternMap[] patterns = new CharacterPatternMap[word.length()];

        for (int i = 0; i < word.length(); i++) {
            patterns[i] = getCharacterPattern(word.charAt(i));
        }

        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                sb.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }
}