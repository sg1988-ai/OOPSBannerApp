import java.util.HashMap;
import java.util.Map;

class StringBannerApp {

    // Static method to build and return the character pattern map
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Static method to render banner message
    public static void renderBanner(String message, Map<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}