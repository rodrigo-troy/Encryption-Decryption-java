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
public class Decryption {
    public String decrypt(String text,
                          int number) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<String> alphabetArray = Arrays.asList(alphabet.split(""));
        StringBuilder decrypt = new StringBuilder();

        for (int i = 0; i < text.split("").length; i++) {
            char c = text.charAt(i);
            int indexOf = alphabetArray.indexOf(String.valueOf(c));

            if (indexOf < 0) {
                decrypt.append(c);
                continue;
            }

            if (indexOf - number > 0) {
                decrypt.append(alphabetArray.get(indexOf - number));
            } else {
                decrypt.append(alphabetArray.get(number + alphabetArray.size() - indexOf));
            }
        }

        return decrypt.toString();
    }
}
