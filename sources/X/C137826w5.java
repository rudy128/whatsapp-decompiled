package X;

import android.content.Intent;

/* renamed from: X.6w5  reason: invalid class name and case insensitive filesystem */
public final class C137826w5 {
    public final AnonymousClass00H A00;

    public C137826w5(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(Intent intent, C18030ve r3, String str, String str2) {
        C18070vi.A0d(r3, 3);
        if (C18020vd.A05(C18040vf.A02, r3, 508)) {
            if (!(str == null || str.length() == 0)) {
                intent.putExtra("entry_point_conversion_source", str);
            }
            if (str2 != null && str2.length() != 0) {
                intent.putExtra("entry_point_conversion_app", str2);
            }
        }
    }
}
