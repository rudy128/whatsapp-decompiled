package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: X.A5h  reason: case insensitive filesystem */
public abstract class C20058A5h {
    public static byte[][] A03(byte[] bArr, byte[] bArr2) {
        return A8G.A06(A02(bArr, bArr2, (byte[]) null, 64), 32, 32);
    }

    public static byte[] A00(byte[] bArr, byte[] bArr2, int i) {
        try {
            return A01(AnonymousClass9QC.A00(bArr, new byte[32]), bArr2, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2, int i) {
        try {
            int ceil = (int) Math.ceil(((double) i) / 32.0d);
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A15 = C108945cZ.A15();
            for (int i2 = 1; i2 < ceil + 1; i2++) {
                Mac A0p = AnonymousClass8BX.A0p(DefaultCrypto.HMAC_SHA256, bArr);
                A0p.update(bArr3);
                if (bArr2 != null) {
                    A0p.update(bArr2);
                }
                A0p.update((byte) i2);
                bArr3 = A0p.doFinal();
                int min = Math.min(i, bArr3.length);
                A15.write(bArr3, 0, min);
                i -= min;
            }
            return A15.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            return A01(AnonymousClass9QC.A00(bArr, bArr2), bArr3, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
