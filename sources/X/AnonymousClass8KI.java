package X;

import android.os.Build;

/* renamed from: X.8KI  reason: invalid class name */
public final class AnonymousClass8KI extends C192949pI {
    public static final String A00 = AnonymousClass8BS.A0m("NetworkMeteredCtrlr");

    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        boolean z;
        C194729sC r5 = (C194729sC) obj;
        C18070vi.A0d(r5, 0);
        if (Build.VERSION.SDK_INT < 26) {
            A5Z.A00().A03(A00, "Metered network constraint is not supported before API 26, only checking for connected state.");
            z = r5.A00;
        } else {
            if (r5.A00) {
                z = r5.A01;
            }
            return true;
        }
        if (!z) {
            return true;
        }
        return false;
    }
}
