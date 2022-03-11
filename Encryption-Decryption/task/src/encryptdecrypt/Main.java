package encryptdecrypt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        String text = scanner.nextLine();
        int number = scanner.nextInt();

        if (option.compareTo("enc") == 0) {
            Encryption encryption = new Encryption();
            System.out.println(encryption.encrypt(text,
                                                  number));
        } else {
            Decryption decryption = new Decryption();
            System.out.println(decryption.decrypt(text,
                                                  number));
        }


    }
}
