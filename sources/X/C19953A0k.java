package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.A0k  reason: case insensitive filesystem */
public class C19953A0k {
    public static final byte[] A02 = {2};
    public static final byte[] A03 = {1};
    public final int A00;
    public final byte[] A01;

    public C19953A0k A00() {
        try {
            return new C19953A0k(this.A00 + 1, AnonymousClass8BX.A0p(DefaultCrypto.HMAC_SHA256, this.A01).doFinal(A02));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public C187059fC A01() {
        try {
            return new C187059fC(this.A00, AnonymousClass8BX.A0p(DefaultCrypto.HMAC_SHA256, this.A01).doFinal(A03));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public C19953A0k(int i, byte[] bArr) {
        this.A00 = i;
        this.A01 = bArr;
    }
}
