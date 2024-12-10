package X;

import android.util.Base64;

/* renamed from: X.1fN  reason: invalid class name and case insensitive filesystem */
public final class C31321fN {
    public final C19830z4 A00;

    public C31321fN(C19830z4 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(byte[] bArr) {
        C18070vi.A0d(bArr, 0);
        if (bArr.length <= 256) {
            C19830z4 r1 = this.A00;
            C19830z4.A00(r1).putString("routing_info", Base64.encodeToString(bArr, 3)).apply();
            return;
        }
        throw new IllegalArgumentException("The routing info should be smaller than 256 bytes.");
    }
}
