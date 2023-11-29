package vladyslav.goit;

public class Convector {

    public StringBuilder convert(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % 2 == 1) {
                c = Character.toUpperCase(c);
                result.append(c);
            } else {
                result.append(c);
            }
        }
        return result;
    }
}
