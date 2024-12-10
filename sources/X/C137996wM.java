package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6wM  reason: invalid class name and case insensitive filesystem */
public class C137996wM {
    public MessageDigest A00;
    public final AnonymousClass73L A01;

    public static synchronized MessageDigest A00(C137996wM r3) {
        MessageDigest messageDigest;
        synchronized (r3) {
            messageDigest = r3.A00;
            if (messageDigest == null) {
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                    r3.A00 = messageDigest;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(AnonymousClass001.A1E(e, "ABOfflineAssign assign will fail due to MD5 algorithm not found: ", AnonymousClass000.A10()));
                }
            }
        }
        return messageDigest;
    }

    public C137996wM(AnonymousClass73L r1) {
        this.A01 = r1;
    }
}
