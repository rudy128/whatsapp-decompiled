package X;

import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: X.2oJ  reason: invalid class name and case insensitive filesystem */
public class C60602oJ {
    public static String A00(Map map) {
        AnonymousClass2QU r1 = new AnonymousClass2QU(map);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            do {
            } while (new DigestInputStream(r1, instance).read() != -1);
            return C17970vW.A07(instance.digest());
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
