package X;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.CXp  reason: case insensitive filesystem */
public class C25097CXp {
    public byte[] A00(byte[] bArr, byte[] bArr2) {
        String replace = "SHA-256".replace("-", "");
        try {
            Mac instance = Mac.getInstance(C17900vP.A0A("Hmac", replace));
            instance.init(new SecretKeySpec(bArr, C17900vP.A0A("Hmac", replace)));
            return instance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public byte[] A01(byte[] bArr, byte[] bArr2, int i) {
        String replace = "SHA-256".replace("-", "");
        try {
            int A03 = BE7.A03((double) i, 32.0d);
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream A15 = C108945cZ.A15();
            for (int i2 = 1; i2 < A03 + 1; i2++) {
                Mac instance = Mac.getInstance(C17900vP.A0A("Hmac", replace));
                instance.init(new SecretKeySpec(bArr, C17900vP.A0A("Hmac", replace)));
                instance.update(bArr3);
                if (bArr2 != null) {
                    instance.update(bArr2);
                }
                instance.update((byte) i2);
                bArr3 = instance.doFinal();
                int min = Math.min(i, bArr3.length);
                A15.write(bArr3, 0, min);
                i -= min;
            }
            return A15.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
