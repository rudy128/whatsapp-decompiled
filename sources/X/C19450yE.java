package X;

import android.util.Base64;

/* renamed from: X.0yE  reason: invalid class name and case insensitive filesystem */
public abstract class C19450yE {
    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        C19460yF r2 = (C19460yF) this;
        objArr[0] = r2.A01;
        objArr[1] = r2.A00;
        byte[] bArr = r2.A02;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
