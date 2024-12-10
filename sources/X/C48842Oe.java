package X;

import android.os.Build;

/* renamed from: X.2Oe  reason: invalid class name and case insensitive filesystem */
public final class C48842Oe extends AnonymousClass38J {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48842Oe(AnonymousClass118 r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
    }

    public boolean Bh4() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return false;
    }
}
