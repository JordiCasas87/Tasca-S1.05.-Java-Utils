

package main;

import model.EncryptClass;
import java.nio.file.Path;

    public class AppMain {

        public static void main(String[] args) {

            Path inputPath = Path.of("/Users/jcasas87/Desktop/Astrofisica.txt");
            Path outputPath = Path.of("/Users/jcasas87/Desktop/AstrofisicaCRYPTO.encrypted");

            Path decryptedPath = Path.of("/Users/jcasas87/Desktop/Astrofisica_decrypted.txt");

            EncryptClass.encrypt(inputPath, outputPath);
            EncryptClass.decrypt(outputPath, decryptedPath);

            System.out.println("Cifrado y descifrado completados correctamente.");
        }
    }




