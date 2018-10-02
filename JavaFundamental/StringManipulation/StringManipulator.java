public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        str1 = str1.trim();
        str2 = str2.trim();
        return str1.concat(str2);
    }

    public Integer getIndexOrNull(String sentence, char letter) {
        Integer output;
        output = sentence.indexOf(letter);
        if (output == -1) {
            output = null;
        }
        return output;
    }

    public Integer getIndexOrNull(String sentence, String letter) {
        Integer output;
        output = sentence.indexOf(letter);
        if (output == -1) {
            output = null;
        }
        return output;
    }

    public String concatSubstring(String str1, int start, int end, String str2) {
        str1 = str1.substring(start, end);
        return str1.concat(str2);
    }
}