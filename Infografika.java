package pl.lublin.wsei.java.cwiczenia;

public Infografika(String tekst){
    Pattern pat = Pattern.compile("<title><!\\]CDATA]\\[(.*)\\]\\]");
    Matcher m = pat.matcher(tekst);
    if (m.find())
        tytul = m.group(1);
    else
        tytul = "";
    
    pat = Pattern.compile("<link>(.*)</link>");
    m = pat.matcher(tekst);
    if (m.find())
        adresStrony = m.group(1);
    else
        adresStrony = "";
    
    pat = Pattern.compile("width=\"(.*)\" height");
    m = pat.matcher (tekst);
    if (m.find())
        szerokosc = Integer.parseInt(m.group(1));
    else
        szerokosc = 0;
}
