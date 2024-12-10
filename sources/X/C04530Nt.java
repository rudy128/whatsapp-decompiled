package X;

import android.os.Build;

/* renamed from: X.0Nt  reason: invalid class name and case insensitive filesystem */
public final class C04530Nt {
    public static final /* synthetic */ C04530Nt A00 = new Object();

    public static final C17070th A00() {
        C17070th r0;
        if (C04850Pe.A03()) {
            if (Build.VERSION.SDK_INT == 28) {
                r0 = AnonymousClass0UM.A00;
            } else {
                r0 = AnonymousClass0UN.A00;
            }
            return r0;
        }
        throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
    }
}
