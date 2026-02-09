package lab5;

import java.util.regex.Pattern;

public class Lab5 {
    public static void main(String[] args) {
        String text = "This is template text for finding the longest word in it. " +
                "The longest word here is Mythbusters! И вообще, какая бяка эта ваша заливная рыба. Бяка, правда.";
        System.out.println("Результаты первого задания: " + findLongestWord(text));

        String pal1 = "дом мод";
        String pal2 = "слово";
        System.out.println("Результаты второго задания:\n a - " + palindromeCheck(pal1)
                + "\n b - " + palindromeCheck(pal2));

        System.out.println("Результаты третьего задания:\n" + replaceByaka(text));

        System.out.println("Результаты четвёртого задания:\n" + substringCount(text, "the longest"));

        String string = "This is a test string";
        System.out.println("Результаты пятого задания:\n");
        reverstring(string);
    }

    public static String findLongestWord(String text) {
        String[] words = text.split(" ");
        String l = "a";
        for (String word : words) {
            int w = word.length();
            if (l.length() < w) {
                l = word;
            }
        }
        return l;
    }

    public static boolean palindromeCheck(String palindrome) {
        char[] word = palindrome.toCharArray();
        StringBuilder word2 = new StringBuilder();
        for(int i = (word.length-1); i >= 0; i-- ) {
            word2.append(word[i]);
        }
        String result = word2.toString();
        return palindrome.equals(result);
    }

    public static String replaceByaka (String text){
        String[] words = text.split("\\b");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.equalsIgnoreCase("бяка")){
                words[i] = "[вырезано цензурой]";
            }
        }
        for (String word : words){
            builder.append(word);
        }
        return builder.toString();
    }

    public static int substringCount (String text, String str){
        text = text.toLowerCase();
        int p = text.indexOf(str);
        int c = 0;
        for (int i = 0; i < text.length(); i++ ){
            if (text.indexOf(str, i) != -1){
                i = text.indexOf(str, i);
                c++;
            } else break;
        }
        return c;
    }

    public static void reverstring (String string) {
        String[] words = string.split("\\b");
        StringBuilder word2 = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int k = (word.length-1); k >= 0; k--) {
                word2.append(word[k]);
            }
        }
        System.out.print("The given string is: " + string + "\n" +
                "The string reversed word by word is: \n" + word2.toString());
    }
}
