package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2iH  reason: invalid class name and case insensitive filesystem */
public class C56942iH {
    public final AnonymousClass1MD[] A00;

    public String A00() {
        if (r6 <= 0) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            StringBuilder A10 = AnonymousClass000.A10();
            for (AnonymousClass1MD r1 : this.A00) {
                A10.append(r1.A02);
                A10.append(r1.A03);
            }
            return Base64.encodeToString(instance.digest(A10.toString().trim().getBytes()), 0);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public C56942iH(AnonymousClass1MD[] r1) {
        this.A00 = r1;
    }
}
