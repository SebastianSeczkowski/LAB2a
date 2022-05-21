package pl.lublin.wsei.java.cwiczenia.test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class TestRegEx {
    public static void main(String[] args) {
        String exItem = "\t\t<item>\n" +
                "\t\t\t<title><!CDATA[Infografika - Powszechny Spis Ludności 1921]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Tue, 17 May 2022 14:20:00 +0200]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-swiatowy-dzien-spoleczenstwa-informacyjnego-17-maja,117,1.html</link>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/117/1/1/spoleczenstwoinformacyjne_infografika_pl.png\" type=\"image/png\" width=\"1876\" height=\"2855\">\n" +
                "\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/117/1/1/spoleczenstwoinformacyjne_infografika_pl,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/117/1/1/spoleczenstwoinformacyjne_infografika_pl,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description> \n" +
                "\t\t\t</item>" +

                Pattenr pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(exItem);
        if (m.find())
            System.out.println("Znaleziono tytuł: "+m.group(1));
        else
            System.out.println("Nie znaleziono tytułu ...");
    }
}
