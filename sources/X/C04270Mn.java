package X;

import android.os.Looper;

/* renamed from: X.0Mn  reason: invalid class name and case insensitive filesystem */
public final class C04270Mn {
    public static final C18560wh A00() {
        return (C18560wh) C15290qO.A0C.getValue();
    }

    public final C18560wh A01() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return A00();
        }
        C18560wh r0 = (C18560wh) C15290qO.A0B.get();
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0n("no AndroidUiDispatcher for this thread");
    }
}
