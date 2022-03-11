package encryptdecrypt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = scanner.nextInt();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<String> alphabetArray = Arrays.asList(alphabet.split(""));
        StringBuilder encrypt = new StringBuilder();

        for (int i = 0; i < text.split("").length; i++) {
            char c = text.charAt(i);
            int indexOf = alphabetArray.indexOf(String.valueOf(c));

            if (indexOf < 0) {
                encrypt.append(c);
                continue;
            }

            if (indexOf + number > alphabetArray.size() - 1) {
                encrypt.append(alphabetArray.get(indexOf + number - alphabetArray.size()));
            } else {
                encrypt.append(alphabetArray.get(indexOf + number));
            }
        }

        System.out.println(encrypt);
    }
}
