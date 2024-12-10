package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.DVw  reason: case insensitive filesystem */
public final /* synthetic */ class C27135DVw implements Executor {
    public final /* synthetic */ Handler A00;

    public /* synthetic */ C27135DVw(Handler handler) {
        this.A00 = handler;
    }

    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
