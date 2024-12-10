package X;

import android.app.Activity;
import android.os.Build;

/* renamed from: X.4Wl  reason: invalid class name and case insensitive filesystem */
public final class C87664Wl {
    public final C219217x A00;
    public final AnonymousClass1MZ A01;
    public final AnonymousClass00H A02;

    public static final void A00(Activity activity) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            i = 2131894442;
        } else {
            i = 2131894445;
            if (i2 < 33) {
                i = 2131894444;
            }
        }
        if (!activity.isFinishing()) {
            activity.startActivityForResult(AnonymousClass74O.A03(activity, 2131894443, i, false), 151);
        }
    }

    public C87664Wl(C219217x r1, AnonymousClass1MZ r2, AnonymousClass00H r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
