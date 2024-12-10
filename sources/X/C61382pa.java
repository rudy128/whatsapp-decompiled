package X;

import java.security.SecureRandom;

/* renamed from: X.2pa  reason: invalid class name and case insensitive filesystem */
public class C61382pa {
    public final long A00;
    public final byte[] A01;

    public static boolean A00(C61382pa r4, long j) {
        if (j - r4.A00 < ((long) new SecureRandom().nextInt(86400000)) + 172800000) {
            return true;
        }
        return false;
    }

    public C61382pa(byte[] bArr, long j) {
        C17960vV.A0D(AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        this.A01 = bArr;
        this.A00 = j;
    }
}
