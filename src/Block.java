import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Obaid on 1/6/2018.
 */
public class Block {

    public Block(String previousHash, String payload) {

        this.previousHash = previousHash;
        this.payload = payload;

        String[] contents = {previousHash, payload};

        this.hash = String.valueOf(Arrays.hashCode(contents));
    }

    private String hash;
    private String previousHash;
    private String payload;

    public String getHash() {
        return hash;
    }

    private void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    private void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getPayload() {
        return payload;
    }

    private void setPayload(String payload) {
        this.payload = payload;
    }

    public void printHash () {
        System.out.println(this.getHash());
    }
}
