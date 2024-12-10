package X;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6vs  reason: invalid class name and case insensitive filesystem */
public abstract class C137696vs {
    public static final AtomicInteger A00 = new AtomicInteger(1);

    public static final C25238CbZ A00(Uri uri, Uri uri2, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C18070vi.A0d(uri, 0);
        if (str == null) {
            str = String.valueOf(A00.addAndGet(1));
        }
        D47 A002 = D47.A00(uri, uri2, str, C17880vN.A11());
        C24275ByY byY = C24275ByY.IN_PLAY;
        Integer num = AnonymousClass00R.A00;
        return new C25238CbZ(new D43(), byY, new C26551D3p(), A002, num, 0, i, true, z4, z, z3, z2);
    }
}
