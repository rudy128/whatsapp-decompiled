package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.2hG  reason: invalid class name and case insensitive filesystem */
public class C56312hG {
    public void A00(byte[] bArr) {
        try {
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
