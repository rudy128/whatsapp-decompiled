package X;

import android.util.Base64;
import java.security.MessageDigest;

/* renamed from: X.6vY  reason: invalid class name and case insensitive filesystem */
public abstract class C137496vY {
    public static final String A01(byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        String encodeToString = Base64.encodeToString(bArr, 10);
        C18070vi.A0X(encodeToString);
        return encodeToString;
    }

    public static final String A00(String str, String str2) {
        byte[] digest = MessageDigest.getInstance(str).digest(C108975cc.A1O(str2));
        StringBuilder A10 = AnonymousClass000.A10();
        C18070vi.A0b(digest);
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                A10.append('0');
            }
            A10.append(hexString);
        }
        return C18070vi.A0H(A10);
    }
}
