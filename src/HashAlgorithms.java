/**
 * Created by Obaid on 1/22/2018.
 */
public enum HashAlgorithms {
    SHA256("SHA-256"),
    MD5("MD5");

    private final String name;

    HashAlgorithms(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
