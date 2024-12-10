package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class CMD {
    public SecureRandom A00;

    public CMD() {
        try {
            this.A00 = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            throw BEA.A0X("SHA1PRNGalgorithm not found.");
        }
    }
}
