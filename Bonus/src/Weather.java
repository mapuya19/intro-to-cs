import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        System.out.print("Enter a ZipCode: ");
        String zipCode = new Scanner(System.in).next();
        String useURL = "http://www.rssweather.com/zipcode/" + zipCode + "/rss.php";

        try {
            URL url = new URL(useURL);
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                if (input.nextLine().contains("<item>")) {
                    String read = input.nextLine();
                    // System.out.println(read);
                    String title = read.substring(read.indexOf("<title>") + 7, read.indexOf("</title>"));
                    if (title.contains("Weather")) {
                        System.out.println();
                    }
                    else {
                        System.out.println(title);
                    }

                    input.nextLine();

                    if (input.nextLine().contains("<link>")) {
                        String read2 = input.nextLine();
                        String desc = read2.substring(read2.indexOf("<description>") + 13, read2.indexOf("</description>"));
                        System.out.println(desc);
                        System.out.println();
                    }
                }
            }
        }

        catch (MalformedURLException e) {
            System.out.println("Invalid URL!");
        }

        catch (java.io.IOException e) {
            System.out.println("IO Errors");
        }
    }
}
