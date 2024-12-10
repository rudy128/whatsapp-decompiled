package X;

import android.os.Handler;

/* renamed from: X.Crs  reason: case insensitive filesystem */
public class C26078Crs {
    public static final Handler A00 = C17890vO.A0D();

    public static void A00(Runnable runnable) {
        if (AnonymousClass000.A1Z(BE8.A0k(), Thread.currentThread())) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }

    public static void A01(String str) {
        Thread A0k = BE8.A0k();
        Thread currentThread = Thread.currentThread();
        if (AnonymousClass000.A1Z(A0k, currentThread)) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" Current thread: ");
            throw new IllegalThreadStateException(AnonymousClass000.A0y(currentThread.getName(), A11));
        }
    }
}
