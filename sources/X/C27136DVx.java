package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.DVx  reason: case insensitive filesystem */
public class C27136DVx implements Executor {
    public final Handler A00;

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }

    public C27136DVx(Looper looper) {
        this.A00 = new BG7(looper);
    }
}
