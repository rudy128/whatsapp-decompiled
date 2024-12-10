package X;

import android.os.Build;

/* renamed from: X.8KJ  reason: invalid class name */
public final class AnonymousClass8KJ extends C192949pI {
    public static final String A00 = AnonymousClass8BS.A0m("NetworkNotRoamingCtrlr");

    public /* bridge */ /* synthetic */ boolean A02(Object obj) {
        boolean z;
        C194729sC r5 = (C194729sC) obj;
        C18070vi.A0d(r5, 0);
        if (Build.VERSION.SDK_INT < 24) {
            A5Z.A00().A03(A00, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            z = r5.A00;
        } else {
            if (r5.A00) {
                z = r5.A02;
            }
            return true;
        }
        if (!z) {
            return true;
        }
        return false;
    }
}
