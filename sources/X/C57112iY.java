package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.2iY  reason: invalid class name and case insensitive filesystem */
public class C57112iY {
    public final Handler A00;
    public final Executor A01;

    public C57112iY() {
        Handler A0D = C17890vO.A0D();
        this.A00 = A0D;
        this.A01 = new AnonymousClass3DL(A0D, 0);
    }

    public void A00(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
