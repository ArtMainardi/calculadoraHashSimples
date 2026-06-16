import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCreator {
    public String hashing(String origem){
        try{
            MessageDigest hash = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = hash.digest(origem.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();
            for(byte b : hashBytes){
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0'); // Garante que cada byte tenha 2 caracteres
                }
                hexString.append(hex);
            }

            String hashFinal = hexString.toString();
            return hashFinal;
        } catch (NoSuchAlgorithmException e){
            System.err.println("Algoritmo de hash não encontrado: " + e.getMessage());
            return "ERROR";
        }
    }
}
