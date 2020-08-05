import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    //Try to extract /images/NASA-logosmall.gif or  /images/NASA-logosmall.GIF for any get request from the following log

    public static void main(String[] args) {
        String s1 = "burger.letters.com - - [01Jul1996:00:00:12 -0400] 'GET /images/NASA-logosmall.gif' HTTP/1.0";
        String s2 = "burger.letters.com - - [01Jul1996:00:00:12 -0400] 'GET /images/NASA-logosmall.GIF' HTTP/1.0";

        Pattern p = Pattern.compile("(.*)(GET\\s)(.*\\.GIF|.*\\.gif)(.*)");
        Matcher m = p.matcher(s2);
        if (m.find()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
            System.out.println(m.group(4));
        } else {
            System.out.println("no match");
        }
    }
}
