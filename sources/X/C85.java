package X;

import android.util.Log;
import java.util.UUID;

public abstract class C85 {
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.Cui] */
    public static CPA A00(byte[] bArr) {
        ? obj = new Object();
        obj.A02 = bArr;
        int length = bArr.length;
        obj.A00 = length;
        if (length >= 32 && C26207Cui.A02(obj, 0) == (obj.A00 - obj.A01) + 4 && obj.A03() == 1886614376) {
            int A03 = (obj.A03() >> 24) & 255;
            if (A03 > 1) {
                Log.w("PsshAtomUtil", AnonymousClass001.A1I("Unsupported pssh version: ", AnonymousClass000.A10(), A03));
            } else {
                UUID uuid = new UUID(obj.A08(), obj.A08());
                if (A03 == 1) {
                    obj.A0J(obj.A05() * 16);
                }
                int A05 = obj.A05();
                if (A05 == obj.A00 - obj.A01) {
                    byte[] bArr2 = new byte[A05];
                    obj.A0K(bArr2, 0, A05);
                    return new CPA(uuid, bArr2, A03);
                }
            }
        }
        return null;
    }
}
