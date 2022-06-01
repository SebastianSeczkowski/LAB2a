package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Testinfografika {
    public static void main(String[] args) {
        String exItem = "\t\t<item>\n" +
                "\t\t\t<title><!CDATA[Infografika]]></title>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-powszechny-spis-ludnosci-1921,101,1.html</link>\n" +
                "\t\t\t</item>";

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(exItem);
        if (m.find())
            System.out.println("Znaleziono tytuł: " + m.group(1));
        else
            System.out.println("Nie znaleziono tytułu ...");
    }

}