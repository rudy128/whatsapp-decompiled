package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0LU  reason: invalid class name */
public abstract class AnonymousClass0LU {
    public static final Handler A00 = new Handler(Looper.getMainLooper());

    public static void A00(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }
}
