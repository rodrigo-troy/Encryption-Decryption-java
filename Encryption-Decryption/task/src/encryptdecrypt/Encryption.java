package encryptdecrypt;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * $ Project: Encryption-Decryption
 * User: rodrigotroy
 * Date: 11-03-22
 * Time: 16:14
 */
public class Encryption {
    public String encrypt(String text,
                          int number) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<String> alphabetArray = Arrays.asList(alphabet.split(""));
        StringBuilder encrypt = new StringBuilder();

        for (int i = 0; i < text.split("").length; i++) {
            char c = text.charAt(i);
            int unicode = (int) c;
            System.out.println(unicode);

        /*    int indexOf = alphabetArray.indexOf(String.valueOf(c));

            if (indexOf < 0) {
                encrypt.append(c);
                continue;
            }

            if (indexOf + number > alphabetArray.size() - 1) {
                encrypt.append(alphabetArray.get(indexOf + number - alphabetArray.size()));
            } else {
                encrypt.append(alphabetArray.get(indexOf + number));
            }*/
        }

        return encrypt.toString();
    }
}
