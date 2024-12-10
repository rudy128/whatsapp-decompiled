package X;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: X.6kj  reason: invalid class name and case insensitive filesystem */
public final class C131216kj {
    public final Bitmap A00(Uri uri, C18030ve r8, C25291Nq r9, C24641Lc r10, C26521Sl r11, Integer num, Integer num2, boolean z) {
        int intValue;
        int intValue2;
        C18070vi.A0g(r9, 2, r10);
        int i = 1576;
        if (z) {
            i = 2654;
        }
        C18040vf r5 = C18040vf.A02;
        int A00 = C18020vd.A00(r5, r8, i);
        if (num != null && num2 != null && (intValue = num.intValue()) > 0 && (intValue2 = num2.intValue()) > 0 && C18020vd.A05(r5, r10.A01, 9569)) {
            A00 = Math.min(Math.max(intValue, intValue2), A00);
        }
        if (C18020vd.A05(r5, r8, 8170)) {
            return r9.A07(uri, A00, A00);
        }
        return r11.A0h(uri, A00, A00);
    }
}
