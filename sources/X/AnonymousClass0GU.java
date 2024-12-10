package X;

import android.os.Looper;

/* renamed from: X.0GU  reason: invalid class name */
public abstract class AnonymousClass0GU {
    public static final long A00;
    public static final C18100vl A01 = AnonymousClass1DF.A01(C08950fv.A00);

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        A00 = j;
    }
}
