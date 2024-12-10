package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.DVy  reason: case insensitive filesystem */
public final class C27137DVy implements Executor {
    public final Handler A00;

    public void execute(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public C27137DVy(Handler handler) {
        this.A00 = handler;
    }
}
