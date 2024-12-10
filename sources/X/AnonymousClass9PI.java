package X;

import android.util.Base64;

/* renamed from: X.9PI  reason: invalid class name */
public abstract class AnonymousClass9PI {
    public static String A00(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AesKey=");
        A10.append(Base64.encodeToString(bArr2, 2));
        A10.append(";IV=");
        A10.append(Base64.encodeToString(bArr3, 2));
        A10.append(";Data=");
        return AnonymousClass000.A0y(Base64.encodeToString(bArr, 2), A10);
    }
}
