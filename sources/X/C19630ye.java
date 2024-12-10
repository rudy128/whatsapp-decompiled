package X;

import android.util.Base64;

/* renamed from: X.0ye  reason: invalid class name and case insensitive filesystem */
public abstract class C19630ye {
    public static String A00(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
