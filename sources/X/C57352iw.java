package X;

import android.app.Activity;

/* renamed from: X.2iw  reason: invalid class name and case insensitive filesystem */
public final class C57352iw {
    public C23661Hd A00;
    public AnonymousClass19D A01;

    public final void A00(Activity activity) {
        String str;
        AnonymousClass19D r2 = this.A01;
        if (r2 == null) {
            str = "abPreChatdProps";
        } else if (C18020vd.A05(C18040vf.A02, r2, 8504)) {
            C23661Hd r0 = this.A00;
            if (r0 != null) {
                if (!r0.A01()) {
                    C23661Hd r1 = this.A00;
                    if (r1 != null) {
                        if (!r1.A02(true)) {
                            activity.setRequestedOrientation(1);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            str = "deviceUtils";
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }
}
