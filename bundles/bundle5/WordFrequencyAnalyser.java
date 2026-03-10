import java.util.*;

class Main {
    public static void main(String[] args) {

        String str = "Java is good and java is faster";

        String sentence = str.toLowerCase();

        String[] words = sentence.split(" ");

        boolean visited[] = new boolean[words.length];

        int maxCount = 0;
        String maxWord = "";

        StringBuilder report = new StringBuilder();

        report.append("Word Frequency Report\n");
        report.append("----------------------\n");

        for (int i = 0; i < words.length; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            report.append(words[i]).append(" : ").append(count).append("\n");

            if (count > maxCount) {
                maxCount = count;
                maxWord = words[i];
            }
        }

        System.out.println(report);

        System.out.println("Most frequent word: " + maxWord + " (" + maxCount + " times)");
    }
}