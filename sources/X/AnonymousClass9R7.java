package X;

import java.security.PublicKey;

/* renamed from: X.9R7  reason: invalid class name */
public abstract class AnonymousClass9R7 {
    public static String A00(PublicKey publicKey) {
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = AnonymousClass8BT.A0x(C108945cZ.A1I().digest(publicKey.getEncoded()));
        return String.format("fp:%s", A1a);
    }
}
