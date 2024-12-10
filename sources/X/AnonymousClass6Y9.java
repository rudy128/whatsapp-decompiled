package X;

import java.security.PublicKey;

/* renamed from: X.6Y9  reason: invalid class name */
public abstract class AnonymousClass6Y9 {
    public static final boolean A00(C1606789m r2, Integer num, PublicKey publicKey) {
        if (publicKey == null) {
            C108965cb.A1D(r2, "null password key");
            return false;
        } else if (num != null) {
            return true;
        } else {
            C108965cb.A1D(r2, "null password id");
            return false;
        }
    }
}
