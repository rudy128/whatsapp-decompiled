package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.0J4  reason: invalid class name */
public final class AnonymousClass0J4 {
    public void A01(String str) {
        C18070vi.A0d(str, 0);
        if (AnonymousClass0GK.A00) {
            Trace.beginSection(str);
        }
    }

    public void A00() {
        if (AnonymousClass0GK.A00) {
            Trace.endSection();
        }
    }

    public boolean A02() {
        if (!AnonymousClass0GK.A00) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29 || Trace.isEnabled()) {
            return true;
        }
        return false;
    }
}
