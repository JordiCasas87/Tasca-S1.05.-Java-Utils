package model;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.InvalidKeyException;

public class EncryptClass {

    private static final String ALGORITHM = "AES";
    private static final String KEY = "9871237653450981";
    
    public static void processFile (int mode, Path inputPath, Path outputPath){
        try{
            Cipher cipher = Cipher.getInstance(ALGORITHM);

            SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(),ALGORITHM);
            
            cipher.init(mode,secretKey);
            
            byte[] inputBytes = Files.readAllBytes(inputPath);
            
            byte[] outputBytesCipher = cipher.doFinal(inputBytes);
            
            Files.write(outputPath,outputBytesCipher);
            
        }catch (IOException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e){
            System.out.println( e.getMessage());
        }catch (Exception e){
            System.out.println("Error inesperado.");
        }
    }

    public static void encrypt(Path inputPath,Path outputPath){
        processFile(Cipher.ENCRYPT_MODE, inputPath, outputPath );
    }

    public static void decrypt(Path inputPath, Path outputPath){
        processFile(Cipher.DECRYPT_MODE, inputPath, outputPath );
    }
}
