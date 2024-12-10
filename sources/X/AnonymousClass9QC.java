package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9QC  reason: invalid class name */
public abstract class AnonymousClass9QC {
    public static byte[] A00(byte[] bArr, byte[] bArr2) {
        return AnonymousClass8BX.A0p(DefaultCrypto.HMAC_SHA256, bArr2).doFinal(bArr);
    }
}
