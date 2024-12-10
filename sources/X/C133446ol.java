package X;

import java.io.ByteArrayInputStream;
import java.io.File;

/* renamed from: X.6ol  reason: invalid class name and case insensitive filesystem */
public final class C133446ol {
    public final AnonymousClass00H A00;

    public C133446ol(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A01(String str) {
        C18070vi.A0d(str, 0);
        String A0Z = C108995ce.A0Z(str);
        C18070vi.A0d(A0Z, 0);
        File A002 = C138926xv.A00((C138926xv) C18070vi.A0E(this.A00), A0Z);
        if (A002 != null) {
            C64062u9.A0Q(A002);
        }
    }

    public final File A00(AnonymousClass725 r4, byte[] bArr) {
        String A0Z = C108995ce.A0Z(AnonymousClass725.A00(r4));
        C18070vi.A0d(A0Z, 0);
        File A002 = C138926xv.A00((C138926xv) C18070vi.A0E(this.A00), A0Z);
        if (A002 == null || !C64062u9.A0T(A002, new ByteArrayInputStream(bArr))) {
            return null;
        }
        return A002;
    }
}
