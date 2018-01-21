import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Obaid on 1/21/2018.
 */
public class Hasher {

    public static String hash(String input, String algo) {
        byte [] inputArray = input.getBytes();
        String value = "";

        try {
            MessageDigest md = MessageDigest.getInstance(algo);
            md.update(inputArray);
            value = DatatypeConverter.printHexBinary(md.digest()).toLowerCase();
        } catch (NoSuchAlgorithmException nsaex) {
            System.out.print(nsaex);
        }

        return value;
    }

    public static void main (String[] arg) {
        System.out.print(hash("myPassword", HashAlgorithms.SHA256.getName()));
    }

}
