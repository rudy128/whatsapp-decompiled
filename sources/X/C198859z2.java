package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: X.9z2  reason: invalid class name and case insensitive filesystem */
public abstract class C198859z2 {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.9z2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.9z2, java.lang.Object] */
    public static C198859z2 A00(int i) {
        if (i == 2) {
            return new Object();
        }
        if (i == 3) {
            return new Object();
        }
        throw AnonymousClass8BR.A0v(AnonymousClass001.A1I("Unknown version: ", AnonymousClass000.A10(), i));
    }

    public static byte[] A01(C198859z2 r9, byte[] bArr, byte[] bArr2, int i) {
        int i2;
        try {
            int ceil = (int) Math.ceil(((double) i) / 32.0d);
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A15 = C108945cZ.A15();
            if (r9 instanceof B4D) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i3 = i2;
            while (i2 < i3 + ceil) {
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
                i2++;
            }
            return A15.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, int i) {
        try {
            return A01(this, AnonymousClass8BX.A0p(DefaultCrypto.HMAC_SHA256, new byte[32]).doFinal(bArr), bArr2, i);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
