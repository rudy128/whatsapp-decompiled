package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.11A  reason: invalid class name */
public class AnonymousClass11A implements AnonymousClass119 {
    public final Handler A00;
    public final Executor A01;

    public void A00(Runnable runnable) {
        this.A00.post(runnable);
    }

    public AnonymousClass11A() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A00 = handler;
        this.A01 = new AnonymousClass3DL(handler, 0);
    }

    public void CGP(Runnable runnable) {
        if (C22781De.A03()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
