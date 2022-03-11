package encryptdecrypt;

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
        StringBuilder encrypt = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            int unicode = Character.codePointAt(text,
                                                i);

            if (unicode + number > 255) {
                encrypt.append(Character.toString(unicode + number - 255));
            } else {
                encrypt.append(Character.toString(unicode + number));
            }
        }

        return encrypt.toString();
    }
}
