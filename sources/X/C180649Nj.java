package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.9Nj  reason: invalid class name and case insensitive filesystem */
public final class C180649Nj {
    public byte[] A00;

    public final void A00(byte[] bArr) {
        try {
            MessageDigest A1I = C108945cZ.A1I();
            A1I.update(this.A00);
            byte[] digest = A1I.digest(bArr);
            C18070vi.A0X(digest);
            this.A00 = digest;
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
