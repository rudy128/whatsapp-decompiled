package X;

import android.os.Build;

/* renamed from: X.8KG  reason: invalid class name */
public final class AnonymousClass8KG extends C192949pI {
    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        C194729sC r5 = (C194729sC) obj;
        C18070vi.A0d(r5, 0);
        int i = Build.VERSION.SDK_INT;
        boolean z = r5.A00;
        if (i >= 26) {
            if (!z) {
                return true;
            }
            z = r5.A03;
        }
        if (z) {
            return false;
        }
        return true;
    }
}
