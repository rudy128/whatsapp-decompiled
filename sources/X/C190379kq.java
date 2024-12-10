package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.9kq  reason: invalid class name and case insensitive filesystem */
public class C190379kq {
    public final byte[] A00;
    public final C198859z2 A01;

    public C58472kk A00(C21344AiX aiX, C185259cI r8) {
        byte[] A03 = C20065A5o.A03(r8.A00, aiX);
        C198859z2 r4 = this.A01;
        byte[] bArr = this.A00;
        try {
            byte[][] A012 = C20011A3b.A01(C198859z2.A01(r4, AnonymousClass8BX.A0p(DefaultCrypto.HMAC_SHA256, bArr).doFinal(A03), "WhisperRatchet".getBytes(), 64), 32, 32);
            return new C58472kk(new C190379kq(r4, A012[0]), new A4X(r4, A012[1], 0));
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public C190379kq(C198859z2 r1, byte[] bArr) {
        this.A01 = r1;
        this.A00 = bArr;
    }
}
