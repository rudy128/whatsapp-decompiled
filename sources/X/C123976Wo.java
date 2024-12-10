package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.6Wo  reason: invalid class name and case insensitive filesystem */
public abstract class C123976Wo {
    public static final Uri.Builder A00(AnonymousClass64U r2, AnonymousClass72S r3, C26521Sl r4) {
        File A08 = r3.A08();
        if (A08 != null) {
            Long l = r2.A0K;
            if (l != null) {
                r2.A0K = C108995ce.A0T(l);
            }
            r4.A0n(r3.A0C());
            r3.A0N((File) null);
        } else {
            A08 = r3.A0C();
        }
        C17960vV.A07(A08);
        C18070vi.A0X(A08);
        Uri.Builder A06 = C108965cb.A06(A08);
        C18070vi.A0X(A06);
        return A06;
    }
}
