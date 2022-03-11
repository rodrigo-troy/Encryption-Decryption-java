package encryptdecrypt;

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
        StringBuilder decrypt = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            int unicode = Character.codePointAt(text,
                                                i);

            if (unicode - number >= 0) {
                decrypt.append(Character.toString(unicode - number));
            } else {
                decrypt.append(Character.toString(255 + (unicode - number)));
            }
        }

        return decrypt.toString();
    }
}
