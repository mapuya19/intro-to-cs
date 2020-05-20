import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args){
        System.out.print("Enter a URL: ");
        String useURL = new Scanner(System.in).next();

        try {
            URL url = new URL(useURL);
            Scanner input = new Scanner(url.openStream());
            int countChar = 0;
            int countCharNoSpace = 0;
            int countWords = 0;
            int countUniqueWords = 0;
            int countLines = 0;

            while (input.hasNext()) {
                String line = input.nextLine();
                countChar += line.length();
                countLines++;

                String lineNoSpace = line.replaceAll("\\s+", "");
                countCharNoSpace += lineNoSpace.length();

                ArrayList<String> listWords = new ArrayList<String>();
                String[] listWordsAdd = line.split("\\s+");
                for (String word : listWordsAdd) {
                    listWords.add(word);
                }
                countWords += listWordsAdd.length;

                ArrayList<String> listUniqueWords = new ArrayList<String>();
                for (String word : listWords) {
                    if (!listUniqueWords.contains(word)) {
                        listUniqueWords.add(word);
                        countUniqueWords++;
                    }
                }
            }

            System.out.println(countChar + " characters");
            System.out.println(countCharNoSpace + " characters ignoring spaces");
            System.out.println(countWords + " words");
            System.out.println(countUniqueWords + " unique words");
            System.out.println(countLines + " lines");
        }
        catch (MalformedURLException e) {
            System.out.println("Invalid URL!");
        }

        catch (java.io.IOException e) {
            System.out.println("IO Errors");
        }
    }
}
